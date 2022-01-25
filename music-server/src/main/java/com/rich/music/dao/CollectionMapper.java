package com.rich.music.dao;

import com.rich.music.domain.Collection;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Collection record);

    int insertSelective(Collection record);

    Collection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Collection record);

    int updateByPrimaryKey(Collection record);

    int existSongId(@Param("userId") Integer userId, @Param("songId") Integer songId);

    int updateCollectMsg(Collection collection);

    int deleteCollect(@Param("userId") Integer userId, @Param("songId") Integer songId);

    List<Collection> allCollect();

    List<Collection> collectionOfUser(Integer userId);
}
