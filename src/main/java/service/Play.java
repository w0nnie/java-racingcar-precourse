package service;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;

public class Play {

    Input input = new Input();
    /**
     *
     * @return
     */
    public String[] inputCars(){
        String[] carInput = input.readCar();

        return carInput;
    }
}
