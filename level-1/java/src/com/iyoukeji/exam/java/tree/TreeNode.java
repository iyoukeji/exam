package com.iyoukeji.exam.java.tree;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeNode {

    private String name;
    private List<TreeNode> children = new ArrayList<>();

    public TreeNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public TreeNode addChild(TreeNode child) {
        this.children.add(child);

        return this;
    }

    public TreeNode addChildren(TreeNode ...children) {
        this.children.addAll(Arrays.asList(children));

        return this;
    }
}
