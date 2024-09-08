package mymenu.mymenu.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import mymenu.mymenu.models.Plate;
import mymenu.mymenu.repositories.PlateRepository;

@Service
public class PlateService {
    private PlateRepository plateRepository;

    public PlateService(PlateRepository plateRepository) {
        this.plateRepository = plateRepository;
    }

    public List<Plate> getPlates(){
        return plateRepository.findAll();
    }

    public ResponseEntity<Object> createPlate(Plate plate) {
        Plate savedPlate = plateRepository.save(plate);
        return new ResponseEntity<>(savedPlate, HttpStatus.CREATED);
    }
}
