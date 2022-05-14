package dz.univbechar.tst.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;
@Entity
public class Actor {
    @Id
    int id ;
    String name;
    @ManyToMany
    List<Movie> movie;

}
