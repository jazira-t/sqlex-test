package kg.megacom.sqlextest.dao;

import kg.megacom.sqlextest.models.Pc;
import kg.megacom.sqlextest.models.pojo.Task1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PCRepository extends JpaRepository<Pc, Integer> {

    List <Pc> findAllByPriceLessThan(double price);

    @Query("select new kg.megacom.sqlextest.models.pojo.Task1(u.product.model, u.speed, u.hd) " +
            "from Pc u where u.price < ?1")

    List<Task1> findTask1ByPrice(double price);

//    @Query(value = "select p.model, pc.price from product p\n" +
//            "join pc\n" +
//            "on p.model = pc.model\n" +
//            "where p.maker = 'B' union\n" +
//            "\n" +
//            "select p.model, l.price from product p\n" +
//            "join laptop l\n" +
//            "on p.model = l.model\n" +
//            "where p.maker = 'B'\n" +
//            "\n" +
//            "union\n" +
//            "\n" +
//            "select p.model, pr.price from product p\n" +
//            "join printer pr\n" +
//            "on p.model = pr.model\n" +
//            "where p.maker = 'B'", nativeQuery = true )
//    List<Task7View> findTask3ByPriceNative();
}
