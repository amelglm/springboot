package dz.univbechar.tst.dependency;

import dz.univbechar.tst.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDependency extends JpaRepository <Movie,Integer> {

}
