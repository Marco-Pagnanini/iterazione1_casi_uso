package org.example.models;

import org.example.models.Mission.Mission;
import org.example.models.Staff.Giudice;
import org.example.models.Staff.Mentore;
import org.example.models.Staff.Organizzatore;
import org.example.models.Team.Team;
import org.example.util.State;

import java.time.LocalDateTime;
import java.util.Set;

public class BuilderHackathon implements HackathonBuilder {

    private final Hackathon hackathon;

    public BuilderHackathon() {
        this.hackathon = new Hackathon();
    }

    @Override
    public HackathonBuilder withName(String name) {
        hackathon.setNome(name);
        return this;
    }

    @Override
    public HackathonBuilder withRegolamento(String regolamento) {
        hackathon.setRegolamento(regolamento);
        return this;
    }

    @Override
    public HackathonBuilder withScadenzaIscrizioni(LocalDateTime scadenzaIscrizioni) {
        hackathon.setScadenzaIscrizioni(scadenzaIscrizioni);
        return this;
    }

    @Override
    public HackathonBuilder withDataInizio(LocalDateTime dataInizio) {
        hackathon.setDataInizio(dataInizio);
        return this;
    }

    @Override
    public HackathonBuilder withDataFine(LocalDateTime dataFine) {
        hackathon.setDataFine(dataFine);
        return this;
    }

    @Override
    public HackathonBuilder withStato(State stato) {
        hackathon.setStato(stato);
        return this;
    }

    @Override
    public HackathonBuilder withLuogoEvento(String luogoEvento) {
        hackathon.setLuogoEvento(luogoEvento);
        return this;
    }

    @Override
    public HackathonBuilder withPremio(Double premio) {
        hackathon.setPremio(premio);
        return this;
    }

    @Override
    public HackathonBuilder withCapienzaMax(Integer capienzaMax) {
        hackathon.setCapienzaMax(capienzaMax);
        return this;
    }

    @Override
    public HackathonBuilder withCapienzaMin(Integer capienzaMin) {
        hackathon.setCapienzaMin(capienzaMin);
        return this;
    }

    @Override
    public HackathonBuilder withGiudice(Giudice giudice) {
        hackathon.setGiudice(giudice);
        return this;
    }

    @Override
    public HackathonBuilder withMentori(Set<Mentore> mentori) {
        hackathon.setMentore(mentori);
        return this;
    }

    @Override
    public HackathonBuilder withOrganizzatore(Organizzatore organizzatore) {
        hackathon.setOrganizzatore(organizzatore);
        return this;
    }

    @Override
    public HackathonBuilder withVincitore(Team vincitore) {
        hackathon.setVincitore(vincitore);
        return this;
    }

    @Override
    public HackathonBuilder withArgomento(String argomento) {
        hackathon.setArgomento(argomento);
        return this;
    }

    @Override
    public HackathonBuilder withSottoMissioni(Set<Mission> sottoMissioni) {
        hackathon.setSottoMissione(sottoMissioni);
        return this;
    }

    @Override
    public Hackathon build() {
        return hackathon;
    }
}
