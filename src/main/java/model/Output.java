package model;

public class Output {

    public static final String NEW_LINE = "\n";
    private static final String CAR_POSITION = "-";
    private static final String RACE_RESULT_MESSAGE = "실행 결과";
    private static final String FINAL_WINNERS_MESSAGE = "최종 우승자";


    /**
     * 실행결과 메세지를 출력한다.
     */
    public void getRaceResultMessage() {
        System.out.println(RACE_RESULT_MESSAGE);
    }
}
