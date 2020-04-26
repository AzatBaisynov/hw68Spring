package kg.itacademy.hw68.service;

import kg.itacademy.hw68.entity.Team;
import kg.itacademy.hw68.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamRepository teamRepository;
    @Override
    public Team create(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public Team findById(Long id) {
        return teamRepository.findById(id).orElse(null);
    }
}
