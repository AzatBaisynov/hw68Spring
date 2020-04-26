package kg.itacademy.hw68.service;

import kg.itacademy.hw68.entity.Teammate;
import kg.itacademy.hw68.model.TeammateCreateModel;
import java.util.*;

public interface TeammateService {
    Teammate create(Teammate teammate);
    Teammate createByModel(TeammateCreateModel teammateCreateModel);
    List<Teammate> getAllByName(String str);
    Teammate getTeammateByName(String str);
    List<Teammate> getAllByTeamIdId(Long id);
    List<Teammate> getAllByIsActiveTrueAndAgeBefore(Integer age);
}
