package org.sid.can_db_handler_service.RabbitMQ;

import org.sid.can_db_handler_service.RabbitMQ.Receiver;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitMQConfigurer {

    static final String topicExchangeName = "spring-boot-exchange";

    static final String queueName = "spring-boot";
    static final String queueName1 = "database";
    static final String queueName2 = "product";
    static final String queueName3 = "tiers";
    static final String queueName4 = "marketing";
    static final String queueName5 = "sells_purshase";

    @Bean
    Queue queue() {
        return new Queue(queueName, false);
    }
    @Bean
    Queue queue1() {
        return new Queue(queueName1, false);
    }
    @Bean
    Queue queue2() {
        return new Queue(queueName2, false);
    }
    @Bean
    Queue queue3() {
        return new Queue(queueName3, false);
    }
    @Bean
    Queue queue4() {
        return new Queue(queueName4, false);
    }
    @Bean
    Queue queue5() {
        return new Queue(queueName5, false);
    }


    @Bean
    TopicExchange exchange() {
        return new TopicExchange(topicExchangeName);
    }

    @Bean
    Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("foo.bar.#");
    }
    @Bean
    Binding binding1(Queue queue1, TopicExchange exchange) {
        return BindingBuilder.bind(queue1).to(exchange).with("foo.database.#");
    }
    @Bean
    Binding binding2(Queue queue2, TopicExchange exchange) {
        return BindingBuilder.bind(queue2).to(exchange).with("foo.product.#");
    }
    @Bean
    Binding binding3(Queue queue3, TopicExchange exchange) {
        return BindingBuilder.bind(queue3).to(exchange).with("foo.tiers.#");
    }
    @Bean
    Binding binding4(Queue queue4, TopicExchange exchange) {
        return BindingBuilder.bind(queue4).to(exchange).with("foo.marketing.#");
    }
    @Bean
    Binding binding5(Queue queue5, TopicExchange exchange) {
        return BindingBuilder.bind(queue5).to(exchange).with("foo.sells_purshase.#");
    }

    @Bean
    SimpleMessageListenerContainer container(ConnectionFactory connectionFactory,
                                             MessageListenerAdapter listenerAdapter) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.setQueueNames(queueName);
        container.setQueueNames(queueName1);
        container.setQueueNames(queueName2);
        container.setQueueNames(queueName3);
        container.setQueueNames(queueName4);
        container.setQueueNames(queueName5);

        container.setMessageListener(listenerAdapter);
        return container;
    }
    @Bean
    public MessageConverter jsonMessageConverter(){
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    MessageListenerAdapter listenerAdapter(Receiver receiver) {
        return new MessageListenerAdapter(receiver, "onReceive");
    }

}
