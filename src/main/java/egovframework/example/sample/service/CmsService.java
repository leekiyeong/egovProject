package egovframework.example.sample.service;

import java.util.List;

public interface CmsService {
	public String insertCms(CmsVO vo) throws Exception;
	public List<?> selectCmsList(CmsVO vo) throws Exception; 
	public int selectCmsTotal(CmsVO vo) throws Exception;
	public int deleteCms(CmsVO vo) throws Exception;
	public CmsVO selectCmsDetail(String cms_no) throws Exception;
	public int updateCms(CmsVO vo) throws Exception;
}
