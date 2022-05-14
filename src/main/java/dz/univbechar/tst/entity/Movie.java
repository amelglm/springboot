package dz.univbechar.tst.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;
@Entity
public class Movie {
    @Id
    int id;
    String name;
    @ManyToOne
    Dirictor dirictors;
    @ManyToMany
    List<Actor> actors;



}
