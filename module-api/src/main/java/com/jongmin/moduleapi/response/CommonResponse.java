package com.jongmin.moduleapi.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jongmin.modulecommon.enums.CodeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)  // info-> null 이면 제외
public class CommonResponse<T> {
    private final String returnCode;
    private final String returnMessage;
    private final T info;

    public CommonResponse(CodeEnum codeEnum) {
        returnCode = codeEnum.getCode();
        returnMessage = codeEnum.getMessage();
        info = null;
    }

    public CommonResponse(T info) {
        returnCode = CodeEnum.SUCCESS.getCode();
        returnMessage = CodeEnum.SUCCESS.getMessage();
        this.info = info;
    }

    public CommonResponse(CodeEnum codeEnum, T info) {
        returnCode = codeEnum.getCode();
        returnMessage = codeEnum.getMessage();
        this.info = info;
    }

}
