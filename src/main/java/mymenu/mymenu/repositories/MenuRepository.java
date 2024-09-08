package mymenu.mymenu.repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mymenu.mymenu.models.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {

    public List<Menu> findByDateBetweenOrderByDate(Date dateStart, Date dateEnd);
    
}
