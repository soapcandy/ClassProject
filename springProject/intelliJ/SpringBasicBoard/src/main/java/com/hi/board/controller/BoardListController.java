package com.hi.board.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class BoardListController {

    @RequestMapping("/board/list")
    public void boardList(){
        log.info("/board/list ...");
    }

}