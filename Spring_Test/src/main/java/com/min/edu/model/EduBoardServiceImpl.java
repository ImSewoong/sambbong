package com.min.edu.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.edu.vo.EduBoardVo;

@Service
public class EduBoardServiceImpl implements IEduBoardService {

	@Autowired
	private IEduBoardDao dao;
	
	@Override
	public List<EduBoardVo> selectAllBoard() {
		return dao.selectAllBoard();
	}

	
	
}
