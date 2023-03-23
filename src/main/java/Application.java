import controller.MainController;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.run();
    }
}
//    Game의 역할이 service와 같은거 아닌가?
//        모델이 view를 알고있네? 미쳤네?
//
//        바람직함
//        Game -> service -> output
//
//        현재상태
//
//        Game -> output -> service 미쳤네 ?
//
//        Di 결합도와 응집도
//
//        Getter setter
//
//        Validate 우선순위 car인스턴스 생성 전 변경
//
//        Magic Num  상수화
//
//        역할과 책임의 분리(output이 좋은예다) output이 service의 존재를 알필요가없다.(controller에서 처리하자)
//
//        Random 문제
//
//        Static  으로 힙영역에 올려놓고
//
//        해당 메서드 호출될떄마다 random new 인스턴스화 함
//
//        controller에서 모든걸 처리하자
//
//        service에서 컨트롤러로 컨트롤러에서 Output
//
//        Public 상수들은  따로 뺴는게 낫고
//
//        output안에서만 쓰느것은 private 으로 해당 필득값으로만 쓰는게 좋다 .
