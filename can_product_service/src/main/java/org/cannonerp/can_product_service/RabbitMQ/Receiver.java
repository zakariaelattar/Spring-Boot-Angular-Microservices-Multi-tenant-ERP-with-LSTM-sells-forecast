package org.cannonerp.can_product_service.RabbitMQ;


import org.cannonerp.can_product_service.Entities.Product;
import org.cannonerp.can_product_service.Services.ProductService;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CountDownLatch;

@Component
public class Receiver implements MessageListener {
  /*  @RabbitListener(bindings = @QueueBinding(
                                              value = @Queue(value = "database", durable = "false"),
                                              exchange = @Exchange(value = "spring-boot-exchange", type = ExchangeTypes.TOPIC, durable = "true")
                                               )
                   )


    public void onReceive(Product product) {
        System.out.println("Received <" + product + ">");
       // latch.countDown();
    }*/
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "database", durable = "false"),
            exchange = @Exchange(value = "spring-boot-exchange", type = ExchangeTypes.TOPIC, durable = "true")
    )
    )
    public void onReceive(List<Product> products) {
        System.out.println("Received <" + products + ">");
        List<Product> list = products;
        ProductService.list=list;
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
