package com.praksa.breza.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A OnlineOrderItem.
 */
@Entity
@Table(name = "online_order_item")
public class OnlineOrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "order_amount", nullable = false)
    private Double orderAmount;

    @Column(name = "item_price")
    private Double itemPrice;

    @ManyToOne
    @JsonIgnoreProperties("")
    private OnlineOrder onlineOrder;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public OnlineOrderItem orderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
        return this;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public OnlineOrderItem itemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
        return this;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public OnlineOrder getOnlineOrder() {
        return onlineOrder;
    }

    public OnlineOrderItem onlineOrder(OnlineOrder onlineOrder) {
        this.onlineOrder = onlineOrder;
        return this;
    }

    public void setOnlineOrder(OnlineOrder onlineOrder) {
        this.onlineOrder = onlineOrder;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OnlineOrderItem onlineOrderItem = (OnlineOrderItem) o;
        if (onlineOrderItem.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), onlineOrderItem.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "OnlineOrderItem{" +
            "id=" + getId() +
            ", orderAmount=" + getOrderAmount() +
            ", itemPrice=" + getItemPrice() +
            "}";
    }
}
