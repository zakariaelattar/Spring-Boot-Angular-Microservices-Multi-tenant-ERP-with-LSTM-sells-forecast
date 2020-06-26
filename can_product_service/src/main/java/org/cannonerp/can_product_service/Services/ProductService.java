package org.cannonerp.can_product_service.Services;


import org.cannonerp.can_product_service.Entities.Product;
import org.cannonerp.can_product_service.RabbitMQ.Producer;
import org.cannonerp.can_product_service.RabbitMQ.Receiver;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@RestController
public class ProductService {

    public static List<Product> list = null;
    //  final static List<Product> list = null;
    @Autowired
    RabbitTemplate rabbitTemplate;

    @Autowired
    Producer producer;

    @Autowired
    Receiver receiver;

    private CountDownLatch latch = new CountDownLatch(1);

    public CountDownLatch getLatch() {
        return latch;
    }


    @RequestMapping(value = "/get",method = RequestMethod.GET)

    public void get(@RequestParam("ref") String ref)
    {

        System.out.println("Sending message to the queue Database From product microservice...");
        try
        {
            producer.produce(ref);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

//        System.out.println("Sending message to the queue product...");
        //rabbitTemplate.convertAndSend("spring-boot-exchange", "product.a", "Hello from DATABASE SERVICE!");
    }
    /**
     *  Get all products
     * */
    @RequestMapping(value = "/getAll",method = RequestMethod.GET)

    public List<Product> getAll()
    {

        System.out.println("Sending message to the queue Database From product microservice...");
        try
        {
            producer.produce("*");
            this.getLatch().await(500, TimeUnit.MILLISECONDS);
            System.out.println(list);
        return list;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
return list;
//        System.out.println("Sending message to the queue product...");
        //rabbitTemplate.convertAndSend("spring-boot-exchange", "product.a", "Hello from DATABASE SERVICE!");
    }


}
