package com.edw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * <pre>
 *     com.edw.controller.IndexController
 * </pre>
 *
 * @author Muhammad Edwin < emuhamma at redhat dot com >
 * 15 Feb 2020 13:38
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("/")
    public String index(HttpServletRequest request, ModelMap model) {
        String value = (String) request.getSession().getAttribute("name");
        if(value != null)
            model.put("name", value);

        return "index";
    }

    @PostMapping("/")
    public String indexPost(HttpServletRequest request, @RequestParam String value) {
        request.getSession().setAttribute("name",value);
        return "redirect:/";
    }



}
