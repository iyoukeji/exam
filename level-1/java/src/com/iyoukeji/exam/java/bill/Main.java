package com.iyoukeji.exam.java.bill;

import java.math.BigDecimal;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(1l, new Date());
        order.addItem(new OrderItem("东方树叶", 1l, new BigDecimal(4.5), OrderItem.State.OPEN));
        order.addItem(new OrderItem("雪碧", 4l, new BigDecimal(2.5), OrderItem.State.OPEN));
        order.addItem(new OrderItem("玉米热狗肠", 12l, new BigDecimal(4.5), OrderItem.State.CLOSED));
        order.addItem(new OrderItem("番茄酱", 2l, new BigDecimal(19.99), OrderItem.State.OPEN));
        order.addItem(new OrderItem("大米", 1l, new BigDecimal(45.76), OrderItem.State.OPEN));
        System.out.println(order.calculateTotalPrice());
    }
}
