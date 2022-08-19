package kg.megacom.sqlextest.models;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "laptop")
public class Laptop {

    @Id
    Integer code;
    int speed;
    int ram;
    double hd;
    double price;
    int screen;

    @ManyToOne
            @JoinColumn(name = "model")
    Product product;
}
