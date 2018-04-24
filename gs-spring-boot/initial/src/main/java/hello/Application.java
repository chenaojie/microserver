package hello;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisShardInfo;

@SpringBootApplication
public class Application {
    
    public static void main(String[] args) {
//        ApplicationContext ctx =
        SpringApplication.run(Application.class, args);
        
//        System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//        String[] beanNames = ctx.getBeanDefinitionNames();
//        Arrays.sort(beanNames);
//        for (String beanName : beanNames) {
//            System.out.println(beanName);
//        }
//        JedisShardInfo shardInfo = new JedisShardInfo("127.0.0.1");
//        shardInfo.setPassword("123456");
//        Jedis jedis = new Jedis(shardInfo);
//        System.out.println("redis 链接成功!");
//        System.out.println(jedis.ping());
//        System.out.println(jedis.get("mykey"));


    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext apx){
        return args ->{
            System.out.println("Let's inspect the beans provided by Spring Boot:");
            String [] beanNames = apx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames){
                System.out.println(beanName);
            }
        };
    }

}
