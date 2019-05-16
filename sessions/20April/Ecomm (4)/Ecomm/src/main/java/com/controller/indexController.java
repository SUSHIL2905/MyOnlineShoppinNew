package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.daoImpl.CategoryDaoImpl;
import com.daoImpl.UserDaoImpl;
import com.model.Category;
import com.model.User;

@Controller
public class indexController 
{
	@RequestMapping("/")
	public String  index()
	{
		return "index";
	}
	
	@RequestMapping("/DAPhome")
	public String  indexDAP()
	{
		return "DAPhome";
	}
	@RequestMapping("/js")
	public String  js()
	{
		return "jumpstart";
	}
	
	
	/*@RequestMapping("/")
	public String  indexhome()
	{
		return "index";
	}
	*/
	
	@RequestMapping("/index")
	public String  indexPage()
	{
		return "index";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ModelAndView  goToRegister()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", new User());
		mv.setViewName("register");
		return mv;
	}
	
	@Autowired
	UserDaoImpl userDaoImpl;
	
	
	@RequestMapping(value="/saveregister", method=RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute("user")User user, BindingResult res)
	{
		ModelAndView mv = new ModelAndView();
		user.setRole("ROLE_USER");
		userDaoImpl.insertUser(user);
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/admin/adding")
	public String addPage()
	{
		return "admin";
	}
	
	@Autowired
	CategoryDaoImpl categoryDaoImpl;
	@RequestMapping(value="/admin/saveCat", method=RequestMethod.POST)
	public ModelAndView saveCat(@RequestParam("cid")int cid, @RequestParam("cname")String cname)
	{
		ModelAndView mv = new ModelAndView();
		Category c = new Category();
		c.setCid(cid);
		c.setCname(cname);
		categoryDaoImpl.insertCategory(c);
		mv.setViewName("redirect:/admin/adding");
		return mv;
		
	}

}








