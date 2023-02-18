package com.matrix.eduservice;
/**
 * @author Jingping.Xie
 * @date 2023/1/19 15:04
 */

import com.matrix.eduservice.properties.PersonInfoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @projectName: max_kspring
 * @package: com.matrix.eduservice
 * @className: EduApplication
 * @author: jingpingxie
 * @description: TODO
 * @date: 2023/1/19 15:04
 * @version: 1.0
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.matrix"})
@EnableDiscoveryClient
@EnableFeignClients
public class EduApplication {


    public static void main(String[] args) {
        SpringApplication.run(EduApplication.class, args);
//        //language=JSON
//        String jsonString= "{\n" +
//                "  \"member\": " +
//                "[\n" +
//                "    {\n" +
//                "      \"name\": \"test1\",\n" +
//                "      \"message\": \"你好\"\n" +
//                "    },\n" +
//                "  " +
//                "  {\n" +
//                "      \"name\": \"test2\",\n" +
//                "      \"message\": \"你好\"\n" +
//                "    }\n" +
//                "  ]\n" +
//                "}";
        try {
            int i = 5;
            for (int i1 = 0; i1 < i; i1++) {

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}
