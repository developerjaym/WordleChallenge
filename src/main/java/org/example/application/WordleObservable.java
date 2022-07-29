package org.example.application;

import org.example.dto.WordleDTO;

import java.util.HashSet;
import java.util.Set;

public abstract class WordleObservable {
    private Set<WordleObserver> observers = new HashSet<>();

    protected final void notifyObservers(WordleDTO dto) {
        this.observers.forEach(observer -> observer.onUpdate(dto));
    }

    public void addObserver(WordleObserver observer) {
        this.observers.add(observer);
    }


}
