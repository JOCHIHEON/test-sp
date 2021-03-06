package com.test.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.sp.dao.TtInfoDAO;
import com.test.sp.vo.TtInfo;

@Repository
public class TtInfoDAOImpl implements TtInfoDAO{

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<TtInfo> getTtInfoList() {
		return ss.selectList("com.test.sp.TTINFO.selectListTTINFO");
	}

	@Override
	public TtInfo getTtinfo(int tnum) {
		return ss.selectOne("com.test.sp.TTINFO.selectTTINFO",tnum);
	}

}
