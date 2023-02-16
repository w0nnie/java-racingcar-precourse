package service;

import camp.nextstep.edu.missionutils.Console;
import message.StringFormat;

public class Input {

    public static String[] readCar() {
        System.out.println(StringFormat.CAR_INPUT_MESSAGE);

        String carInput = Console.readLine();


        //todo while변경
//        try {
//            Validator.validateCarInput(carInput);
//        } catch (IllegalArgumentException e) {
//            System.out.println(StringFormat.CAR_INPUT_ERROR_MESSAGE);
//            return readCarLineAgain();
//        }
        return carInput.split(",");
    }

}
