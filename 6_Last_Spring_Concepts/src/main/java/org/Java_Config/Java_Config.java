package org.Java_Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 12/19/2025 12:54 PM
 Project Name : 6_Last_Spring_Concepts
 ************************************************************************/
@Configuration
public class Java_Config {

    @Bean
    public Simple getSimple(){
        Simple simple = new Simple();
        return simple;
    }

}
