package com.qfedu.boot1806.domain;

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
public class TDictionary {

    private static final long serialVersionUID = 1L;

    private String name;

    private String value;


}
