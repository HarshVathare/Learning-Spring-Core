package org.studyeasy.config_type.using_Interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 11/28/2025 12:22 PM
 Project Name : 3_Spring_Bean
 ************************************************************************/
public class Pepsi implements InitializingBean, DisposableBean {
    private String count;
    private String price;

    public Pepsi(String count, String price) {
        this.count = count;
        this.price = price;
    }

    public Pepsi(){

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
        return "Pepsi{" +
                "count='" + count + '\'' +
                ", price='" + price + '\'' +
                '}';
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Setting the Properties then init() call => init ...!");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("After init() call then destroy() call => Destroy ...!");
    }


}
