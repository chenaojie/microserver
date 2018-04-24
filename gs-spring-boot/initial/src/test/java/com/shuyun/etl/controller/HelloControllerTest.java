package com.shuyun.etl.controller;

import hello.HelloController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloControllerTest {
    @Test
    public void testHello(){
//        if ("Greetings from Spring Boot!".equals(new HelloController().index())){
//            System.out.println("ok");
//        }else {
//            System.out.println("false");
//        }
        assertEquals("Greetings from Spring Boot!",new HelloController().index());
    }
}
