package service;

import model.CardModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ICardRepository;

import java.util.List;
@Service
public class CardService implements ICardService{

    @Autowired
    private ICardRepository iCardRepository;
    @Override
    public List<CardModel> findAll() {
        List<CardModel> list;
        try {

            list=iCardRepository.findAll();
        }catch (Exception exception){
            throw exception;
        }

        return list;
    }

    @Override
    public int save(CardModel cardModel) {
        int row;
        try {
            row = iCardRepository.save(cardModel);
        }catch (Exception exception){
            throw exception;
        }

        return row;
    }

    @Override
    public int update(CardModel cardModel) {
        return 0;
    }

    @Override
    public int deleteById(int id) {
        return 0;
    }
}
