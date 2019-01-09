package com.qfedu.boot1806.consts;

import com.qfedu.boot1806.domain.TUser;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *@Author feri
 *@Date Created in 2019/1/9 15:35
 */
public class SystemConst {
    public static Map<String,TUser> currUsers;
    static {
        currUsers=new LinkedHashMap<>();
    }

}
