package com.rich.music.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_user")
public class Consumer {

    /**
     * 游客ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 游客用户名
     */
    private String username;

    /**
     * 游客密码
     */
    private String password;

    /**
     * 游客性别
     */
    private Byte sex;

    /**
     * 电话
     */
    private String phoneNum;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 生日
     */
    private Date birth;

    /**
     * 介绍
     */
    private String introduction;

    /**
     * 位置
     */
    private String location;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
