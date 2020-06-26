package org.sid.cannonerp.can_db_handler_service.RabbitMQ;



import org.sid.cannonerp.can_db_handler_service.Entities.Product;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Producer {
    @Autowired
    private RabbitTemplate rabbitTemplate;


    public void produce(Product product){
        rabbitTemplate.convertAndSend("spring-boot-exchange", "foo.database.a", product);
        System.out.println("Send msg = " + product);
    }
    public void produce(List<Product> product){
        rabbitTemplate.convertAndSend("spring-boot-exchange", "foo.database.a", product);
        System.out.println("Send msg = " + product);
    }
}
