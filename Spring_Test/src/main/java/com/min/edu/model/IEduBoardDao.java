package com.min.edu.model;

import java.util.List;

import com.min.edu.vo.EduBoardVo;

public interface IEduBoardDao {

	public List<EduBoardVo> selectAllBoard();
	
}
