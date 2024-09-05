package mymenu.mymenu.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "shoppingList")
public class ShoppingList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String product;

    public ShoppingList(){

    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

}
