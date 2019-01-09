package com.qfedu.boot1806.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qfedu.boot1806.domain.TDictionary;
import com.qfedu.boot1806.service.ITDictionaryService;
import com.qfedu.boot1806.vo.PageBeanVo;
import com.qfedu.boot1806.vo.ResultVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author java1806
 * @since 2019-01-09
 */
@Api(value = "数据字典",produces = "键值对")
@RestController
public class TDictionaryController {
    @Autowired
    private ITDictionaryService service;

    //CRUD
    //新增
    @PostMapping("/dictionaryadd.do")
    public ResultVo add(TDictionary dictionary){
        if(service.save(dictionary)){
            return ResultVo.setOK(dictionary);
        }else{
            return ResultVo.setERROR();
        }
    }
    //修改
    @PostMapping("/dictionaryupdate.do")
    public  ResultVo update(TDictionary dictionary){
        if(service.update(dictionary,null)){
            return ResultVo.setOK(dictionary);
        }else{
            return ResultVo.setERROR();
        }
    }
    //删除
    @GetMapping("/dictionarydel.do")
    public  ResultVo del(int id){
        if(service.removeById(id)){
            return ResultVo.setOK(null);
        }else{
            return ResultVo.setERROR();
        }
    }
    //查询全部
    @GetMapping("/dictionaryall.do")
    public PageBeanVo<TDictionary> all(){
        PageBeanVo<TDictionary> pageBeanVo=new PageBeanVo<>();
        pageBeanVo.setData(service.list());
        pageBeanVo.setCount(pageBeanVo.getData().size());
        pageBeanVo.setMsg("OK");
        pageBeanVo.setCode(0);
        return pageBeanVo;
    }
    //分页查询
    //查询全部
    @GetMapping("/dictionarypage.do")
    public PageBeanVo<TDictionary> page(int page,int count){
        PageBeanVo<TDictionary> pageBeanVo=new PageBeanVo<>();
        //创建分页查询对象  参数：页码 每页显示的数量
        Page<TDictionary> page1=new Page<TDictionary>(page,count);
        pageBeanVo.setData(service.page(page1).getRecords());
        pageBeanVo.setCount(service.count());
        pageBeanVo.setMsg("OK");
        pageBeanVo.setCode(0);
        return pageBeanVo;
    }
    //查询单个
    @GetMapping("/dictionarydetail.do")
    public TDictionary page(int id){
        return service.getById(id);
    }


}
