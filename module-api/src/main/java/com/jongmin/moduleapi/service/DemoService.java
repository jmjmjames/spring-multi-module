package com.jongmin.moduleapi.service;

import com.jongmin.moduleapi.exception.CustomException;
import com.jongmin.modulecommon.domain.User;
import com.jongmin.modulecommon.enums.CodeEnum;
import com.jongmin.modulecommon.enums.service.CommonDemoService;
import com.jongmin.modulecommon.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class DemoService {

    private final UserRepository userRepository;

    @Value("${profile-name}")
    private String name;

    public String save() {
        log.info("name: {}", name);
        if (name.equals("local")) {
            // local code
            log.info("local: {}", name);
        } else if (name.equals("beta")) {
            // beta code
            log.info("beta: {}", name);
        }
        userRepository.save(User.of(Thread.currentThread().getName()));

        return "save";
    }

    public String find() {
        long size = userRepository.count();
        log.info("DB size: {}", size);
        return "find";
    }

    public String exception() {
        if (true) throw new CustomException(CodeEnum.UNKNOWN_ERROR);
        return "exception";
    }
}
