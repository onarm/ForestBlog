package com.dubuyin.ssm.blog.service.impl;

import com.dubuyin.ssm.blog.entity.Notice;
import com.dubuyin.ssm.blog.mapper.NoticeMapper;
import com.dubuyin.ssm.blog.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dubuyin
 */
@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired(required = false)
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> listNotice(Integer status)  {
        return noticeMapper.listNotice(status);
    }

    @Override
    public void insertNotice(Notice notice)  {
        noticeMapper.insert(notice);
    }

    @Override
    public void deleteNotice(Integer id)  {
        noticeMapper.deleteById(id);
    }

    @Override
    public void updateNotice(Notice notice)  {
        noticeMapper.update(notice);
    }

    @Override
    public Notice getNoticeById(Integer id)  {
        return noticeMapper.getNoticeById(id);
    }

}
