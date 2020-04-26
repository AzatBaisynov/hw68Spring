package kg.itacademy.hw68.repository;

import kg.itacademy.hw68.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
