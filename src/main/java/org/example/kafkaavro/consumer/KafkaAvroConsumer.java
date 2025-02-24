package org.example.kafkaavro.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.example.kafkaavro.dto.Employee;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaAvroConsumer {

    @KafkaListener(topics = "${topic.name}")
    public void read(ConsumerRecord<String, Employee> consumerRecord) {
        String key = consumerRecord.key();
        Employee employee = consumerRecord.value();
//        log.info("Avro message received for key : " + key + " value : " + employee.toString());
        System.out.println("Avro message received for key : " + key + " value : " + employee.toString());
    }
}
