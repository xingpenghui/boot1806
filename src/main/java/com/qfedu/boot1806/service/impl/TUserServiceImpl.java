package com.qfedu.boot1806.service.impl;

import com.qfedu.boot1806.domain.TUser;
import com.qfedu.boot1806.dao.TUserMapper;
import com.qfedu.boot1806.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author java1806
 * @since 2019-01-09
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
