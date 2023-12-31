package egovframework.example.sample.service;

import java.util.List;

public interface DeptService {
	//성공시 null전송
	public String insertDept(DeptVO vo) throws Exception;
	public List<?> selectDeptList(DeptVO vo) throws Exception; 
	public int selectDeptTotal(DeptVO vo) throws Exception;
	public int deleteDept(DeptVO vo) throws Exception;
	public DeptVO selectDeptDetail(String deptno) throws Exception;
	public int updateDept(DeptVO vo) throws Exception;
	
}