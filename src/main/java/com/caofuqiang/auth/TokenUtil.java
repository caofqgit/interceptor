package com.caofuqiang.auth;

import com.caofuqiang.util.JwtUtil;
import org.springframework.util.ObjectUtils;

public class TokenUtil {
    public static String getToken(Integer userid){
        JwtUtil jwtUtil = new JwtUtil();
        String token = jwtUtil.createToken(userid);
        return  token;
    }
    public static Integer getUserid(String token){
        JwtUtil jwtUtil = new JwtUtil();
        Integer integer = jwtUtil.verifyTokenAndGetUserId(token);
        if(ObjectUtils.isEmpty(integer)){
            return null;
        }
        return integer;
    }
}
