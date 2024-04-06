package service;

import model.CardModel;

import java.util.List;

public interface ICardService {
    public List<CardModel> findAll();
    public int save(CardModel cardModel);
    public int update(CardModel cardModel);
    public int deleteById(int id);
}
