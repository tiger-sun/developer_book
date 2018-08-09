package cn.tiger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.tiger.bo.UserBo;
import cn.tiger.service.IUserService;

@Controller
@RequestMapping("/devBook")
public class TestController {
	@Autowired(required=true)
	private IUserService userService;
	@RequestMapping(value="/test")
	public String test(Model model) {
		UserBo user = userService.getUserById("1");
		model.addAttribute("userName", user.getUserName());
		model.addAttribute("userPass", user.getUserPass());
		return "jsps/test";
	}
}
