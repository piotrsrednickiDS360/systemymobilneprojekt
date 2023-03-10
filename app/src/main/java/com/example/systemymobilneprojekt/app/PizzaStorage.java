package com.example.systemymobilneprojekt.app;

import android.util.Log;

import com.example.systemymobilneprojekt.db.DatabaseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PizzaStorage {
    private static final PizzaStorage PIZZA_STORAGE = new PizzaStorage();

    private final List<Pizza> pizzas;

    private PizzaStorage() {
        pizzas = new ArrayList<>();
        List<com.example.systemymobilneprojekt.db.tables.Pizza> pizzas = DatabaseOperations.getAllPizzas();
        for (int i = 0; i < pizzas.size(); i++) {
            Log.d("NaszeLogi","pizza nr: "+i+" "+pizzas.get(i));
            Pizza pizza = new Pizza();
            pizza.setName(pizzas.get(i).name);
            pizza.setDescription(pizzas.get(i).description);
            pizza.setPrice(pizzas.get(i).price);
            pizza.setPizzaId(pizzas.get(i).pizzaId);
            if (i % 3 == 0) {
                pizza.setDipCategory(Category.SEROWY);
            } else {
                pizza.setDipCategory(Category.POMIDOROWY);
            }
            this.pizzas.add(pizza);
        }
    }

    public static PizzaStorage getInstance() {
        return PIZZA_STORAGE;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public Pizza getPizza(UUID id) {
        for (int i = 0; i < pizzas.size(); i++) {
            if (pizzas.get(i).getId().equals(id)) {
                return pizzas.get(i);
            }
        }
        return null;
    }
}
