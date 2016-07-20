package com.epam.ui.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.epam.ui.view.PathConstants;
import com.epam.ui.view.UrlConstants;

@Controller
public class FileUploadController {
	
	@Autowired
    ServletContext context; 
	
	@RequestMapping(value = UrlConstants.FILE_UPLOAD, method=RequestMethod.GET)
	public String fileUpload(){
		return "uploadForm";
	}
	
	@RequestMapping(value = UrlConstants.FILE_UPLOAD, method=RequestMethod.POST)
	public String handleFormUpload(@RequestParam("name") String name, @RequestParam("file") MultipartFile file) throws IOException {

		if (!file.isEmpty()) {
			//byte[] bytes = file.getBytes();
			String uploadPath = context.getRealPath("") + File.separator + PathConstants.UPLOAD_FILE_PATH;
			
			Files.copy(file.getInputStream(), new File(uploadPath + "abc.pdf").toPath());
			
			return "redirect:" + UrlConstants.FILE_UPLOAD;
		}

		return "redirect:uploadFailure";
	}
}
