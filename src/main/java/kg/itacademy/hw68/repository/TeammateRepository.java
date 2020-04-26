package kg.itacademy.hw68.repository;

import kg.itacademy.hw68.entity.Team;
import kg.itacademy.hw68.entity.Teammate;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface TeammateRepository extends JpaRepository<Teammate, Long> {
    List<Teammate> findAllByFullNameContainsIgnoringCase(String str);
    Teammate findByFullNameIgnoringCase(String str);
    List<Teammate> findAllByTeamIdId(Long id);
    List<Teammate> findAllByIsActiveTrueAndAgeBefore(Integer age);
}
