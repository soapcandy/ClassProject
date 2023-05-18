package com.hi.board.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/write")
@Log4j2
public class BoardWriteController {

    @GetMapping
    public void getWriteForm(){
        log.info("GET   /board/write");
    }

}