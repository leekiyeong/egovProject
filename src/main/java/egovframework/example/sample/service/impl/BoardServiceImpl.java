package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import egovframework.example.sample.service.BoardService;
import egovframework.example.sample.service.BoardVO;

		@Service("boardService")
public class BoardServiceImpl extends EgovAbstractServiceImpl 
							implements BoardService {
	@Resource(name = "boardDAO")
	private BoardDAO boardDAO;
	
	@Override
	public List<?> selectBoardList(BoardVO vo) throws Exception {
		return boardDAO.selectBoardList(vo);
	}
	@Override
	public int selectBoardTotal(BoardVO vo) throws Exception {
		return boardDAO.selectBoardTotal(vo);
	}
	@Override
	public String insertBoard(BoardVO vo) throws Exception {
		return boardDAO.insertBoard(vo);
	}
	@Override
	public int deleteBoard(BoardVO vo) throws Exception {
		return boardDAO.deleteBoard(vo);
	}
	@Override
	public BoardVO selectBoardDetail(String bno) throws Exception {
		return boardDAO.selectBoardDetail(bno);
	}
	@Override
	public int updateBoard(BoardVO vo) throws Exception {
		return boardDAO.updateBoard(vo);
	}
}
