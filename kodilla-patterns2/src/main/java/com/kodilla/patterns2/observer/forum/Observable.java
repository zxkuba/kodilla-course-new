package com.kodilla.patterns2.observer.forum;

public interface Observable {
    void registryObserver(Observer observer);
    void notifyObserver();
    void removeObserver(Observer observer);
}
