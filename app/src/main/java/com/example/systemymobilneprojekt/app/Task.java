package com.example.systemymobilneprojekt.app;

import com.example.systemymobilneprojekt.R;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;


public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;
    private String description;
    private BigDecimal price;
    private Category category;
    private int pizzaId;

    public int getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(int pizzaId) {
        this.pizzaId = pizzaId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Task(){
        id = UUID.randomUUID();
        date = new Date();
        category = Category.CAPRICIOSA;

    }

    public Category getCategory() {
        return category;
    }


    public void setCategory(Category category) {
        this.category = category;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
