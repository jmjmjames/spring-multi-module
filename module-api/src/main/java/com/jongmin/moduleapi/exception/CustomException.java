package com.jongmin.moduleapi.exception;

import com.jongmin.modulecommon.enums.CodeEnum;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CustomException extends RuntimeException {
    private final String returnCode;
    private final String returnMessage;

    public CustomException(CodeEnum codeEnum) {
        super(codeEnum.getMessage());
        this.returnCode = codeEnum.getCode();
        this.returnMessage = codeEnum.getMessage();
    }
}
