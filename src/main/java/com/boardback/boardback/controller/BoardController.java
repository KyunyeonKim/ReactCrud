package com.boardback.boardback.controller;

import com.boardback.boardback.entity.Board;
import com.boardback.boardback.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class BoardController {


    @Autowired
    private BoardService boardService;

    @GetMapping("/board")
    public List<Board> getAllBoards(){
        return boardService.getAllBoard();
    }

    @PostMapping("/board")
    public Board createBoard(@RequestBody Board board){
        return boardService.createBoard(board);
    }

    @GetMapping("/board/{no}")
    public ResponseEntity<Board>getBoardByNo(@PathVariable Integer no){
        return  boardService.getBoard(no);
    }

    @PutMapping("/board/{no}")
    public ResponseEntity<Board>updateBoardByNo(@PathVariable Integer no,@RequestBody Board board){
        return  boardService.updateBoard(no,board);
    }

    @DeleteMapping("/read-board/{no}")
    public ResponseEntity<Map<String,Boolean>> deleteBoardByNo(@PathVariable Integer no){
        return boardService.deleteBoard(no);
    }


}

