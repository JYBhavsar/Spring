package com.jb.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jb.demo.dao.AlienDAO;
import com.jb.demo.model.Alien;

@Controller
public class AlientController {

	@Autowired
	AlienDAO repo;
	
		@RequestMapping("/")
		public String home() {
			return "home.jsp";
		}
		
		@RequestMapping("/addAlien")
		public String addAlien(Alien alien){
			
			repo.save(alien);
			return "home.jsp";
		}
}
