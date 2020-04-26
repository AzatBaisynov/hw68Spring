package kg.itacademy.hw68.service;

import kg.itacademy.hw68.entity.Team;
import kg.itacademy.hw68.entity.Teammate;
import kg.itacademy.hw68.model.TeammateCreateModel;
import kg.itacademy.hw68.repository.TeamRepository;
import kg.itacademy.hw68.repository.TeammateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class TeammateServiceImpl implements TeammateService {
    @Autowired
    private TeammateRepository teammateRepository;
    @Autowired
    private TeamRepository teamRepository;

    @Override
    public Teammate create(Teammate teammate) {
        return teammateRepository.save(teammate);
    }

    @Override
    public Teammate createByModel(TeammateCreateModel teammateCreateModel) {
        Teammate teammate = new Teammate();
        teammate.setFullName(teammateCreateModel.getFullName());
        teammate.setAge(teammateCreateModel.getAge());
        teammate.setIsActive(teammateCreateModel.getIsActive());
        teammate.setTeamId(teamRepository.findById(teammateCreateModel.getTeamId()).orElse(null));
        return teammateRepository.save(teammate);
    }

    @Override
    public List<Teammate> getAllByName(String str) {
        return teammateRepository.findAllByFullNameContainsIgnoringCase(str);
    }

    @Override
    public Teammate getTeammateByName(String str) {
        return teammateRepository.findByFullNameIgnoringCase(str);
    }

    @Override
    public List<Teammate> getAllByTeamIdId(Long id) {
        return teammateRepository.findAllByTeamIdId(id);
    }

    @Override
    public List<Teammate> getAllByIsActiveTrueAndAgeBefore(Integer age) {
        return teammateRepository.findAllByIsActiveTrueAndAgeBefore(age);
    }
}
