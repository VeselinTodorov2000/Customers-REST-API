package com.rest.restapicustomer.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

public class Customer {

    private Long id;
    private String name;
    private LocalDate creationDate;
    private Integer purchasedItems;

    public Customer() {
        this(0L, null, null, 0);
    }

    public Customer(@JsonProperty("id")Long id, @JsonProperty("name")String name, @JsonProperty("cd")LocalDate creationDate, @JsonProperty("pi")Integer purchasedItems) {
        this.setId(id);
        this.setName(name);
        this.setCreationDate(creationDate);
        this.setPurchasedItems(purchasedItems);
    }

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

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getPurchasedItems() {
        return purchasedItems;
    }

    public void setPurchasedItems(Integer purchasedItems) {
        this.purchasedItems = purchasedItems;
    }

    @Override
    public String toString() {
        return "{\n" +
                "id=" + id +
                ",\n name='" + name + '\'' +
                ",\n creationDate=" + creationDate +
                ",\n purchasedItems=" + purchasedItems + "\n" +
                '}';
    }
}
