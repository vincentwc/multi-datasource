package com.vincent.multidatasource.controller;

import com.vincent.multidatasource.entity.User;
import com.vincent.multidatasource.entity.User2;
import io.swagger.annotations.ApiOperation;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author wang_cheng
 * @date 2023/01/04 14:33
 * @desc
 **/
@RestController
@RequestMapping("/t-time")
public class TimeController {

    @ApiOperation("测试后端直接接受时间戳")
    @GetMapping("/timestamp")
    public ResponseEntity<Object> testLocalDateTime(
            @RequestParam LocalDateTime h) {
        System.out.println(h);
        return new ResponseEntity<>(h, HttpStatus.OK);
    }


    @GetMapping("/now")
    @ResponseBody
    public LocalDateTime getTimeStamp(){
        return LocalDateTime.now();
    }

    @GetMapping("/user")
    @ResponseBody
    public User getTimeStamp2(){
        User user = new User();
        user.setDateTime(LocalDateTime.now());
        return user;
    }


    @GetMapping("/user2")
    @ResponseBody
    public User2 getTimeStamp3(){
        User2 user = new User2();
        user.setDateTime(LocalDateTime.now());
        return user;
    }
}
