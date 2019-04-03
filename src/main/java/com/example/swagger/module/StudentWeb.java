package com.example.swagger.module;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
@Api("学生业务")
public class StudentWeb {

    @ApiOperation("查询所有学生")
    @GetMapping("/findAll")
    public List<Student> findAll(@RequestParam(required = false) @Valid String id){
        List<Student> list = new ArrayList<Student>();
        System.out.println(StringUtils.isEmpty(id));
        if (StringUtils.isEmpty(id)){
            list.add(new Student("1", "zhangsan"));
        }else {
            list.add(new Student("1", "zhangsan"));
            list.add(new Student("2", "lisi"));
        }
        return list;
    }


}

