package org.example.models;

import jakarta.persistence.*;
import lombok.*;
import org.example.models.Mission.Mission;
import org.example.models.Staff.Giudice;
import org.example.models.Staff.Mentore;
import org.example.models.Staff.Organizzatore;
import org.example.models.Team.Team;
import org.example.util.State;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Hackathon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String argomento;
    private String regolamento;
    private String luogoEvento;
    private Double premio;

    private LocalDateTime scadenzaIscrizioni;
    private LocalDateTime dataInizio;
    private LocalDateTime dataFine;

    private State stato;

    private Integer capienzaMax;
    private Integer capienzaMin;
    @ManyToOne
    @JoinColumn(name = "giudice_id")
    private Giudice giudice;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "hackathon_mentore",
            joinColumns = @JoinColumn(name = "hackathon_id"),
            inverseJoinColumns = @JoinColumn(name = "mentore_id")
    )
    private Set<Mentore> mentore;
    @ManyToOne
    @JoinColumn(name = "organizzatore_id")
    private Organizzatore organizzatore;
    @ManyToOne
    @JoinColumn(name = "team_vincitore_id")
    private Team vincitore;

    @OneToMany(mappedBy = "hackathon", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Mission> sottoMissione;



}
