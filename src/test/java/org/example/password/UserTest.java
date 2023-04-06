package org.example.password;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class UserTest {

    @DisplayName("패스워드를 초기화한다.")
    @Test
    void passwordTest() {
        // given
        User user = new User();

        // when
        user.initPassword(() -> "abcdefgh");

        // then
        assertThat(user.getPasswrod()).isNotNull();
    }

    @DisplayName("패스워드가 조건에 부합되지 않아 초기화가 되지 않는다.")
    @Test
    void passwordTest2() {
        // given
        User user = new User();

        // when
        user.initPassword(new WrongFixedPasswordGenerator());
        // Functional Interface를 이용하면 구현체를 만들필요 없이 람다로 표현 가능
        user.initPassword(() -> "abc");

        // then
        assertThat(user.getPasswrod()).isNull();
    }
}