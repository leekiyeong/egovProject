package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.CmsService;
import egovframework.example.sample.service.CmsVO;
import egovframework.example.sample.service.DeptVO;


@Controller
public class CmsController {
	
	@Resource(name="cmsService")
	public CmsService cmsService;
	
	@RequestMapping("/cmsWrite.do")
	public String cmsWrite() {
		return "cms/cmsWrite";
	}
	   
	@RequestMapping("/cmsWriteSave.do")
	public String insertCms(CmsVO vo) throws Exception {
		
		String result = cmsService.insertCms(vo);
		
		return "redirect:/cmsList.do";
	}
	
	   @RequestMapping("/cmsList.do")
	   public String selectCmsList(CmsVO vo, ModelMap model) throws Exception{
	      
	     int total = cmsService.selectCmsTotal(vo);
	     List<?> list = cmsService.selectCmsList(vo);
		  
		  model.addAttribute("resultList", list);
		  model.addAttribute("total", total);
		  return "cms/cmsList";
	   }
	   
	   @RequestMapping("/cmsModify.do")
	   public String selectCmsDetail(String cms_no, ModelMap model) throws Exception{
		   CmsVO vo = cmsService.selectCmsDetail(cms_no);
		   model.addAttribute("cmsVO",vo);
		   
		   return "cms/cmsModify";
	   }
	   
	   @RequestMapping("/cmsModifySave.do")
	   public String updateCms(CmsVO vo) throws Exception {
		   
		   int result = cmsService.updateCms(vo);
		   return "redirect:/cmsList.do";
	   }
 	   
	
	@RequestMapping("/cmsDelete.do")
	   public String deleteCms(CmsVO vo) throws Exception{
		   
		   int result = cmsService.deleteCms(vo);
		   System.out.println("삭제 완료~");
		   
		   return "redirect:/cmsList.do";
	   }
}
