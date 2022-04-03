package com.example.dubbotest;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.kafka.retrytopic.DestinationTopic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import static java.util.Objects.hash;

@SpringBootApplication
//@ImportResource(locations = "classpath:provider.xml")
public class DubboTestApplication {

    public static void main(String[] args) throws IOException {

        SpringApplication.run(DubboTestApplication.class, args);
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
//        context.start();
//        System.in.read();
//      Properties properties = new  Properties();
////        properties.put("bootstrap.servers","localhost:9092");
////        properties.put("acks","all");
//        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
//        properties.put(ProducerConfig.ACKS_CONFIG,"all");
//        properties.put("retries",3);
//        properties.put("batch.size",16384);
//        properties.put("linger.ms",1);
//        properties.put("buffer.memory",33554432);
//        properties.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
//        properties.put("value.serializer","org.apache.kafka.common.serialization.StringSerializer");
//
//        KafkaProducer<String,String> kafkaProducer =  new KafkaProducer<String,String>(properties);
//        for(int i = 0; i<10; i++){
//            kafkaProducer.send(new ProducerRecord<>("first","mokunfeng"+i));
//        }
//        kafkaProducer.close();
//        ArrayList B = new ArrayList();
//        B.add("2");
//        B.add("1");
//
//
//        ArrayList a = new ArrayList(B);
//        a.add(3);
//        System.out.println(a);
//        System.out.println(B);
     int a =   hash(130);
        System.out.println(a);
        System.out.println(Math.floorMod(a,1024));
        System.out.println("主分支");
        System.out.println("20220401分支");
    }

}
