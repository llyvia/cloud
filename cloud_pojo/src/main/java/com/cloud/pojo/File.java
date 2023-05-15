package com.cloud.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.context.annotation.Bean;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value="File对象", description="File对象")
public class File implements Serializable {

    private static final long serialVersionUID = 1L;

    /*指定了实体类的主键属性，并且可以自动填充主键值。IdType.ASSIGN_UUID是一种基于雪花算法生成字符串类型主键的策略。*/
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @ApiModelProperty(value = "地址")
    private String url;

    @ApiModelProperty(value = "客户id")
    private String memId;

    @ApiModelProperty(value = "文件名字")
    private String name;

    @ApiModelProperty(value = "文件类型")
    private String type;

    @ApiModelProperty(value = "是否收藏")
    private Integer collection;

    @ApiModelProperty(value = "文件路径")
    private  String fDir;

    @ApiModelProperty(value = "类型")
    private String filetype;

    @ApiModelProperty(value = "视频id")
    private String videoId;

    @ApiModelProperty(value = "文件大小")
    private long size;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;

}
