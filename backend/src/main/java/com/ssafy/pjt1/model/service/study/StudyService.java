package com.ssafy.pjt1.model.service.study;

import java.util.List;
import java.util.Map;

public interface StudyService {

	List<Map<String, Object>> getPromoList();

	List<Integer> getStudyId(String login_id);

	Map<String, Object> getStudyInfo(Integer board_id);

	List<Map<String, Object>> getAllList();

}
