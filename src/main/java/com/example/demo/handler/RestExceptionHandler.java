package com.example.demo.handler;


import com.example.demo.domain.basic.Response;
import com.example.demo.exception.AlreadyExistException;
import com.example.demo.exception.LoginFailedException;
import com.example.demo.exception.ParamNotExistException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
@ResponseBody
public class RestExceptionHandler
{
    private static Logger logger = LoggerFactory.getLogger(RestExceptionHandler.class);


    @ExceptionHandler(value= AlreadyExistException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public Response<Object> handleEntityAlreadyExistException(AlreadyExistException e) {
    	logger.error(e.getMessage(),e);
    	return new Response<Object>().failure(e.getMessage());
    }
    @ExceptionHandler(value = LoginFailedException.class)
    @ResponseStatus(value = HttpStatus.UNAUTHORIZED,reason = "登陆失败")
    public Response<Object> handleLoginFailedException(LoginFailedException e) {
    	logger.error(e.getMessage(),e);
    	System.out.println(e.getCause());
    	return new Response<Object>().failure(e.getMessage());
    }

    @ExceptionHandler(value = ParamNotExistException.class)
    public Response<String> handleParamNotExistException(ParamNotExistException e){
        logger.error(e.getMessage(),e);
        return new Response<String>().failure(e.getMessage());
    }
}