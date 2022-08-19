package kg.megacom.sqlextest.dao;

import kg.megacom.sqlextest.models.Printer;
import kg.megacom.sqlextest.models.Product;
import kg.megacom.sqlextest.models.pojo.Task2;
import kg.megacom.sqlextest.models.pojo.Task2View;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

     List<Product> findDistinctByType(String type);//task2


    @Query("select distinct new kg.megacom.sqlextest.models.pojo.Task2 (p.maker) from Product p where p.type = ?1")

    List<Task2> findTask2ByType (String type);

    @Query(value = "select distinct maker from Product where type = ?1", nativeQuery = true)
    List<Task2View> findTask2ByTypeNative(String type);
}
