package com.example.swagger.module;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel
@ToString
@Getter
@Setter
public class Student {

    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty(value = "学生名字", name = "name", required = true, example = "1")
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

