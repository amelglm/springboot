package dz.univbechar.tst.controler;

import dz.univbechar.tst.dependency.ActorDependency;
import dz.univbechar.tst.entity.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class ActorConroler {
    @Autowired
    ActorDependency actordependency;


        @RequestMapping("/aa")
        public String getHelloWorld(){

            return "Hello World !!" ;
        }

    @PostMapping("/Actor")
    public void create (@RequestBody Actor actor){
        actordependency.save(actor);
    }


    @GetMapping("/Actor/{id}")
    public void get (@PathVariable int id){
        actordependency.findById(id);
    }

    @PutMapping("/Actor")
    public void update (@RequestBody Actor actor){
        actordependency.save(actor);
    }

    @DeleteMapping("/Actor/{id}")
    public void delete (@PathVariable int id){
        actordependency.deleteById(id);
    }




}
