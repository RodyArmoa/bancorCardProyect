package model;

import lombok.Data;

@Data
public class CardModel {
    int id_card;
    String nombre;
    String numero;
    String tipo;
    int cvv;
    int estado;
}
