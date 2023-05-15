package com.cloud.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Register {

    @ApiModelProperty(value = "昵称")
    private String nickname;
    @ApiModelProperty(value = "账号")
    private String account;
    @ApiModelProperty(value = "密码")
    private String password;
    @ApiModelProperty(value = "头像")
    private String avatar;

}
