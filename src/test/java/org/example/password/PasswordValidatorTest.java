package org.example.password;

import org.example.password.PasswordValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

/**
 * pw는 최소 8자 이상 12이하
 * pw는 8자 미만 또는 12자 초과 인 경우 IllegalArgumentException 예외 발생
 * 경계조건에 대해 테스트 코드 작성 -> 반드시 작성할 수 있도록 권장
 */
public class PasswordValidatorTest {
    @DisplayName("pw는 최소 8자 이상 12이하 - 예외X")
    @Test
    void validatePasswordTest() {
        assertThatCode(() -> PasswordValidator.validate("thisistest1234"))
                .doesNotThrowAnyException();
    }

    @DisplayName("pw는 8자 미만 또는 12자 초과 인 경우 IllegalArgumentException 예외 발생 + 경계조건 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"abcdefg", "abcdefghijklm"})
    void validatePasswordTest2(String password) {
        assertThatCode(() -> PasswordValidator.validate(password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("비밀번호는 최소 8자 이상 12자 이하여야한다.");
    }

}
