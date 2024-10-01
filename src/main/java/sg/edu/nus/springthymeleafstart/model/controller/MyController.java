package sg.edu.nus.springthymeleafstart.model.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class MyController {
    @GetMapping("/passing_data")
    public String passing_data(Model model){
        model.addAttribute("Message", "Hello, Mr wei!");
        // 返回一个名为 example1 的视图名称，在templates目录下有example1.html
        return "passing_data";
    }

    @GetMapping("/passing_collection")
    public String passing_collection(Model model){
        List<String> items = Arrays.asList("item1", "item2", "item3");
        model.addAttribute("items", items);
        return "passing_collection";
    }

    @GetMapping("/passing_boolean")
    public String passing_boolean(Model model){
        boolean isAdmin = true;
        model.addAttribute("isAdmin", isAdmin);
        return "passing_boolean";
    }
}
