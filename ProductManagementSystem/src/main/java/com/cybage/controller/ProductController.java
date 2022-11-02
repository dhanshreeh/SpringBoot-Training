package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.model.Product;
import com.cybage.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	//	@RequestMapping("/hello")
	@GetMapping("/hello")
	public String sayHello()
	{
		return"greet";
	}
	
//	@RequestMapping("/welcome")
	@GetMapping("/welcome")
	public ModelAndView welcome(Model model)
	{
//		model.addAttribute("name", "jhon");
		return new ModelAndView("welcome","name","Jhon");
	}
	
	@GetMapping("/getAllProduct")
	public String getAllProduct() {
		List<Product> productList= productService.getAllProduct();
		System.out.println(productList);
		return "greet";
	}
}
