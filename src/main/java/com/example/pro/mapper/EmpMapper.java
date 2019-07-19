package com.example.pro.mapper;

import org.apache.ibatis.annotations.Delete;

public interface EmpMapper {

    /**
     * 删除
     * @param empno
     * @return
     */
    @Delete("delete from emp where empno=#{empno}")
    int del(Integer empno);

}
