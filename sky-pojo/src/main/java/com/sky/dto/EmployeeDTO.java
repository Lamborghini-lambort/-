package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;



/*
*   这个是从浏览器拿到的数据封装对象
*
* */
@ApiModel(value = "员工信息")
@Data
public class EmployeeDTO implements Serializable {

    @ApiModelProperty(value = "员工id")
    private Long id;

    @ApiModelProperty(value = "员工用户名")
    private String username;

    @ApiModelProperty(value = "员工姓名")
    private String name;

    @ApiModelProperty(value = "员工手机号")
    private String phone;

    @ApiModelProperty(value = "员工性别")
    private String sex;

    @ApiModelProperty(value = "员工身份证号")
    private String idNumber;

}
