package org.sid.cannonerp.can_purshase_sell_service.RabbitMQ;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {
    @Autowired
    private RabbitTemplate rabbitTemplate;


    public void produce(String ref){
        rabbitTemplate.convertAndSend("spring-boot-exchange", "foo.database.a", ref);
        System.out.println("Send msg = " + ref);
    }
}
