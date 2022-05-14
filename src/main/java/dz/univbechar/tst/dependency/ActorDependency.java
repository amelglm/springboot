package dz.univbechar.tst.dependency;

import dz.univbechar.tst.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorDependency extends JpaRepository<Actor,Integer > {
}
