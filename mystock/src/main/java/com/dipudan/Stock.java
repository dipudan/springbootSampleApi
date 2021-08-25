package com.dipudan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stock {

    public Integer id;
    public String stockname;
    public float stockprice;
    public String transactiontype;
    public String stockcode;
    public Integer quantity;

    public Stock(Integer id, String stockname, float stockprice, String transactiontype, String stockcode, Integer quantity) {
        super();
        this.id = id;
        this.stockname = stockname;
        this.stockprice = stockprice;
        this.transactiontype = transactiontype;
        this.stockcode = stockcode;
        this.quantity = quantity;
    }

    public Stock() {
    }

    public String getTransactiontype() {
        return transactiontype;
    }

    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }

    public String getStockcode() {
        return stockcode;
    }

    public void setStockcode(String stockcode) {
        this.stockcode = stockcode;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockname() {
        return stockname;
    }

    public void setStockname(String stockname) {
        this.stockname = stockname;
    }

    public float getStockprice() {
        return stockprice;
    }

    public void setStockprice(float stockprice) {
        this.stockprice = stockprice;
    }
}
