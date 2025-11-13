package org.example.util;

public enum State {
    IN_ISCRIZIONE, IN_CORSO, IN_VALUTAZIONE, CONCLUSO;

    public State next(){
        return switch (this) {
            case IN_ISCRIZIONE -> IN_CORSO;
            case IN_CORSO -> IN_VALUTAZIONE;
            case IN_VALUTAZIONE -> CONCLUSO;
            case CONCLUSO -> CONCLUSO;
        };
    }
}
