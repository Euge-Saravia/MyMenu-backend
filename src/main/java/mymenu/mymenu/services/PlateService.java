package mymenu.mymenu.services;

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

    public ResponseEntity<Object> createPlate(Plate plate) {
        plateRepository.save(plate);
        return new ResponseEntity<>(plate, HttpStatus.CREATED);
    }
}
