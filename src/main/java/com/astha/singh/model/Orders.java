package com.astha.singh.model;

import com.astha.singh.annotation.ValidOrders;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Value;


@Entity
@Table(name="Orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ValidOrders
    private String summary;
    private int totalAmount;
    private String orderDate;
    private String deliveryDate;
    @Value("Confirmed")
    private String orderStatus;
    private String billingAddress;
    private String userDetails;

    public Orders() {
    }

    public Orders(int id, String name, String summary, int totalAmount, String orderDate, String delieverydate, String ordeStatus, String billingAddress, String userDetails) {
        this.id = id;
        this.name = name;
        this.summary = summary;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.deliveryDate = delieverydate;
        this.orderStatus = ordeStatus;
        this.billingAddress = billingAddress;
        this.userDetails = userDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(String userDetails) {
        this.userDetails = userDetails;
    }
}
