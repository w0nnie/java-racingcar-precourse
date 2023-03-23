package model;

import java.util.Collections;
import java.util.List;

public class Arena {
    //일급컬렉션 정리해서 적용해보기
    private List<Car> carNames;

    public List<Car> getCarNames() {
        return Collections.unmodifiableList(carNames);
    }
}
