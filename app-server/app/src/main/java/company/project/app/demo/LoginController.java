/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package company.project.app.demo;

import company.project.service.submodule.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 样例登录入口
 * tip: 按子模块组织各种代码
 */
@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    DemoService demoService;

    @GetMapping("")
    public Object loginPage(){

        // tip: 不允许在web层调用再次事务，这可能引起事务无法正常回滚
        // tip: 下面为一个错误事例，产生了两个事务，应该包裹在一起
        demoService.updateDataMethod();
        demoService.writeableMethod();
        // tip: 如果需要应该这样处理
        demoService.swapperMethod();

        return "success";
    }

    @PostMapping
    public Object login(){

        return "success";
    }
}
