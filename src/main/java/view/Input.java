package view;

import camp.nextstep.edu.missionutils.Console;
import model.Car;

import java.util.ArrayList;
import java.util.List;

public class Input {

    public static final String INPUT_CAR_NAME_MESSAGE = "경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)";
    public static final String INPUT_CAR_BATTLE_COUNT = "시도할 회수는 몇회인가요?";

    public static final String INPUT_CAR_NAME_VALIDATE_ERROR_MESSAGE = "[ERROR] 자동차의 이름은 5글자 이하만 가능합니다.";

    public static final String INPUT_RACE_COUNT_VALIDATE_ERROR_MESSAGE = "[ERROR] 횟수는 숫자만 입력하세요.";

    /**
     * 자동차 이름을 입력받겠다는 메세지를 출력해준다.
     * @return getCarNames()
     */
    public List<Car> getCarNameInputMessage() {
        System.out.println(INPUT_CAR_NAME_MESSAGE);

        return getCarNames();
    }

    /**
     * 자동차 이름을 입력받는다.
     * @return splitCarNames
     */
    private List<Car> getCarNames() {
        String beforeProcessingCarNames = Console.readLine();

        return splitCarNames(beforeProcessingCarNames);
    }

    /**
     * 입력받은 자동차 이름을 쉼표를 기준으로 split하고 List<Car>에 담아준다.
     * @param
     * @return validateCarNames
     */
    private List<Car> splitCarNames(String beforeProcessingCarNames) {
        String[] tempCarNamesArray = beforeProcessingCarNames.split(",");
        List<Car> carNames = new ArrayList<>();

        for (int i = 0; i < tempCarNamesArray.length; i++) {
            Car car = new Car(tempCarNamesArray[i]);
            carNames.add(car);
        }

        return validateCarNamesLength(carNames);
    }

    /**
     * 자동차 이름의 유효성 검사를 한다.
     * 이름은 5자 이하만 가능하다.
     * @param carNames
     * @return
     */
    private List<Car> validateCarNamesLength(List<Car> carNames) {
        for (int i = 0; i < carNames.size(); i++) {
            int carNameLength = carNames.get(i).getName().length();

            if (carNameLength > 5) {
                throw new IllegalArgumentException(INPUT_CAR_NAME_VALIDATE_ERROR_MESSAGE);
            }
        }

        return carNames;
    }

    /**
     * 자동차 경주 횟수를 입력받겠다는 메세지를 출력해준다.
     * @return getRaceCount
     */
    public int getRaceCountInputMessage() {
        System.out.println(INPUT_CAR_BATTLE_COUNT);

        return getRaceCount();
    }

    /**
     * raceCount의 입력과 유효성체크를 해준다.
     * @return
     */
    private int getRaceCount() {
        try {
            int raceCount = Integer.parseInt(Console.readLine());
            return raceCount;
        } catch (NumberFormatException error) {
            throw new IllegalArgumentException(INPUT_RACE_COUNT_VALIDATE_ERROR_MESSAGE);
        }
    }
}
