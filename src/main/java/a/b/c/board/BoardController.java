package a.b.c.board;

import java.io.File;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;



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
	
	@GetMapping("/writeForm")
	public void writeForm() {}
	
	@GetMapping("/editForm")
	public String editFrom(BoardVO vo, Model model) {
		model.addAttribute("data", service.edit(vo.getNo()));
		return "board/editForm";
	}
	
	@RequestMapping("/edit.do")//파일삭제와 파일수정은 다른 처리!! if문 따로 작성
	public String editeProcess(BoardVO vo,@RequestParam MultipartFile filename, HttpServletRequest req) {	
		//파일삭제 체크를 했을때
		if(vo.getFilename_chk() == 1) {
			String fDirectory = req.getServletContext().getRealPath("/upload");
			File file = new File(fDirectory + File.separator + vo.getFilename_real());
				if(file.exists()) {
					file.delete();
				}
		}
		//글수정 + 파일추가 할때
		if(!filename.isEmpty()) {
			String org = filename.getOriginalFilename();
			String ext = org.substring(org.lastIndexOf(".")); // .확장자
			String real = new Date().getTime()+ext;
			
			String pate = req.getRealPath("/upload/");
			try {
				filename.transferTo(new File(pate+real));
			}catch(Exception e) {
				e.printStackTrace();
			}
			vo.setFilename_org(org);
			vo.setFilename_real(real);
		}
 		service.update(vo);
 		
		return "redirect:view.do?no="+vo.getNo();
	}
	
	@PostMapping("/write.do")
	public String ProcessToWrite(BoardVO vo, @RequestParam MultipartFile filename, HttpServletRequest req) {
		if(!filename.isEmpty()) {
			String org = filename.getOriginalFilename();
			String ext = org.substring(org.lastIndexOf(".")); // .확장자
			String real = new Date().getTime()+ext;
			
			String pate = req.getRealPath("/upload/");
			try {
				filename.transferTo(new File(pate+real));
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			vo.setFilename_org(org);
			vo.setFilename_real(real);
		}
		service.insert(vo);
		return "redirect:list.do";
	}
	
	
	
	
	
	
	
	
}
