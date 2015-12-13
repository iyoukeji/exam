package com.iyoukeji.exam.java.tree;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ProductCategory> productCategories = new ArrayList<>();
        productCategories.add(new ProductCategory(1, null, "电器"));
        productCategories.add(new ProductCategory(2, 1, "手机"));
        productCategories.add(new ProductCategory(3, 2, "智能机"));
        productCategories.add(new ProductCategory(4, 3, "功能机"));
        productCategories.add(new ProductCategory(5, 1, "电视"));
        productCategories.add(new ProductCategory(6, 1, "电脑"));
        productCategories.add(new ProductCategory(7, 6, "办公本"));
        productCategories.add(new ProductCategory(8, 6, "游戏本"));
        productCategories.add(new ProductCategory(9, 1, "小家电"));
        productCategories.add(new ProductCategory(10, null, "生鲜"));
        productCategories.add(new ProductCategory(11, 10, "蔬菜"));
        productCategories.add(new ProductCategory(12, 10, "肉类"));
        productCategories.add(new ProductCategory(13, 10, "干货"));
        productCategories.add(new ProductCategory(14, null, "服装"));

        // TODO 使用productCategories构造成树形结构, 节点为TreeNode, 然后输出显示这棵树, 示例如下:
        // 电器
        //   - 手机
        //     - 智能机
        //     - 功能机
        //   - 电视
        //   - 电脑
        //     - 办公本
        // ....

    }

}
