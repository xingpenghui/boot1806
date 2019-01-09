package com.qfedu.boot1806.vo;

import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2019/1/9 14:52
 */
public class PageEntity<T> implements IPage<T> {
    @Override
    public List<T> getRecords() {
        return null;
    }

    @Override
    public IPage<T> setRecords(List<T> records) {
        return null;
    }

    @Override
    public long getTotal() {
        return 0;
    }

    @Override
    public IPage<T> setTotal(long total) {
        return null;
    }

    @Override
    public long getSize() {
        return 0;
    }

    @Override
    public IPage<T> setSize(long size) {
        return null;
    }

    @Override
    public long getCurrent() {
        return 0;
    }

    @Override
    public IPage<T> setCurrent(long current) {
        return null;
    }
}
