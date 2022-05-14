package dz.univbechar.tst.dependency;

import dz.univbechar.tst.entity.Dirictor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirictorDependency extends JpaRepository<Dirictor,Integer> {
}
