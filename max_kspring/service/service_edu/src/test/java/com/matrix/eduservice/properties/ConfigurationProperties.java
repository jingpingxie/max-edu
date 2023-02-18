package com.matrix.eduservice.properties;
//import org.springframework.boot.test.context.SpringBootTest;
/**
 * @author Jingping.Xie
 * @date 2023/1/20 17:29
 */

//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @projectName: max_kspring
 * @package: com.matrix.eduservice.properties
 * @className: ConfigurationProperties
 * @author: jingpingxie
 * @description: TODO
 * @date: 2023/1/20 17:29
 * @version: 1.0
 */
@SpringBootTest
public class ConfigurationProperties {
    @Autowired
    PersonInfoProperties personInfoProperties;
    @Value("${my-environment.name}")
    private String name;
    @Test
    public void getPersonInfoProperties() {
        System.out.println(personInfoProperties.getName() + ":" + personInfoProperties.getAge());
    }

    @Test
    public void getMyEnvironment() {
        System.out.println(name);
    }
}
