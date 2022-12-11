package com.lucasbpaixao.fifasquadcreator.controllers.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FifaSquadCreatorAppController {
    
    @RequestMapping("/")
    public String name() {
        return "index.html";
    }
}
