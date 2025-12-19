package org.Complete_Java_Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 12/19/2025 1:35 PM
 Project Name : 6_Last_Spring_Concepts
 ************************************************************************/
@Configuration
//@ComponentScan(basePackages = "org.Complete_Java_Config")
public class Java_Config {

    @Bean
    public Mother getMother(){
        return new Mother();
    }

    @Bean
    public Son getSon(){
        Son son = new Son(getMother());
        return son;
    }

}
