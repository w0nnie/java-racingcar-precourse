package service;

import model.Car;

import java.util.List;
import java.util.Random;

public class CarRaceServiceImpl {

    private static final int randomMin = 1;

    private static final int randomMax = 9;


    public void generateCarRace(int raceCount, List<Car> carNames) {
        for (int i = 0; i < raceCount; i++) {
            for (int j = 0; j < carNames.size(); j++) {
                generateCarRandom(carNames.get(i));
            }
        }
    }

    /**
     * 난수발생하여 4이상이면 Car객체에 posiotion 프로퍼티값을 + 1시킨다.
     * @param car
     */
    private void generateCarRandom(Car car) {
        Random random = new Random();
        int randomValue = random.nextInt(randomMax) + randomMin;
        car.setRandomNum(randomValue);
        System.out.println("randomValue = " +randomValue);

//
//        if (car.getRandomNum() >= 4) {
//            car.setPosition(car.getPosition() + 1);
//        }
    }
}
