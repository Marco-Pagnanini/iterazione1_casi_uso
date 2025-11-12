package org.example.models;

import jakarta.persistence.*;
import org.example.models.Mission.Mission;
import org.example.models.Staff.Giudice;
import org.example.models.Staff.Mentore;
import org.example.models.Staff.Organizzatore;
import org.example.models.Team.Team;
import org.example.util.State;

import java.time.LocalDateTime;
import java.util.Set;


@Entity
public class Hackathon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String regolamento;
    private LocalDateTime scadenzaIscrizioni;
    private LocalDateTime dataInizio;
    private LocalDateTime dataFine;
    private State stato;
    private String luogoEvento;
    private Double premio;
    private Integer capienzaMax;
    private Integer capienzaMin;
    @ManyToOne
    private Giudice giudice;
    @ManyToMany
    private Set<Mentore> mentori;
    @ManyToOne
    private Organizzatore organizzatore;
    @ManyToOne
    private Team vincitore;
    private String argomento;
    @OneToMany
    private Set<Mission> sottoMissioni;



}
