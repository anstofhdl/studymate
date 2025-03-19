package org.codenova.studymate.controller;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.codenova.studymate.model.LoginLog;
import org.codenova.studymate.model.User;
import org.codenova.studymate.repository.AvatarRepository;
import org.codenova.studymate.repository.LoginLogRepository;
import org.codenova.studymate.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/my")
@AllArgsConstructor

public class MyController {
    private LoginLogRepository loginLogRepository;


    @RequestMapping("/profile")
    public String MyHandle(Model model, HttpSession session) {
        User user =(User) session.getAttribute("user");
        model.addAttribute("user", user);
        LoginLog latestlog = loginLogRepository.findLatestByUserId(user.getId());
        model.addAttribute("latestLog", latestlog);


        return "my/profile";

    }






}
