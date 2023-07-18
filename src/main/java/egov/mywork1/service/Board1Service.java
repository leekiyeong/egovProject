package egov.mywork1.service;

import java.util.List;

public interface Board1Service {
	 String insertBoard1(Board1VO vo) throws Exception;
	 List<?> selectBoard1List(DefaultVO vo) throws Exception;
	 int selectBoard1Total(DefaultVO vo) throws Exception;
}
