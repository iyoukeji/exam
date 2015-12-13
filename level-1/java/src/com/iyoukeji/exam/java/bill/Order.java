package com.iyoukeji.exam.java.bill;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 订单类
 */
public class Order {

    private Long id;
    private Date createTime;
    private List<OrderItem> items = new ArrayList<>();

    public Order(Long id, Date createTime) {
        this.id = id;
        this.createTime = createTime;
    }

    public Order addItem(OrderItem item) {
        items.add(item);

        return this;
    }

    /**
     * 计算订单总价格
     *
     * @return 总价格
     */
    public BigDecimal calculateTotalPrice() {
        // TODO 计算订单总价格并返回
        // 订单总价格 = 所有状态是是开放的(订单条目的单价*数量)的总和
        // 当前环境为JDK 1.8
        return null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
