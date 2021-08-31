package com.app.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.user.mapper.UserMapper;
import com.app.user.model.UserVO;

@Controller
public class UserController {

	@Autowired
	private UserMapper mapper;
	
	@RequestMapping("/user/get")
	public ModelAndView getUser(@RequestParam("id") String id, ModelAndView mav){
		UserVO user = mapper.getUser(id);
		mav.addObject("user", user);
		mav.setViewName("getUser");
		return mav;
	}
	
	@RequestMapping("/user/getList")
	public ModelAndView getUserList(ModelAndView mav){
		List<UserVO> userList = mapper.getUserList();
		mav.addObject("userList", userList);
		mav.setViewName("getUserList");
		return mav;
	}
	
	@RequestMapping("/user/put")
	public String insertUser(UserVO user){
		int result = mapper.insertUser(user);
		if(result == 1){
			return "redirect:/user/getList";
		}
		return null;
	}
	
	@RequestMapping("/user/update")
	public String updateUser(UserVO user){
		int result = mapper.updateUser(user);
		if(result == 1){
			return "redirect:/user/getList";
		}
		return null;
	}
	
	@RequestMapping("/user/delete")
	public String updateUser(@RequestParam("id") String id){
		int result = mapper.deleteUser(id);
		if(result == 1){
			return "redirect:/user/getList";
		}
		return null;
	}
}
