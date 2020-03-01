package com.william.sell;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class SellProductApp
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
