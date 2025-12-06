package org.Spring_Exprestion_Language;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 12/6/2025 11:05 PM
 Project Name : 6_Last_Spring_Concepts
 ************************************************************************/
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpEL_cfg.xml");
        Demo demo = context.getBean("demo",Demo.class);
        System.out.println(demo);

//     Most of the time Don't use

        SpelExpressionParser temp = new SpelExpressionParser();
        Expression expression = temp.parseExpression("32+55+10");
        System.out.println(expression.getValue());
    }
}
