package dz.univbechar.tst.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Dirictor {
    @Id
    int id;

    String name;

    @OneToMany
    List<Movie> movies ;

}
