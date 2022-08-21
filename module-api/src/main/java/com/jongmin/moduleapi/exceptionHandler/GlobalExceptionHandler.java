package com.jongmin.moduleapi.exceptionHandler;

import com.jongmin.moduleapi.exception.CustomException;
import com.jongmin.moduleapi.response.CommonResponse;
import com.jongmin.modulecommon.enums.CodeEnum;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


// Runtime Exception을 Wrapping을 한 후에 RestControllerAdvice에 잡힘
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public CommonResponse<?> handlerCustomException(CustomException e) {
        return CommonResponse.builder()
                .returnCode(e.getReturnCode())
                .returnMessage(e.getReturnMessage())
                .build();
    }

    @ExceptionHandler(RuntimeException.class)
    public CommonResponse<?> handlerException(RuntimeException e) {
        return CommonResponse.builder()
                .returnCode(CodeEnum.UNKNOWN_ERROR.getCode())
                .returnMessage(CodeEnum.UNKNOWN_ERROR.getMessage())
                .build();
    }

}
