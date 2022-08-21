package com.jongmin.moduleapi.service;

import com.jongmin.moduleapi.exception.CustomException;
import com.jongmin.modulecommon.enums.CodeEnum;
import com.jongmin.modulecommon.enums.service.CommonDemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DemoService {

    private final CommonDemoService commonDemoService;

    public String save() {
        System.out.println(CodeEnum.SUCCESS.getCode());
        System.out.println(commonDemoService.commonService());

        return "save";
    }

    public String find() {
        System.out.println(CodeEnum.SUCCESS.getCode());
        return "find";
    }

    public String exception() {
        if (true) throw new CustomException(CodeEnum.UNKNOWN_ERROR);
        return "exception";
    }
}
