package com.demo.utils;

import com.demo.domain.Result;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.sun.org.apache.regexp.internal.RE;

/**
 * @author wal
 * @date 2017/12/12
 */
public class ResultUtil {

    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
