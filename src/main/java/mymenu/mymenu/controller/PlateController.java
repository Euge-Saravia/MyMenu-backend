package mymenu.mymenu.controller;

import org.springframework.web.bind.annotation.RestController;

import mymenu.mymenu.models.Plate;
import mymenu.mymenu.services.PlateService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class PlateController {
    
    private final PlateService plateService;

    public PlateController(PlateService plateService){
        this.plateService = plateService;
    }
    
    @PostMapping("/plates")
    public ResponseEntity<Object> createPlate(@RequestBody Plate plate){
        return plateService.createPlate(plate);
    }
    
    
}
