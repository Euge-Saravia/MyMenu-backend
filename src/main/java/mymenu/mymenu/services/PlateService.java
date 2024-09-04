package mymenu.mymenu.services;

import org.springframework.stereotype.Service;

import mymenu.mymenu.models.Plate;
import mymenu.mymenu.repositories.PlateRepository;

@Service
public class PlateService {
    private PlateRepository plateRepository;

    public Plate createPlate(Plate plate){
        return plateRepository.save(plate);
    }
}
