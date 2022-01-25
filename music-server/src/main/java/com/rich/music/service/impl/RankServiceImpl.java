package com.rich.music.service.impl;

import com.rich.music.dao.RankMapper;
import com.rich.music.domain.Rank;
import com.rich.music.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RankServiceImpl implements RankService {

    @Autowired
    private RankMapper rankMapper;

    @Override
    public int rankOfSongListId(Long songListId) {
        return rankMapper.selectScoreSum(songListId) / rankMapper.selectRankNum(songListId);
    }

    @Override
    public boolean addRank(Rank rank) {

        return rankMapper.insertSelective(rank) > 0 ? true:false;
    }
}
