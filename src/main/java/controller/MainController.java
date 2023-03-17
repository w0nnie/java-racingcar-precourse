package controller;

import model.Car;
import model.Game;
import model.Input;

import java.util.List;
//방장좌
public class MainController {
    Input input = new Input();

    public void run() {
        List<Car> carNames = input.getCarNameInputMessage();
        int raceCount = input.getRaceCountInputMessage();

        Game game = new Game(raceCount, carNames);
        game.start();
    }
}
