package sg.edu.nus.springthymeleafstart.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import sg.edu.nus.springthymeleafstart.model.domain.User;

@Controller
public class UserController {
    // 该方法处理 HTTP GET 请求，用于展示表单页面
    @GetMapping("/userForm")
    // Spring MVC 提供的 Model 对象，用来在控制器和视图之间共享数据test test
    public String userForm(Model model){
        // 将一个新的 User 对象添加到模型中，并传递给视图
        model.addAttribute("user", new User());
        // 返回名为 Post_userForm 的 Thymeleaf 模板，用于渲染表单页面
        return "Post_userForm";
    }

    // 该方法处理 HTTP POST 请求，用于接收和处理表单提交的数据
    @PostMapping("/saveUser")
    // 使用 @ModelAttribute 注解，Spring MVC 会将提交的表单数据自动绑定到 User 对象上
    public String saveUser(@ModelAttribute User user){
        System.out.println("Received user: " + user.getName());
        return "redirect:/userForm";
    }

}
