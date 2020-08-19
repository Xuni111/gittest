package com.aaa.service;

import com.aaa.dao.CourseDao;
import com.aaa.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseService {

    @Resource
    CourseDao courseDao;

    public List<Course> findAll(){
       return courseDao.findAll();
    }

    public int deleteById(Integer tid){
        return courseDao.deleteByPrimaryKey(tid);
    }
}
