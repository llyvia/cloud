package com.cloud.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@ApiModel(value="用户目录对象", description="用户目录对象")
public class UserDir {

    @TableId(value = "user_id",type = IdType.ASSIGN_UUID)
    private String userId;

    @TableField("user_dir")
    private String userDir;
}
