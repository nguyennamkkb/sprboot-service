package com.nam.nam.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ="/api/v1/Products")
public class ProductController {
	@GetMapping("")
	List<String> getAllProcducts(){
		return List.of("iphone","ipad");
	}
}
