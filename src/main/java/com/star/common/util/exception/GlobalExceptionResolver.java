package com.star.common.util.exception;

import com.star.common.util.JsonResponseBody;
import com.star.common.util.ResponseStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * SpringMVC之全局异常处理
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionResolver {


    /**
     * 处理所有不可知异常
     * @param e 异常
     * @return json结果
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public JsonResponseBody<?> handleException(Exception e) {
        // 打印异常堆栈信息
        log.error(e.getMessage(), e);
        return new JsonResponseBody<>(ResponseStatus.UNKNOWN_ERROR,"未知异常");
    }

    /**
     * 处理所有业务异常
     * @param e 业务异常
     * @return json结果
     */
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public JsonResponseBody<?> handleOpdRuntimeException(BusinessException e) {
        // 不打印异常堆栈信息
        log.error(e.getMessage());
        return new JsonResponseBody<>(e.getStatus(),e.getMsg());
    }
}
