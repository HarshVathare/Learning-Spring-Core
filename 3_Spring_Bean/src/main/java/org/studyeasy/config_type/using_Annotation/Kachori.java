package org.studyeasy.config_type.using_Annotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 11/28/2025 12:51 PM
 Project Name : 3_Spring_Bean
 ************************************************************************/
public class Kachori {
    private String count;
    private String price;

    public Kachori(String count, String price){
        this.count = count;
        this.price = price;
    }

    public Kachori(){

    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Kachori{" +
                "count='" + count + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    @PostConstruct
    public void start(){
        System.out.println("init() method called ..!");
    }

    @PreDestroy
    public void end(){
        System.out.println("Destroy() method called ..!");
    }
}
