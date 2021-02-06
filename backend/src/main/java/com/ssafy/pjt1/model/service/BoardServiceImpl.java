package com.ssafy.pjt1.model.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.pjt1.model.dto.board.BoardDto;
import com.ssafy.pjt1.model.dto.user.UserDto;
import com.ssafy.pjt1.model.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private SqlSession sqlSession;

	public static final Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);

	@Override
	public void createBoard(BoardDto boardDto) {
		sqlSession.getMapper(BoardMapper.class).createBoard(boardDto);
	}

	@Override
	public void subscribe(Map<String, Object> map) {
		sqlSession.getMapper(BoardMapper.class).subscribe(map);
	}

	@Override
	public void addFunction(Map<String, Object> map) {
		sqlSession.getMapper(BoardMapper.class).addFunction(map);

	}

	@Override
	public int isSubscribed(Map<String, Object> map) {
		return sqlSession.getMapper(BoardMapper.class).isSubscribed(map);
	}

	@Override
	public void unsubscribe(Map<String, Object> map) {
		sqlSession.getMapper(BoardMapper.class).unsubscribe(map);

	}

	@Override
	public List<UserDto> searchUser(String keyword) {
		return sqlSession.getMapper(BoardMapper.class).searchUser(keyword);
	}

	@Override
	public void updateManager(Map<String, Object> map) {
		sqlSession.getMapper(BoardMapper.class).updateManager(map);
	}

	@Override
	public int modifyBoard(BoardDto boardDto) {
		return sqlSession.getMapper(BoardMapper.class).modifyBoard(boardDto);
	}

	@Override
	public List<BoardDto> getBoardsNew() {
		return sqlSession.getMapper(BoardMapper.class).getBoardsNew();
	}

	@Override
	public List<BoardDto> getBoardsPopular() {
		return sqlSession.getMapper(BoardMapper.class).getBoardsPopular();
	}

	@Override
	public List<BoardDto> searchBoardNew(String keyword) {
		return sqlSession.getMapper(BoardMapper.class).searchBoardNew(keyword);
	}

	@Override
	public List<BoardDto> searchBoardPopular(String keyword) {
		return sqlSession.getMapper(BoardMapper.class).searchBoardPopular(keyword);
	}

	@Override
	public int deleteBoard(int board_id) {
		return sqlSession.getMapper(BoardMapper.class).deleteBoard(board_id);
	}

	@Override
	public BoardDto detailBoard(int board_id) {
		return sqlSession.getMapper(BoardMapper.class).detailBoard(board_id);
	}

	@Override
	public int isUnSubscribed(Map<String, Object> map) {
		return sqlSession.getMapper(BoardMapper.class).isUnSubscribed(map);
	}

	@Override
	public void updateSubscribe(Map<String, Object> map) {
		sqlSession.getMapper(BoardMapper.class).updateSubscribe(map);
	}

	@Override
	public void deleteBoardAll(int board_id) {
		sqlSession.getMapper(BoardMapper.class).deleteBoardAll(board_id);
	}

	@Override
	public void deleteSubscription(int board_id) {
		sqlSession.getMapper(BoardMapper.class).deleteSubscription(board_id);
	}

	@Override
	public void deletePostAll(int board_id) {
		sqlSession.getMapper(BoardMapper.class).deletePostAll(board_id);
	}

	@Override
	public void deleteCalendar(int board_id) {
		sqlSession.getMapper(BoardMapper.class).deleteCalendar(board_id);
	}

	@Override
	public void deleteCheckList(int board_id) {
		sqlSession.getMapper(BoardMapper.class).deleteCheckList(board_id);
	}

	@Override
	public void deleteVote(int board_id) {
		sqlSession.getMapper(BoardMapper.class).deleteVote(board_id);
	}

	@Override
	public List<Integer> getVoteList(int board_id) {
		return sqlSession.getMapper(BoardMapper.class).getVoteList(board_id);
	}

	@Override
	public List<Integer> getPostList(int board_id) {
		return sqlSession.getMapper(BoardMapper.class).getPostList(board_id);
	}

	@Override
	public int getBoardCount(int board_id) {
		return sqlSession.getMapper(BoardMapper.class).getBoardCount(board_id);
	}

	@Override
	public int getIdbyPostId(int post_id) {
		return sqlSession.getMapper(BoardMapper.class).getIdbyPostId(post_id);
	}

	@Override
	public int isManager(Map<String, Object> map) {
		return sqlSession.getMapper(BoardMapper.class).isManager(map);
	}

	@Override
	public Map<String, String> getBoardInfo(String board_id) {
		return sqlSession.getMapper(BoardMapper.class).getBoardInfo(board_id);
	}

}
