package org.sid.can_db_handler_service.Services;


import org.sid.can_db_handler_service.Entities.Product.Product;
import org.sid.can_db_handler_service.RabbitMQ.Producer;
import org.sid.can_db_handler_service.RabbitMQ.Receiver;
import org.sid.can_db_handler_service.Repositories.Product.ProductRepository;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMQ {


    @Autowired
    RabbitTemplate rabbitTemplate;

    @Autowired
    Producer producer;

    @Autowired
    Receiver receiver;

    @Autowired
    ProductRepository productRepository;


    @RequestMapping(value = "/send",method = RequestMethod.POST)

    public void Send()
    {

        Product p = productRepository.findProductByRef("pro1");
        System.out.println(p);
        System.out.println("Sending message to the queue Database From db_handler microservice...");
        try
        {
        producer.produce(p);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

//        System.out.println("Sending message to the queue product...");
        //rabbitTemplate.convertAndSend("spring-boot-exchange", "product.a", "Hello from DATABASE SERVICE!");
    }

}
