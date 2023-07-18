package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;

@Controller
public class DeptController {
	
	@Resource(name = "deptService")
	   private DeptService deptservice;

	   @RequestMapping("/deptWrite.do")
	   public String deptWrite() {
	      
	      return "dept/deptWrite";
	   }
	   
	   @RequestMapping("/deptWriteSave.do")
	   public String insertdept(DeptVO vo) throws Exception {
	      
	      String result = deptservice.insertDept(vo);
	      if( result == null) {
	         System.out.println("저장완료 !!!");
	      } else {
	    	  System.out.println("저장실패 ㅠㅠ");
	      }
	      
	      return "redirect:/deptList.do";
	    		  //"dept/deptList";
	   }
	   
	   @RequestMapping("/deptList.do")
	   public String selectDeptList(DeptVO vo, ModelMap model) throws Exception{
	      
	     int total = deptservice.selectDeptTotal(vo);
	     List<?> list = deptservice.selectDeptList(vo);
		  
		  model.addAttribute("resultList", list);
		  model.addAttribute("total", total);
		  return "dept/deptList";
	   }
	  
 	   
	   @RequestMapping("/deptModify.do")
	   public String selectDeptDetail(String deptno, ModelMap model) throws Exception{
		   DeptVO vo = deptservice.selectDeptDetail(deptno);
		   model.addAttribute("deptVO",vo);
		   
		   return "dept/deptModify";
	   }
	   
	   
	   @RequestMapping("/deptModifySave.do")
	   public String updateDept(DeptVO vo) throws Exception {
		   
		   int result = deptservice.updateDept(vo);
		   return "redirect:/deptList.do";
	   }
	   
	   @RequestMapping("/deptDelete.do")
	   public String deleteDept(DeptVO vo) throws Exception{
		   
		   int result = deptservice.deleteDept(vo);
		   System.out.println("삭제 완료~");
		   
		   return "redirect:/deptList.do";
	   }

}
