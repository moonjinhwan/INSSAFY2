package com.ssafy.pjt1.model.service.bamboo;

import java.util.List;
import java.util.Map;

import com.ssafy.pjt1.model.dto.bamboo.BambooDto;

public interface BambooService {

	public void createBamboo(BambooDto bambooDto);

	public List<Map<String, Object>> getAllList();

}
