package com.test.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.sp.dao.TtInfoDAO;
import com.test.sp.service.TtInfoService;
import com.test.sp.vo.TtInfo;

@Service
public class TtInfoServiceImpl implements TtInfoService {

	@Autowired
	private TtInfoDAO tidao;
	
	@Override
	public List<TtInfo> getTtInfoList() {
		return tidao.getTtInfoList();
	}

	@Override
	public TtInfo getTtinfo(int tnum) {
		return tidao.getTtinfo(tnum);
	}

}
