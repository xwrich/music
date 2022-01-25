package com.rich.music.service.impl;

import com.rich.music.service.CommentService;
import com.rich.music.dao.CommentMapper;
import com.rich.music.domain.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;

    @Override
    public boolean addComment(Comment comment) {
        return commentMapper.insertSelective(comment) > 0 ? true:false;
    }

    @Override
    public boolean updateCommentMsg(Comment comment) {
        return commentMapper.updateCommentMsg(comment) >0 ?true:false;
    }

//    删除评论
    @Override
    public boolean deleteComment(Integer id) {
        return commentMapper.deleteComment(id) >0 ?true:false;
    }

    @Override
    public List<Comment> allComment()
    {
        return commentMapper.allComment();
    }

    @Override
    public List<Comment> commentOfSongId(Integer songId)

    {
        return commentMapper.commentOfSongId(songId);
    }

    @Override
    public List<Comment> commentOfSongListId(Integer songListId)

    {
        return commentMapper.commentOfSongListId(songListId);
    }
}
