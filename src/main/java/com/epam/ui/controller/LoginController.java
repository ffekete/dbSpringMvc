package com.epam.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.epam.ui.view.UrlConstants;

@Controller
public class LoginController {

	@RequestMapping(value=UrlConstants.LOGIN_PAGE, method=RequestMethod.GET)
	public String getLoginPage(@RequestParam(value="login_error", required=false) Long errorCode){
		if(errorCode != null && errorCode == 1)
		{
			return "loginFailed";
		}
		return "loginPage";
	}
}
