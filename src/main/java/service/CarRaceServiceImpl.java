package service;

import model.Car;
import view.Output;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarRaceServiceImpl implements CarRaceService {

    private static final int RANDOM_MIN = 1;

    private static final int RANDOM_MAX = 9;

    private static Output output = new Output();

    @Override
    public void generateCarRace(int raceCount, List<Car> carNames) {
        for (int i = 0; i < raceCount; i++) {
            for (int j = 0; j < carNames.size(); j++) {
               generateCarRandom(carNames.get(j));
            }
            //중간결과
            output.getInterimRaceResultMessage(carNames);
        }
        getRaceWinner(carNames);
    }

    /**
     * 난수발생하여 4이상이면 Car객체에 posiotion 프로퍼티값을 + 1시킨다.
     * @param car
     */
    @Override
    public void generateCarRandom(Car car) {
        Random random = new Random();
        int randomValue = random.nextInt(RANDOM_MAX) + RANDOM_MIN;
        car.setRandomNum(randomValue);

        if (car.getRandomNum() >= 4) {
            car.setPosition(car.getPosition() + 1);
        }
    }

    /**
     * winner를 구하는 로직
     * winner들을 stringBulider에 담아 output으로 던져준다.
     * @param carNames
     */
    @Override
    public void getRaceWinner(List<Car> carNames) {
        List<Car> raceWinner = new ArrayList<>();
        int maxPosition = 0;
        for (int i = 0; i < carNames.size(); i++) {
            if (carNames.get(i).getPosition() > maxPosition) {
                maxPosition = carNames.get(i).getPosition();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        String delimiter = "";
        for (int i = 0; i < carNames.size(); i++) {
            if (carNames.get(i).getPosition() == maxPosition) {
                raceWinner.add(carNames.get(i));
                stringBuilder.append(delimiter);
                delimiter = ", ";
                stringBuilder.append(carNames.get(i).getName());
            }
        }
        output.getRaceWinnerMessage(stringBuilder);

    }
}
