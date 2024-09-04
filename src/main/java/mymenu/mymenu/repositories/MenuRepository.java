package mymenu.mymenu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mymenu.mymenu.models.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
    
}
