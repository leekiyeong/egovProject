package egovframework.example.sample.service;

import java.util.List;

public interface BoardService {
	public String insertBoard(BoardVO vo) throws Exception;
	public List<?> selectBoardList(BoardVO vo) throws Exception; 
	public int selectBoardTotal(BoardVO vo) throws Exception;
	public int deleteBoard(BoardVO vo) throws Exception;
	public BoardVO selectBoardDetail(String bno) throws Exception;
	public int updateBoard(BoardVO vo) throws Exception;
}
