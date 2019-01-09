package com.qfedu.boot1806.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author java1806
 * @since 2019-01-09
 */
@Data //可以省略getter和setter
@Accessors(chain = true)
public class TUser {

    private static final long serialVersionUID = 1L;

    private String phone;

    private String password;

    private Integer flag;


}
