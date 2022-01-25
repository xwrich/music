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
@TableName("tb_singer")
public class Singer {

    /**
     * 歌手ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 歌手姓名
     */
    private String name;

    /**
     * 歌手性别
     */
    private Byte sex;

    /**
     * 头像
     */
    private String pic;

    /**
     * 生日
     */
    private Date birth;

    /**
     * 位置
     */
    private String location;

    /**
     * 介绍
     */
    private String introduction;

}
