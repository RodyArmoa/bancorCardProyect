package repository;

import model.CardModel;

import java.util.List;

public interface ICardRepository {
    public List<CardModel> findAll();
    public int save(CardModel cardModel);
    public int update(CardModel cardModel);
    public int deleteById(int id);

}
