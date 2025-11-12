package org.example.models.Mission;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.models.Hackathon;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime scadenza;
    private Double punteggio;

    @ManyToOne
    @JoinColumn(name = "hackathon_id")
    private Hackathon hackathon;
}
