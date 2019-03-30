package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.WebUtils;
import pl.coderslab.model.Animal;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@SessionAttributes({"param1", "param2"})


public class Exam5Controller {
    @GetMapping(path = "/", produces = "text/html; charset=UTF-8")
    public String home(){
        return "home";
    }

    @GetMapping(path="/first/{param1}/{param2}")
    public String first(Model model, @PathVariable String param1, @PathVariable String param2){
        model.addAttribute("param1", param1);
        model.addAttribute("param2", param2);
        return "first";
    }

    @GetMapping("/check")
    public String check(Model model){
        model.addAttribute("param1", 122);
        model.addAttribute("param2",333);
    return "check";
    }

    @GetMapping("/createCookie/{cookieName}/{cookieValue}/{cookieTime}")
    @ResponseBody
    public String createCookie(HttpServletResponse response,
                               @PathVariable String cookieName,
                               @PathVariable String cookieValue,
                               @PathVariable int cookieTime){

        Cookie cookie = new Cookie(cookieName, cookieValue);
        cookie.setMaxAge(cookieTime*3600);
        response.addCookie(cookie);
        return "Ciasteczko utworzone";
    }

    @GetMapping("/deleteCookie/{cookieName}")
    @ResponseBody
    public String delCookie(HttpServletRequest request, HttpServletResponse response,
                            @PathVariable String cookieName){

        Cookie cookie = WebUtils.getCookie(request, cookieName);
        if (cookie == null){
            return "Ciasteczko nie istnieje";
        }
        else{
            System.out.println(cookieName+" = "+ cookie.getValue());
            cookie.setMaxAge(0);
            response.addCookie(cookie);

        }
        return "Ciasteczko usunięte";
    }

   /* @GetMapping(path = "/animals", produces = "text/html; charset=UTF-8")
    public String animals(){



        return "animal";
    }*/

}
