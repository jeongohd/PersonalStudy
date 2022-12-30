package a.b.c.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	BoardService service;
	
	
	@GetMapping("/list.do")
	public String list(Model model, BoardVO vo) {
		model.addAttribute("data", service.list(vo));
		return "board/board";
	}
	
	@GetMapping("/view.do")
	public String view(BoardVO vo, Model model) {
		model.addAttribute("data", service.view(vo.getNo()));
		return "board/view";
	}
	
	
	
	
	
	
	
	
	
}
