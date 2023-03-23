package model;

import service.CarRaceService;
import service.CarRaceServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Output {

    public static final String NEW_LINE = "\n";
    private static final String CAR_POSITION = "-";
    private static final String RACE_RESULT_MESSAGE = "실행 결과";
    private static final String FINAL_WINNERS_MESSAGE = "최종 우승자 :";

    CarRaceService carRaceService = new CarRaceServiceImpl();

    /**
     * 실행결과 메세지를 출력한다.
     * carRaceService generateCarRace를 실행시킨다.
     */
    public void getRaceResultMessage(int raceCount, List<Car> carNames) {
        System.out.println(RACE_RESULT_MESSAGE);
        carRaceService.generateCarRace(raceCount, carNames);
    }

    /**
     * 중간중간 결과 출력
     * @param carNames
     */
    public void getInterimRaceResultMessage(List<Car> carNames) {
        for (int i = 0; i < carNames.size(); i++) {
            String position = "";
            for (int j = 0; j < carNames.get(i).getPosition(); j++) {
                position += CAR_POSITION;
            }
            System.out.println(carNames.get(i).getName() +" : " + position);
        }
        System.out.print(NEW_LINE);
    }

    /**
     * 최종 우승자 출력
     * @param stringBuilder
     */
    public void getRaceWinnerMessage(StringBuilder stringBuilder) {
        System.out.println(FINAL_WINNERS_MESSAGE + " " + stringBuilder);
    }
}
