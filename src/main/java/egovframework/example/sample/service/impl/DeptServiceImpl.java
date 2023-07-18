package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;

@Service("deptService")
public class DeptServiceImpl extends EgovAbstractServiceImpl implements DeptService {

	@Resource(name = "deptDAO")
	private DeptDAO deptDAO;
	
	@Override
	public String insertDept(DeptVO vo) throws Exception {
		
		return deptDAO.insertDept(vo);
	}

	@Override
	public List<?> selectDeptList(DeptVO vo) throws Exception {
		return deptDAO.selectDeptList(vo);
	}

	@Override
	public int selectDeptTotal(DeptVO vo) throws Exception {
		return deptDAO.selectDeptTotal(vo);
	}

	@Override
	public int deleteDept(DeptVO vo) throws Exception {
		return deptDAO.deleteDept(vo);
	}
	@Override
	public DeptVO selectDeptDetail(String deptno) throws Exception {
		return deptDAO.selectDeptDetail(deptno);
	}

	@Override
	public int updateDept(DeptVO vo) throws Exception {
		return deptDAO.updateDept(vo);
	}

}
