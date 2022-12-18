package com.study.board.repository;

import com.study.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

//DB에 데이터를 저장하기 위한 페이지
//
public interface BoardRepository extends JpaRepository<Board, Integer> {
}
