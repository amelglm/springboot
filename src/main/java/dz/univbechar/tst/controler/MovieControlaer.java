package dz.univbechar.tst.controler;

import dz.univbechar.tst.dependency.MovieDependency;
import dz.univbechar.tst.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieControlaer {
    @Autowired
    MovieDependency movieDependency;

    @PostMapping("/Movie")
    public void create (@RequestBody Movie movie){
        movieDependency.save(movie);
    }


    @GetMapping("/Movie/{id}")
    public void get (@PathVariable int id){
        movieDependency.findById(id);
    }

    @PutMapping("/Movie")
    public void update (@RequestBody Movie movie){
        movieDependency.save(movie);
    }

    @DeleteMapping("/Movie/{id}")
    public void delete (@PathVariable int id){
        movieDependency.deleteById(id);
    }


}
