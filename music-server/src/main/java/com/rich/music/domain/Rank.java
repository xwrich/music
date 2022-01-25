package com.rich.music.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_rank")
public class Rank implements Serializable {

    /**
     * 榜单ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long songListId;

    private Long consumerId;

    private Integer score;
}
