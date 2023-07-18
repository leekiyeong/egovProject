package egov.mywork1.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import egov.mywork1.service.Board1Service;
import egov.mywork1.service.Board1VO;
import egov.mywork1.service.DefaultVO;

@Service("board1Service")
public class Board1ServiceImpl extends EgovAbstractServiceImpl implements Board1Service {
	
	@Resource(name = "board1DAO") //다른클래스를 사용하기 위한 작업
	Board1DAO board1DAO;
	
	@Override
	public String insertBoard1(Board1VO vo) throws Exception {
		return board1DAO.insertBoard1(vo);
	}
	
	@Override
	public List<?> selectBoard1List(DefaultVO vo) throws Exception {
		return board1DAO.selectBoard1List(vo);

	}

	@Override
	public int selectBoard1Total(DefaultVO vo) throws Exception {
		return board1DAO.selectBoard1Total(vo);
	}


}
