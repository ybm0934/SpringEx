package com.pd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pd.model.PdVO;

@Controller
@RequestMapping("/pd")
public class PdController {

	private static final Logger logger = LoggerFactory.getLogger(PdController.class);

	@RequestMapping("/writeView.do")
	public String writeForm() {

		return "pd/write";
	}

	@RequestMapping("/write.do")
	public String write(@ModelAttribute("pdVo") PdVO pdVo) {
		
		

		return "pd/list";
	}

}// class
