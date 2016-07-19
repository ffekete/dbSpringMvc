package com.epam.ui.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.epam.ui.view.UrlConstants;

@Controller
public class FileUploadController {
	@RequestMapping(value = UrlConstants.FILE_UPLOAD, method=RequestMethod.GET)
	public String fileUpload(){
		return "uploadForm";
	}
	
	@RequestMapping(value = UrlConstants.FILE_UPLOAD, method=RequestMethod.POST)
	public String handleFormUpload(@RequestParam("name") String name, @RequestParam("file") MultipartFile file) throws IOException {

		if (!file.isEmpty()) {
			//byte[] bytes = file.getBytes();
			
			file.transferTo(new File("D:\feree.txt"));
			
			return "redirect:" + UrlConstants.FILE_UPLOAD;
			// store the bytes somewhere return "redirect:uploadSuccess";
		}

		return "redirect:uploadFailure";
	}
}
