package com.iyoukeji.exam.java.bill;

import java.math.BigDecimal;

/**
 * 订单条目类
 */
public class OrderItem {

    public enum State {
        OPEN, CLOSED
    }

    /**
     * 订单物品的名称
     */
    private String name;

    /**
     * 下单数量
     */
    private Long amount;

    /**
     * 订单状态
     */
    private State state = State.OPEN;

    /**
     * 下单单价
     */
    private BigDecimal price;

    public OrderItem() {
    }

    public OrderItem(String name, Long amount, BigDecimal price, State state) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
