package com.example.springcloud.domain;

import com.example.springcloud.model.UmsMember;
import com.example.springcloud.model.UmsMemberLevel;
import lombok.Data;

/**
 * @author ：图灵学院
 * @date ：Created in 2020/1/6 21:12
 * @version: V1.0
 * @slogan: 天下风云出我辈，一入代码岁月催
 * @description:
 **/
@Data
public class PortalMemberInfo extends UmsMember {
    private UmsMemberLevel umsMemberLevel;
}
