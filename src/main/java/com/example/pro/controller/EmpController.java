package com.example.pro.controller;

import com.example.pro.service.EmpService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class EmpController {

    @Autowired
    private EmpService empService;


    //删除
    @RequestMapping("del")
    public int del(@Param("empno") Integer empno){
        return empService.del(empno);
    }

}
