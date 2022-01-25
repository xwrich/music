package com.rich.music.service;

import com.rich.music.domain.Collection;

import java.util.List;

public interface CollectService {

    boolean addCollection(Collection collection);

    boolean existSongId(Integer userId, Integer songId);

    boolean updateCollectMsg(Collection collection);

    boolean deleteCollect(Integer userId, Integer songId);

    List<Collection> allCollect();

    List<Collection> collectionOfUser(Integer userId);
}
