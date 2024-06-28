package com.min.edu.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.min.edu.vo.EduBoardVo;

import lombok.extern.slf4j.Slf4j;

@Repository
public class EduBoardDaoImpl implements IEduBoardDao {
	
	@Value("${namespace}")
	private String NS;
	
	@Autowired
	private SqlSessionTemplate session;
	
	@Override
	public List<EduBoardVo> selectAllBoard() {
		return session.selectList(NS+"selectAllBoard");
	}

	
}
