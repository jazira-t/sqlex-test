package kg.megacom.sqlextest.dao;

import kg.megacom.sqlextest.models.Laptop;
import kg.megacom.sqlextest.models.pojo.Task3;
import kg.megacom.sqlextest.models.pojo.Task3View;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

    List<Laptop> findAllByPriceGreaterThan(double price);

    @Query("select new kg.megacom.sqlextest.models.pojo.Task3 (l.product.model, l.ram, l.screen) from Laptop l where l.price > ?1")
    List<Task3> findTask3ByPrice(double price);

    @Query(value = "select model, ram, screen from Laptop where price > ?1", nativeQuery = true)
    List<Task3View> findTask3ByPriceNative(double price);
}

