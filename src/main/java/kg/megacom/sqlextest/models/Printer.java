package kg.megacom.sqlextest.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "printer")
public class Printer {

    @Id
    Integer code;
    char color;
    String type;
    double price;

    @ManyToOne
        @JoinColumn(name = "model")
    Product product;

}
