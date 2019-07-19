package com.example.pro.service;

import com.example.pro.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

    @Autowired
    private EmpMapper empMapper;

    /**
     * 删除
     * @param empno
     * @return
     */
    public int del(Integer empno){
        return empMapper.del(empno);
    }

}
