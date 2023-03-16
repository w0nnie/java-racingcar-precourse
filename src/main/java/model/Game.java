package model;

import service.CarRaceServiceImpl;

import java.util.List;

public class Game {

    private int raceCount;
    private List<Car> carNames;

    public Game(int raceCount, List<Car> carNames) {
        this.raceCount = raceCount;
        this.carNames = carNames;
    }

    /**
     * 게임시작
     *
     * raceCount 만큼 race를 돌린다.
     * 자동차별로 난수를 돌려 4이상이면 position을 1증가시킨다.
     * for문이 1증가하기전 중간 중간 결과값(output)을 console에 출력한다
     * for문이 다돌고 car.getPosition이 가장 높은 car가 최종우승
     *
     * ex
     * 실행 결과
     * pobi : -
     * woni :
     * jun : -
     *
     */
    public void start() {
        Output output = new Output();
        output.getRaceResultMessage(raceCount, carNames);
    }
}
