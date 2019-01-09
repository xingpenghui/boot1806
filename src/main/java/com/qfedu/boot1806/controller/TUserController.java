package com.qfedu.boot1806.controller;


import com.alibaba.druid.pool.WrapperAdapter;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qfedu.boot1806.consts.SystemConst;
import com.qfedu.boot1806.domain.TUser;
import com.qfedu.boot1806.service.ITDictionaryService;
import com.qfedu.boot1806.service.ITUserService;
import com.qfedu.boot1806.vo.PageBeanVo;
import com.qfedu.boot1806.vo.ResultVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Wrapper;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author java1806
 * @since 2019-01-09
 */
@Api(value = "用户信息",produces = "用户")
@RestController
public class TUserController  {
    @Autowired
    private ITUserService service;

    //CRUD
    //新增
    @PostMapping("/useradd.do")
    public ResultVo add(TUser dictionary){
        if(service.save(dictionary)){
            return ResultVo.setOK(dictionary);
        }else{
            return ResultVo.setERROR();
        }
    }

    //修改
    @PostMapping("/userupdate.do")
    public  ResultVo update(TUser dictionary){
        if(service.update(dictionary,null)){
            return ResultVo.setOK(dictionary);
        }else{
            return ResultVo.setERROR();
        }
    }
    //删除
    @GetMapping("/userdel.do")
    public  ResultVo del(String token,int id){
        if(SystemConst.currUsers.containsKey(token)) {
            if (service.removeById(id)) {
                return ResultVo.setOK(null);
            } else {
                return ResultVo.setERROR();
            }
        }
        else {
            return ResultVo.setERROR();
        }
    }
    //查询全部
    @GetMapping("/userall.do")
    public PageBeanVo<TUser> all(){
        PageBeanVo<TUser> pageBeanVo=new PageBeanVo<>();
        pageBeanVo.setData(service.list());
        pageBeanVo.setCount(pageBeanVo.getData().size());
        pageBeanVo.setMsg("OK");
        pageBeanVo.setCode(0);
        return pageBeanVo;
    }
    //分页查询
    //查询全部
    @GetMapping("/userpage.do")
    public PageBeanVo<TUser> page(int page,int count){
        PageBeanVo<TUser> pageBeanVo=new PageBeanVo<>();
        //创建分页查询对象  参数：页码 每页显示的数量
        Page<TUser> page1=new Page<TUser>(page,count);
        pageBeanVo.setData(service.page(page1).getRecords());
        pageBeanVo.setCount(service.count());
        pageBeanVo.setMsg("OK");
        pageBeanVo.setCode(0);
        return pageBeanVo;
    }
    //查询单个
    @GetMapping("/userdetail.do")
    public TUser page(int id){
        return service.getById(id);
    }



    //登录
    @GetMapping("/userlogin.do")
    public ResultVo login(String name,String pass){
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("phone",name);
        queryWrapper.eq("password",pass);
        TUser user=service.getOne(queryWrapper);
        if(user!=null){
            SystemConst.currUsers.put(name,user);
            return ResultVo.setOK(name);
        }else {
            return ResultVo.setERROR();
        }
    }
    //注销
    @GetMapping("/userloginout.do")
    public ResultVo login(String token){
        SystemConst.currUsers.remove(token);
        return ResultVo.setOK(null);
    }
}
