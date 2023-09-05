package net.codejava.repository;

import lombok.extern.slf4j.Slf4j;
import net.codejava.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class ChangePasswordRepositoryTest {

    @Autowired
    private ChangePasswordRepository changePasswordRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    void findAllByUser() {
        User user = userRepository.findById(2).get();
        log.info("List: {}", changePasswordRepository.findAllByUserOrderByChangeDateDesc(user));
    }
}