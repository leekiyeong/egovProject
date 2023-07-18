package egov.mywork1.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.EgovAbstractDAO;
import org.springframework.stereotype.Repository;

import egov.mywork1.service.Board1VO;
import egov.mywork1.service.DefaultVO;

@Repository("board1DAO")
public class Board1DAO extends EgovAbstractDAO {

	public String insertBoard1(Board1VO vo)  {

		return (String) insert("board1DAO.insertBoard1",vo);
	}

	public List<?> selectBoard1List(DefaultVO vo) {
		
		return list("board1DAO.selectBoard1List",vo);

	}

	public int selectBoard1Total(DefaultVO vo) {
		return (int) select("board1DAO.selectBoard1Total",vo);
	}
	
}
