package mymenu.mymenu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mymenu.mymenu.models.Plate;

public interface PlateRepository extends JpaRepository<Plate, Integer> {
    
}
