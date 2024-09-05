package mymenu.mymenu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mymenu.mymenu.models.ShoppingList;

public interface ShoppingListRepository extends JpaRepository<ShoppingList, Integer> {
    
}
