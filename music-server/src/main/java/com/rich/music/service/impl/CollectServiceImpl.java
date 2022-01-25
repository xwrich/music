package com.rich.music.service.impl;

import com.rich.music.domain.Collection;
import com.rich.music.service.CollectService;
import com.rich.music.dao.CollectionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectServiceImpl implements CollectService {
    @Autowired
    private CollectionMapper collectionMapper;

    @Override
    public boolean addCollection(Collection collection) {
        return collectionMapper.insertSelective(collection) > 0 ? true:false;
    }

    @Override
    public boolean existSongId(Integer userId, Integer songId) {
        return collectionMapper.existSongId(userId, songId)>0 ? true:false;
    }

    @Override
    public boolean updateCollectMsg(Collection collection) {
        return collectionMapper.updateCollectMsg(collection) >0 ?true:false;
    }

    @Override
    public boolean deleteCollect(Integer userId, Integer songId) {
        return collectionMapper.deleteCollect(userId, songId) >0 ?true:false;
    }

    @Override
    public List<Collection> allCollect()

    {
        return collectionMapper.allCollect();
    }

    @Override
    public List<Collection> collectionOfUser(Integer userId)

    {
        return collectionMapper.collectionOfUser(userId);
    }
}
