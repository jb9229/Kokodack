package me.kd.controller;

import me.kd.DAO.Dockjang;
import me.kd.service.DockjangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by test on 2015-09-07.
 */
@Controller
public class IntroController {

    @Autowired
    DockjangService service;

    @RequestMapping("/")
    public String intro(HttpServletRequest request, HttpServletResponse response){

        request.setAttribute("dockjang", new Dockjang());

        return "home";
    }

    @RequestMapping("/update")
    public String update(HttpServletRequest request, HttpServletResponse response){

        System.out.println("test");

        Dockjang dockjang   =   new Dockjang();

        dockjang.setTemper(27);
        dockjang.setHumidity(78);

        service.update(dockjang);

        return "hello";
    }
}
