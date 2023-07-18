package egovframework.example.sample.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.EgovAbstractDAO;
import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.BoardVO;

@Repository("boardDAO")
public class BoardDAO extends EgovAbstractDAO{

	public List<?> selectBoardList(BoardVO vo) {
		return list("boardDAO.selectBoardList",vo);
	}

	public int selectBoardTotal(BoardVO vo) {
		return (int) select("boardDAO.selectBoardTotal",vo);
	}
	
	public String insertBoard(BoardVO vo) {
		return (String) insert("boardDAO.insertBoard",vo);
	}
	
	public int deleteBoard(BoardVO vo) {
		return delete("boardDAO.deleteBoard",vo);
	}

	public BoardVO selectBoardDetail(String bno) {
		return (BoardVO) select("boardDAO.selectBoardDetail",bno);
	}
	
	public int updateBoard(BoardVO vo) {
		return update("boardDAO.updateBoard",vo);
	}
}
