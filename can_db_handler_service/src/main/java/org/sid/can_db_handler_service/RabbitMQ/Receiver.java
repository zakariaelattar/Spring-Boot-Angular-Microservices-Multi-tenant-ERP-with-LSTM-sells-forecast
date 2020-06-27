package org.sid.can_db_handler_service.RabbitMQ;



import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.sid.can_db_handler_service.Entities.Product.Product;
import org.sid.can_db_handler_service.Repositories.Product.ProductRepository;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Receiver implements MessageListener {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    Producer producer;

    @RabbitListener(bindings = @QueueBinding(
                                              value = @Queue(value = "database", durable = "false"),
                                              exchange = @Exchange(value = "spring-boot-exchange", type = ExchangeTypes.TOPIC, durable = "true")
                                               )
                   )


    public void onReceive(String ref) {

        switch(ref)
        {
            case "*":
                List<Product> productList;
                try
                {
                    productList = productRepository.findAll();
                    producer.produce(productList);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                finally {
                    productList = null;
                }
                break;

            default:
                Product p;
                try
                {
                  p = productRepository.findProductByRef(ref);
                    producer.produce(p);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                finally {
                    p = null;
                }
        }
        System.out.println("Received <" + ref + ">");
       // latch.countDown();

    }
    private CountDownLatch latch = new CountDownLatch(1);

    public CountDownLatch getLatch() {
        return latch;
    }


    @Override
    public void onMessage(Message message) {

    }
}
