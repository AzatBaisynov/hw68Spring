package kg.itacademy.hw68.controller;

import kg.itacademy.hw68.entity.Teammate;
import kg.itacademy.hw68.model.TeammateCreateModel;
import kg.itacademy.hw68.service.TeammateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/teammate")
public class TeammateController {
    @Autowired
    private TeammateService teammateService;

    @PostMapping
    public Teammate create(@RequestBody Teammate teammate){
        return teammateService.create(teammate);
    }

    @PostMapping("/new")
    public Teammate createByModel(@RequestBody TeammateCreateModel teammateCreateModel){
        return teammateService.createByModel(teammateCreateModel);
    }

    @GetMapping("/name/{str}")
    public List<Teammate> getAllByName(@PathVariable String str){
        return teammateService.getAllByName(str);
    }

    @GetMapping("/name/one/{str}")
    public Teammate getOneTeammateByName(@PathVariable String str){
        return teammateService.getTeammateByName(str);
    }

    @GetMapping("/find/id/{id}")
    public List<Teammate> findTeammatesById(@PathVariable Long id){
        return teammateService.getAllByTeamIdId(id);
    }

    @GetMapping("/find/age/{age}")
    public List<Teammate> getAllByIsActiveTrueAndAgeBefore(@PathVariable Integer age){
        return teammateService.getAllByIsActiveTrueAndAgeBefore(age);
    }
}
