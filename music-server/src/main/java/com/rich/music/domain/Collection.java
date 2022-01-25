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
@TableName("tb_collection")
public class Collection {

    /**
     * 标识ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 收藏用户ID
     */
    private Integer userId;

    /**
     * 类型
     */
    private Byte type;

    /**
     * 歌曲ID
     */
    private Integer songId;

    /**
     * 歌单ID
     */
    private Integer songListId;

    /**
     * 创建时间
     */
    private Date createTime;

}
