/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */
package company.project.component.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 * just on a simple po demo
 * tip: 习惯于映射数据
 * tip: 习惯 implements Serializable
 * tip: 一般 implements extends 于class 定义位于同一行
 */
public class User implements Serializable {

    // tip: 属性定义时都使用包装类，在方法体内使用基础类型

    private Long id;

    private String name;

    private BigDecimal money;

    private String idCard;

    private String phone;

    // tip: 一般数据库表里包含了下面一些字段 createTime, updateTime, deleted; deleted 用于逻辑删除。用deleted 避免于关键字冲突
    // tip: deleted 用于逻辑删除，看业务需要使用
    private Date createTime;

    private Date updateTime;

    private Boolean deleted;

    // the setter and getter start.
    // tip: 我们建议把setter getter 统一放到类的倒数第二的位置，一般我们很少会阅读这些代码。
    // tip: 同时对同一个属性set get 应该放一起
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // tip: equals hashCode 方便在一些orm 框架，rpc 框架是非常重要的，如果实现不对，很容易出问题
    // tip: 重写方法请使用@override
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /**
     * tip: 一些po vo dto 等pojo 需要实现toString 方法输出调试，免去使用toJsonString 这种输出方式
     * tip: 当有父类时，应该同时调用其toString 方法，可以在ide 生成是选择同时调用parent 的toString
     *
     * @return
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
