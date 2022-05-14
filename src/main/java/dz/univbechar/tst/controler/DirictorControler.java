package dz.univbechar.tst.controler;

import dz.univbechar.tst.dependency.DirictorDependency;
import dz.univbechar.tst.entity.Dirictor;
import dz.univbechar.tst.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DirictorControler {
    @Autowired
    DirictorDependency dirictorDependency;
    @PostMapping("/Dirictor")
    public void create (@RequestBody Dirictor dirictor){
        dirictorDependency.save(dirictor);
    }


    @GetMapping("/Dirictor/{id}")
    public void get (@PathVariable int id){
        dirictorDependency.findById(id);
    }

    @PutMapping("/Dirictor")
    public void update (@RequestBody Dirictor dirictor){
        dirictorDependency.save(dirictor);
    }

    @DeleteMapping("/Dirictor/{id}")
    public void delete (@PathVariable int id){
        dirictorDependency.deleteById(id);
    }



}
