package com.nhnacademy._vidiabookstorefront.controller;

import com.nhnacademy._vidiabookstorefront.service.FrontService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class FrontController {

    private final FrontService frontService;

    public FrontController(FrontService frontService) {
        this.frontService = frontService;
    }

    @GetMapping("/")
    public String index(Model model) {
        String result = frontService.getBook();
        model.addAttribute("bookMessage", result);

        return "index";
    }
}
