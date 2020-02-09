package club.lylgjiang.manage_tms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname HelloController
 * @Description Hello 测试
 * @Date 2020/2/9 19:06
 * @Created by 姜立成
 */
@RestController
@RequestMapping("/test")
public class HelloController {

    @GetMapping("/say")
    public Map<String, Object> sayHello() {

        Map<String, Object> map = new HashMap<>();
        map.put("say", "Hello World");

        return map;
    }

}
