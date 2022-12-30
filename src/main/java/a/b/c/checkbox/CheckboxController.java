package a.b.c.checkbox;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CheckboxController {
	
	@RequestMapping("checkbox")
	public void checkbox() {}
	
	@RequestMapping("checkbox.do")
	@ResponseBody
	public int[] check(CheckVO vo) {
		
		int len = vo.getCb().length;
		int[] container = new int[len];
		
		int i = 0;
		for(int temp : vo.getCb()) {
			container[i] = temp;
			System.out.println(container[i]);
			i++;
		}
		return container;
	
	}
//	@RequestMapping("checkbox.do")
//	public void check(CheckVO vo) {
//		
//		int len = vo.getCb().length;
//		int[] container = new int[len];
//		
//		int i = 0;
//		for(int temp : vo.getCb()) {
//			container[i] = temp;
//			System.out.println(container[i]);
//			i++;
//		}
//		
//	}

}
