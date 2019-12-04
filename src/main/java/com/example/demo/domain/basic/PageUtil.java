package com.example.demo.domain.basic;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "分页查询基本类")
public class PageUtil {
    @ApiModelProperty(value = "每页条数")
    private Integer limit;
    @ApiModelProperty(value = "起始位置")
    private Integer offset;
}

