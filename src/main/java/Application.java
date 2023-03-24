import controller.MainController;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.run();
    }
}


/**
 * mvc패턴으로 구현하려고 했구요
 * application main으로 시작이되고
 *
 * //클래스의 타입으로 선언되었을 때 객체라고 부르고, 그 객체가 메모리에 할당되어 실제 사용될 때 인스턴스라고 부른다.
 *
 * MainContollter를 인스턴스화 시키고 컨트롤러안에 run 메서드를 실행해줍니다.
 *
 * 저는 static을 붙여서 사용하지않아서
 * 메인 컨트롤러 안에서는 필드값으로 input 클래스를 인스턴스화 해서 메모리에 올려주고
 * run()안에서
 * carName과
 * raceCount를 입력받아
 * getCarNameInputMessage 는 그저 차동차 입력에 대한 message만 출력해줍니다.
 * getCarNames 에서 Console.readLine()을 통해 입력받은 후
 * split하러 들어갑니다.
 * list에 type은 카 객체이기 떄문에 split (,) 해서 짜른 string값으로 car객체를 생성해서
 * carNames에 넣어줍니다.
 * 그리고 validateCarNamesLength 체크 하러가죠 
 * 여기선 그냥 length 체크 해줍니다 5글자 이상일경우 익셉션 발생
 * 그리고 return carNames를 해줍니다.
 * 다시 처음으로 돌아가고
 *
 * raceCount도 동일합니다.
 *
 *
 * splitCarNames에서 split하고 car type의 List에 담아 줍니다. 
 * Game 객체를 생성자통해서 2개의 매개변수를 입력받아 생성해줍시니다.
 * game.start() 실행
 *
 * start메서드에는
 * Output을 하나 생성 해주고
 *
 * getRaceResultMessage 메서드를 실행해줍니다.
 * 결과 메세지만 출력을 해주고
 *
 * 자동차 경주에 대한 로직이 모여있는 service단으로 갑니다.
 *
 * 변수와 같은 사소한 것을 만드는것도 고민과 이유가 필요할거같다
 */