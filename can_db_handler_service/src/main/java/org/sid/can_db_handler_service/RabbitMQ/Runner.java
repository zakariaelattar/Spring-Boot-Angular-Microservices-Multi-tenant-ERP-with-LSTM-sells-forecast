package org.sid.can_db_handler_service.RabbitMQ;


import org.sid.can_db_handler_service.Repositories.Product.ProductRepository;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner  {
    @Autowired
    ProductRepository productRepository;
 //   private final RabbitTemplate rabbitTemplate;
  //  private final Receiver receiver;

    public Runner(Receiver receiver, RabbitTemplate rabbitTemplate) {
    //    this.receiver = receiver;
      //  this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void run(String... args) throws Exception {



   //     System.out.println("Sending message...");
     //   rabbitTemplate.convertAndSend("spring-boot-exchange", "foo.bar.baz", "Hello from RabbitMQ!");
        //receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
    }

}
