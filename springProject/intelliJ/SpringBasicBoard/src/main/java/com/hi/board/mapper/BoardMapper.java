package com.hi.board.mapper;

import com.hi.board.domain.RequestRegBoard;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {

    int insertBoard(RequestRegBoard regBoard);

}