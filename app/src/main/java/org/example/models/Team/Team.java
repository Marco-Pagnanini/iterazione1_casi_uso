package org.example.models.Team;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany
    private Set<MembroTeam> members;
}
