package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.BoardService;
import egovframework.example.sample.service.BoardVO;


@Controller
public class BoardController {
	
	@Resource(name="boardService")
	public BoardService boardService;

	   @RequestMapping("/boardList.do")
	   public String selectBoardList(BoardVO vo, ModelMap model) throws Exception{
	      
	     int total = boardService.selectBoardTotal(vo);
	     List<?> list = boardService.selectBoardList(vo);
		  
		  model.addAttribute("resultList", list);
		  model.addAttribute("total", total);
		  return "board/boardList";
	   }
	   
	   @RequestMapping("/boardWrite.do")
		public String BoardWrite() {
			return "board/boardWrite";
		}
		   
		@RequestMapping("/boardWriteSave.do")
		public String insertBoard(BoardVO vo) throws Exception {
			
			String result = boardService.insertBoard(vo);
			
			return "redirect:/boardList.do";
		}
}
