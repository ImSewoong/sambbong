package com.min.edu.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.min.edu.model.IEduBoardService;
import com.min.edu.vo.EduBoardVo;


@Repository("/board")
@Controller
public class EduBoardController {

	@Autowired
	private IEduBoardService service;
	
	@GetMapping
	public String allboard(Model model) {
		List<EduBoardVo> list = service.selectAllBoard();
		model.addAttribute("list",list);
		
		return "board";
	}
	
	
	
}
