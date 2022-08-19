package kg.megacom.sqlextest.dao;

import kg.megacom.sqlextest.models.Printer;
import kg.megacom.sqlextest.models.pojo.Task2;
import kg.megacom.sqlextest.models.pojo.Task2View;
import kg.megacom.sqlextest.models.pojo.Task4;
import kg.megacom.sqlextest.models.pojo.Task4View;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrinterRepository extends JpaRepository<Printer, Integer> {

    List<Printer> findAllByColor(char color); //task4


    @Query("select new kg.megacom.sqlextest.models.pojo.Task4 (pr.product.model, pr.color, pr.code, pr.type) from Printer pr where pr.color = ?1")
    List<Task4> findTask4ByColor(char color);


    @Query(value = "select pr from Printer pr where pr.color = ?1")
    List<Task4View> findTask4ByColorNative(char color);
}
