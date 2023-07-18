package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import egovframework.example.sample.service.CmsService;
import egovframework.example.sample.service.CmsVO;
import egovframework.example.sample.service.DeptVO;

		@Service("cmsService")
public class CmsServiceImpl extends EgovAbstractServiceImpl 
							implements CmsService {
	@Resource(name = "cmsDAO")
	private CmsDAO cmsDAO;
	
	@Override
	public String insertCms(CmsVO vo) throws Exception {
		return cmsDAO.insertCms(vo);
	}
	@Override
	public List<?> selectCmsList(CmsVO vo) throws Exception {
		return cmsDAO.selectCmsList(vo);
	}
	@Override
	public int selectCmsTotal(CmsVO vo) throws Exception {
		return cmsDAO.selectCmsTotal(vo);
	}
	@Override
	public int deleteCms(CmsVO vo) throws Exception {
		return cmsDAO.deleteCms(vo);
	}
	@Override
	public CmsVO selectCmsDetail(String cms_no) throws Exception {
		return cmsDAO.selectCmsDetail(cms_no);
	}
	@Override
	public int updateCms(CmsVO vo) throws Exception {
		return cmsDAO.updateCms(vo);
	}
}
