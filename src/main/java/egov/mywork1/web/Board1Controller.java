package egov.mywork1.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import egov.mywork1.service.Board1Service;
import egov.mywork1.service.Board1VO;
import egov.mywork1.service.DefaultVO;

@Controller
public class Board1Controller {
	
	@Resource(name = "board1Service")
	Board1Service board1Service;
	
	@RequestMapping("/board1Write.do")
	public String board1Write() {
		
		return "board1/board1Write";
	}
	@RequestMapping("/board1WriteSave.do")
	@ResponseBody
	public String insertBoard1(Board1VO vo) throws Exception {
		
		//암호체크 (6~12)
		String pass = vo.getPass();
		String data = "";
		if( pass.length() < 6 || pass.length() > 12 ) {
			data = "len_over";
		} else {
			//insert -> 성공 : null , 실패 : 오류
			String result = board1Service.insertBoard1(vo);
			data = (result == null)?"ok":"fuck";
		}
		return data;
	}
	@RequestMapping("/board1List.do")
	public String selectBoard1List(DefaultVO vo,ModelMap model) throws Exception {
		
		//현재페이지 번호
		int pageIndex = vo.getPageIndex();
		//firstIndex 값 계산
		int firstIndex = (pageIndex-1) * 10 + 1;
		//lastIndex 값 계산
		int lastIndex = firstIndex + (10-1);
		
		vo.setFirstIndex(firstIndex);
		vo.setLastIndex(lastIndex);
				
		int total = board1Service.selectBoard1Total(vo);
		
		int lastPage = (int) Math.ceil((double)total/10);
		vo.setLastPage(lastPage);
		
		List<?> list = board1Service.selectBoard1List(vo);
		
		model.addAttribute("defaultVO",vo);
		model.addAttribute("total",total);
		model.addAttribute("resultList",list);
		
		return "board1/board1List";
		
		//System.out.println("list ::::::::::::::::: " + list);
		//System.out.println(" map :::: " + list.get(i) );
		//Map<String,Integer> map = new HashMap<String,Integer>();
		//for(int i=0; i<list.size(); i++) {
		//	map = (Map<String,Integer>) list.get(i);
			//System.out.println(" map.hits ::::" + map.get("hits") );
		//	int h1 = (int) map.get("hits");
		//	h1 = h1+100;
		//	map.put("hits", h1);
		//	list.add(i,map);
		//}
		
	}
}
