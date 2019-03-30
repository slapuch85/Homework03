package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.model.History;
import pl.coderslab.model.Product;

import java.util.Random;

@Controller
public class HistoryController {

    private History history;

    @Autowired
    public HistoryController(History history) {
        this.history = history;
    }


    @RequestMapping("/add-history")
    @ResponseBody
    public void addToHistory() {
        Random rand = new Random();
        history.addProduct(new Product("prod" + rand.nextInt(10), rand.nextDouble()));
    }

    @GetMapping("/show-history")
    @ResponseBody
    public String showHistory(){
        return history.toString();
    }

}
