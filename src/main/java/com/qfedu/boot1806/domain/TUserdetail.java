package com.qfedu.boot1806.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author java1806
 * @since 2019-01-09
 */
@Data
@Accessors(chain = true)
public class TUserdetail {

    private static final long serialVersionUID = 1L;

    private Long uid;

    private String nickname;

    private String headimg;

    private Integer sex;

    private LocalDate birthday;

    private String cardno;

    private String sign;

    private LocalDateTime createtime;

    private LocalDateTime modtime;


}
