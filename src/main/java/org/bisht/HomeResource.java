package org.bisht;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @RequestMapping("/hello")
    public String home() {
        return "<h1>Hello World</h1>";
    }

}
