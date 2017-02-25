package org.bhavneshgugnani.springboot.isalive;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IsAliveController {
    @RequestMapping(value={"/isalive"})
    public String isAlive() {
        return "alive";
    }
}