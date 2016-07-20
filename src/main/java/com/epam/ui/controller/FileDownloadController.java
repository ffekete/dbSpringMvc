package com.epam.ui.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.AbstractResource;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.epam.ui.view.PathConstants;
import com.epam.ui.view.UrlConstants;

@Controller
public class FileDownloadController {

	@Autowired
	ServletContext context;

	@RequestMapping(value = UrlConstants.FILE_DOWNLOAD, method = RequestMethod.GET)
	@ResponseBody
	public AbstractResource getDownloadForm(@PathVariable String name) throws IOException {
		String downloadPath = context.getRealPath("") + File.separator + PathConstants.DOWNLOAD_FILE_PATH;
		
		return new ByteArrayResource(Files.readAllBytes(Paths.get(downloadPath + name + ".txt")));
	}
}
