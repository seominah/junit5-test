package org.example.gradecalculator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

/**
 * 요구사항
 * 평균학점 계산식 = (학점수 * 교과목 평점)의 합계 / 수강신청 총 학점 수
 */
public class GradeCalculatorTest {
    // Domain : 이수한 과목(객체지향프로그래밍, 자료구조, 중국어 etc), 학점 계산기
    // 동적인 객체를 정적인 타입으로 추상화해서 도메인 모델링
    // 이수한 과목들 --> 과목(코스) 클래스
    // 이수한 과목을 전달하여 평균학점 계산 요청 --> 학점 계산기 --> 학점 계산식        --> 과목(코스)
    //                                              --> 수강신청 총 학점 수  --> 과목(코스)


    @Test
    void calculatorGradeTest() {
        List<Course> courses = List.of(new Course("OOP", 3, "A+"),
                new Course("자료구조", 3, "A+"));

        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double gradeResult = gradeCalculator.calculatorGrade();

        assertThat(gradeResult).isEqualTo(4.5);
    }
}
