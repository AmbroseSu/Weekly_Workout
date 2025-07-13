package com.ambrose.weekly_workout;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/home")
@CrossOrigin
public class PageController {

  @GetMapping("")
  public String homePage() {
    return "index"; // đảm bảo file templates/index.html tồn tại
  }
}

