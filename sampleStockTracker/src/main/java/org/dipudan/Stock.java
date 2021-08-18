package org.dipudan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stock {

    private Integer id;
    private String stockName;
    private Integer quantity;
    private String stockCode;
    private float transactionAmount;
    private String transactionType;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Integer getId() {
        return id;
    }

    public Stock(Integer id, String stockName, Integer quantity, String stockCode, float transactionAmount, String transactionType) {
        super();
        this.id = id;
        this.stockName = stockName;
        this.quantity = quantity;
        this.stockCode = stockCode;
        this.transactionAmount = transactionAmount;
        this.transactionType = transactionType;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public float getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(float transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Stock() {
    }
}
