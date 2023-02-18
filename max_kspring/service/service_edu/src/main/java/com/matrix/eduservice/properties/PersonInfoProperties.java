package com.matrix.eduservice.properties;
/**
 * @author Jingping.Xie
 * @date 2023/1/20 17:22
 */

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @projectName: max_kspring
 * @package: com.matrix.eduservice.properties
 * @className: PersonInfoProperties
 * @author: jingpingxie
 * @description: TODO
 * @date: 2023/1/20 17:22
 * @version: 1.0
 */
@Component
@ConfigurationProperties(prefix = "personinfo")
@Getter
@Setter
public class PersonInfoProperties {
    private String name;
    private int age;
}
