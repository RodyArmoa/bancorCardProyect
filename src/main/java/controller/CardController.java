package controller;

import model.CardModel;
import model.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.ICardRepository;
import service.ICardService;

import java.util.List;


@RestController
@RequestMapping("banco")
@CrossOrigin("*")
public class CardController {

    @Autowired
    private ICardService iCardService;

    @GetMapping("/cards/list")
    public ResponseEntity<List<CardModel>>list(){

        var resul = iCardService.findAll();
        return new ResponseEntity<>(resul, HttpStatus.OK);
    }

}
