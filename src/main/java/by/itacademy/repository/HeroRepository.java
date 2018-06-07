package by.itacademy.repository;

import by.itacademy.entity.Hero;
import org.springframework.data.repository.Repository;

public interface HeroRepository extends Repository<Hero, Long> {

    Hero findById(Long id);
}
