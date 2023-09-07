package com.example.PeaceFood.controllers;

import com.example.PeaceFood.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/")
    public String products(Model model){
        model.addAttribute("products", productService.getAll());
        return "products";
    }
    @RequestMapping("/products/{id}")
    public @ResponseBody String product(Model model, @PathVariable(value="id") long id){
        model.addAttribute("");
        return "product";
    }
}
