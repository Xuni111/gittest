package com.aaa.controller;

import com.aaa.dao.CourseDao;
import com.aaa.entity.Course;
import com.aaa.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping("classes")
public class ClassesController {

    @Resource
    CourseService courseService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<Course> findAll(){
        System.out.println("findAll");
        return courseService.findAll();
    }

    @RequestMapping("deleteById")
    @ResponseBody
    public int deleteById(Integer tid){
        System.out.println("tid"+tid);
        return courseService.deleteById(tid);
    }
    @RequestMapping("test1")
    @ResponseBody
    public int test1(@RequestBody Course course){
        System.out.println(course);
        return 1;
    }

    @RequestMapping("test2")
    @ResponseBody
    public int test1(@RequestBody Map<String,Object> map){
        System.out.println(map);
        return 1;
    }

}
