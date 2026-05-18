package racingcar.domain;

public class Car {
<<<<<<< HEAD
=======
    // [과제: 01단원 - 캡슐화를 위해 외부에서 직접 접근할 수 없도록 접근 제어자를 적어주세요]
>>>>>>> 20acf4edf1b9b54dd394d3b9077fb77742035fd9
    private final String name;
    private int position = 0;

    public Car(String name) {
        if (name == null || name.trim().isEmpty() || name.length() > 5) {
<<<<<<< HEAD
=======
            // [과제: 04단원 - 잘못된 입력이 들어오면 런타임 예외를 '던지는(발생시키는)' 키워드를 적어주세요]
>>>>>>> 20acf4edf1b9b54dd394d3b9077fb77742035fd9
            throw new IllegalArgumentException("자동차 이름은 1자 이상, 5자 이하만 가능합니다.");
        }
        this.name = name.trim();
    }

    public void move(int condition) {
        if (condition >= 4) {
            this.position++;
        }
    }

    public String getName() { return name; }
    public int getPosition() { return position; }
}
