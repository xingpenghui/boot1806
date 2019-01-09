package com.qfedu.boot1806.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qfedu.boot1806.domain.TUserdetail;
import com.qfedu.boot1806.service.ITUserdetailService;
import com.qfedu.boot1806.vo.PageBeanVo;
import com.qfedu.boot1806.vo.ResultVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author java1806
 * @since 2019-01-09
 */
@Api(value = "用户详情",produces = "用户详情")
@RestController
public class TUserdetailController {
    @Autowired
    private ITUserdetailService service;

    //CRUD
    //新增
    @PostMapping("/userdetailadd.do")
    public ResultVo add(TUserdetail dictionary){
        if(service.save(dictionary)){
            return ResultVo.setOK(dictionary);
        }else{
            return ResultVo.setERROR();
        }
    }
    //修改
    @PostMapping("/userdetailupdate.do")
    public  ResultVo update(TUserdetail dictionary){
        if(service.update(dictionary,null)){
            return ResultVo.setOK(dictionary);
        }else{
            return ResultVo.setERROR();
        }
    }
    //删除
    @GetMapping("/userdetaildel.do")
    public  ResultVo del(int id){
        if(service.removeById(id)){
            return ResultVo.setOK(null);
        }else{
            return ResultVo.setERROR();
        }
    }
    //查询全部
    @GetMapping("/userdetailall.do")
    public PageBeanVo<TUserdetail> all(){
        PageBeanVo<TUserdetail> pageBeanVo=new PageBeanVo<>();
        pageBeanVo.setData(service.list());
        pageBeanVo.setCount(pageBeanVo.getData().size());
        pageBeanVo.setMsg("OK");
        pageBeanVo.setCode(0);
        return pageBeanVo;
    }
    //分页查询
    //查询全部
    @GetMapping("/userdetailpage.do")
    public PageBeanVo<TUserdetail> page(int page,int count){
        PageBeanVo<TUserdetail> pageBeanVo=new PageBeanVo<>();
        //创建分页查询对象  参数：页码 每页显示的数量
        Page<TUserdetail> page1=new Page<TUserdetail>(page,count);
        pageBeanVo.setData(service.page(page1).getRecords());
        pageBeanVo.setCount(service.count());
        pageBeanVo.setMsg("OK");
        pageBeanVo.setCode(0);
        return pageBeanVo;
    }
    //查询单个
    @GetMapping("/userdetaildetail.do")
    public TUserdetail page(int id){
        return service.getById(id);
    }

}
