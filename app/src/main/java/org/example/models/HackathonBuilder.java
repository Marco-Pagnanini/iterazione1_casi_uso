package org.example.models;

import org.example.models.Mission.Mission;
import org.example.models.Staff.Giudice;
import org.example.models.Staff.Mentore;
import org.example.models.Staff.Organizzatore;
import org.example.models.Team.Team;
import org.example.util.State;

import java.time.LocalDateTime;
import java.util.Set;

public interface HackathonBuilder {

    HackathonBuilder withName(String name);
    HackathonBuilder withRegolamento(String regolamento);
    HackathonBuilder withScadenzaIscrizioni(LocalDateTime scadenzaIscrizioni);
    HackathonBuilder withDataInizio(LocalDateTime dataInizio);
    HackathonBuilder withDataFine(LocalDateTime dataFine);
    HackathonBuilder withStato(State stato);
    HackathonBuilder withLuogoEvento(String luogoEvento);
    HackathonBuilder withPremio(Double premio);
    HackathonBuilder withCapienzaMax(Integer capienzaMax);
    HackathonBuilder withCapienzaMin(Integer capienzaMin);
    HackathonBuilder withGiudice(Giudice giudice);
    HackathonBuilder withMentori(Set<Mentore> mentori);
    HackathonBuilder withOrganizzatore(Organizzatore organizzatore);
    HackathonBuilder withVincitore(Team vincitore);
    HackathonBuilder withArgomento(String argomento);
    HackathonBuilder withSottoMissioni(Set<Mission> sottoMissioni);

    Hackathon build();
}
