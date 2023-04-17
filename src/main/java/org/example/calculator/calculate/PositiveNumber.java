package org.example.calculator.calculate;

/*
음수면 예외를 터트리고, 양수면 객체가 생성됨 (양수임을 봥할 수 있음)
 */
public class PositiveNumber {
    private final int value;

    public PositiveNumber(int value) {
        validate(value);
        this.value = value;
    }

    private void validate(int value) {
        if (NegativeNumber(value)){
            throw new IllegalArgumentException("0 또는 음수를 전달 할 수 없습니다.");
        }
    }

    private boolean NegativeNumber(int value) {
        return value <= 0;
    }

    public int toInt(){
       return value;
    }

}
