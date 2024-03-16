package br.com.fiap.Checkpoint1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
    @Autowired
    private Environment env;
    @GetMapping("/ping")
    public String ping() {
        String profile = env.getProperty("spring.profiles.active");
        if ("dev".equals(profile)) {
            return "Pong em dev";
        } else if ("stg".equals(profile)) {
            return "Pong em stg";
        } else if ("prd".equals(profile)) {
            return "Pong em prd";
        } else {
            return "Pong";
        }
    }
}
