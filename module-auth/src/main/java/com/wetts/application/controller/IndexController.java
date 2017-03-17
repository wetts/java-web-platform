package com.wetts.application.controller;

import com.wetts.application.entity.Resource;
import com.wetts.application.entity.User;
import com.wetts.application.service.ResourceService;
import com.wetts.application.service.UserService;
import com.wetts.base.shiro.bind.annotation.CurrentUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Set;

/**
 * IndexController
 *
 * @author wetts
 * @date 2016/08/07
 */
@Controller
public class IndexController {

    @Autowired
    private ResourceService resourceService;
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(@CurrentUser User loginUser, Model model) {
        Set<String> permissions = userService.findPermissions(loginUser.getUsername());
        List<Resource> menus = resourceService.findMenus(permissions);
        model.addAttribute("menus", menus);
        return "module-auth/index";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "module-auth/welcome";
    }

}