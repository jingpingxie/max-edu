package com.matrix.eduservice.controller;
/**
 * @author Jingping.Xie
 * @date 2023/1/23 10:54
 */

import com.matrix.commonutils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @projectName: max_kspring
 * @package: com.matrix.eduservice.controller
 * @className: EduLoginController
 * @author: jingpingxie
 * @description: TODO
 * @date: 2023/1/23 10:54
 * @version: 1.0
 */
@Api(description = "模拟登陆")
@RestController
@RequestMapping("/eduuser")
//@CrossOrigin 引入网关后，要去掉这里的跨域注解
public class EduLoginController {
    @ApiOperation(value = "登陆")
    @PostMapping("login")
    public R login() {
        return R.ok().data("token", "admin");
    }

    @ApiOperation(value = "用户信息")
    @GetMapping("info")
    public R info() {
        return R.ok().data("roles", "admin")
                .data("name", "admin")
                .data("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    }
}
