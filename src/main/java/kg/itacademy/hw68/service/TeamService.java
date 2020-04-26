package kg.itacademy.hw68.service;

import kg.itacademy.hw68.entity.Team;

public interface TeamService {
    Team create(Team team);
    Team findById(Long id);
}
