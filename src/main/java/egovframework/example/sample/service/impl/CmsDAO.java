package egovframework.example.sample.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.EgovAbstractDAO;
import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.CmsVO;
import egovframework.example.sample.service.DeptVO;

@Repository("cmsDAO")
public class CmsDAO extends EgovAbstractDAO{

	public String insertCms(CmsVO vo) {
		return (String) insert("cmsDAO.insertCms",vo);
	}

	public List<?> selectCmsList(CmsVO vo) {
		return list("cmsDAO.selectCmsList",vo);
	}

	public int selectCmsTotal(CmsVO vo) {
		return (int) select("cmsDAO.selectCmsTotal",vo);
	}
	public int deleteCms(CmsVO vo) {
		return delete("cmsDAO.deleteCms",vo);
	}

	public CmsVO selectCmsDetail(String cms_no) {
		return (CmsVO) select("cmsDAO.selectCmsDetail",cms_no);
	}
	
	public int updateCms(CmsVO vo) {
		return update("cmsDAO.updateCms",vo);
	}
}
