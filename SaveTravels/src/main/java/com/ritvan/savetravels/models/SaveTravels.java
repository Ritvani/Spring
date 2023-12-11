package com.ritvan.savetravels.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Travels")
public class SaveTravels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String expenses;
    private String vendor;
    private Double amount;

    public SaveTravels() {
    }

    public SaveTravels(Long id, String expenses, String vendor, Double amount) {
        this.id = id;
        this.expenses = expenses;
        this.vendor = vendor;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public String getExpenses() {
        return expenses;
    }

    public void setExpenses(String expenses) {
        this.expenses = expenses;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
