package repository;

import model.CardModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CardRepository implements ICardRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<CardModel> findAll() {
        String SQL = "SELECT * FROM cards WHERE estado = 1";
        return jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(CardModel.class));
    }

    @Override
    public int save(CardModel cardModel) {
        String SQL = "INSERT INTO cards VALUES(?,?,?,?,?,?)";
        return jdbcTemplate.update(SQL, new Object[]{cardModel.getId_card(), cardModel.getNombre(), cardModel.getNumero(),
                cardModel.getTipo(),cardModel.getCvv(),cardModel.getEstado()});
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
