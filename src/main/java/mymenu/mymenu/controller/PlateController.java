package mymenu.mymenu.controller;

import org.springframework.web.bind.annotation.RestController;

import mymenu.mymenu.models.Plate;
import mymenu.mymenu.services.PlateService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class PlateController {
    
    private final PlateService plateService;

    public PlateController(PlateService plateService){
        this.plateService = plateService;
    }

    @GetMapping("/plates")
   public List<Plate> getPlates(){
    return plateService.getPlates();
   }
    
    
    
    @PostMapping("/plates")
    public ResponseEntity<Object> createPlate(@RequestBody Plate plate){
        return plateService.createPlate(plate);
    }
    
      // Método PUT para actualizar un plato existente
    @PutMapping("/plates/{id}")
    public ResponseEntity<Object> updatePlate(@PathVariable int id, @RequestBody Plate updatedPlate) {
        return plateService.updatePlate(id, updatedPlate);
    }
    
}
