package kg.itacademy.hw68.controller;

import kg.itacademy.hw68.entity.Team;
import kg.itacademy.hw68.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/team")
public class TeamController {
    @Autowired
    private TeamService teamService;

    @PostMapping
    public Team create(@RequestBody Team team) { return teamService.create(team); }
}
