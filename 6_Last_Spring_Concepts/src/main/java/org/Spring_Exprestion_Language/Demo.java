package org.Spring_Exprestion_Language;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 12/6/2025 11:05 PM
 Project Name : 6_Last_Spring_Concepts
 ************************************************************************/
@Component
public class Demo {
    @Value("#{10+20}")
    private int x;

    @Value("#{10+34+50}")
    private int y;

    @Value("#{ T( java.lang.Math ).sqrt(25) }")
    private double squear;




    public Demo(int x, int y, double squear) {
        this.x = x;
        this.y = y;
        this.squear = squear;
    }

    public Demo(){

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getSquear() {
        return squear;
    }

    public void setSquear(double squear) {
        this.squear = squear;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", squear=" + squear +
                '}';
    }
}
