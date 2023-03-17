package service;

import model.Car;

import java.util.List;

public interface CarRaceService {

    void generateCarRace(int raceCount, List<Car> carNames);

    void generateCarRandom(Car car);

    void getRaceWinner(List<Car> carNames);
}
