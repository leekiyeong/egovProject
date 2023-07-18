package egovframework.example.sample.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.EgovAbstractDAO;
import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.DeptVO;

@Repository("deptDAO")
public class DeptDAO extends EgovAbstractDAO {

	public String insertDept(DeptVO vo) {
		
		return (String) insert("deptDAO.insertDept",vo);
	}
	public List<?> selectDeptList(DeptVO vo){
		
		return list("deptDAO.selectDeptList",vo);
	}
	public int selectDeptTotal(DeptVO vo) {
		return (int) select("deptDAO.selectDeptTotal",vo);
	}
	public int deleteDept(DeptVO vo) {
		return delete("deptDAO.deleteDept",vo);
	}
	public DeptVO selectDeptDetail(String deptno) {
		return (DeptVO) select("deptDAO.selectDeptDetail",deptno);
	}
	public int updateDept(DeptVO vo) {
		return update("deptDAO.updateDept",vo);
	}
	
}
