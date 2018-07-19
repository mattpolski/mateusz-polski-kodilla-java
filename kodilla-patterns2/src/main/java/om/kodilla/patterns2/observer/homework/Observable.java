package om.kodilla.patterns2.observer.homework;

public interface Observable {
    void registerMentor(Observer observer);
    void notifyObserves();
    void removeMentor(Observer observer);
}
