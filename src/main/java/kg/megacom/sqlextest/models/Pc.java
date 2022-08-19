package kg.megacom.sqlextest.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "pc")
public class Pc {

    @Id
    Integer code;
    int speed;
    int ram;
    double hd;
    String cd;
    double price;

    @ManyToOne
            @JoinColumn(name = "model")
    Product product;

}
