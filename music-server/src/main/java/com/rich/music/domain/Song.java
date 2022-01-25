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
@TableName("tb_song")
public class Song {

    /**
     * 歌曲ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 歌手ID
     */
    private Integer singerId;

    /**
     * 歌曲名称
     */
    private String name;

    /**
     * 介绍
     */
    private String introduction;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 图片
     */
    private String pic;

    /**
     * 歌词
     */
    private String lyric;

    /**
     * 位置
     */
    private String url;

}
