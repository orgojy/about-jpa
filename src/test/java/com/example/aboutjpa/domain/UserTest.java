package com.example.aboutjpa.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class UserTest {

    @Autowired
    private UserRepository userRepo;

    @DisplayName("Entity 저장")
    @Test
    void save() {
        // given
        User user = new User("Ryan", "An");
        // when
        userRepo.save(user);
        // then
        assertThat(user).isNotNull();
    }
}
