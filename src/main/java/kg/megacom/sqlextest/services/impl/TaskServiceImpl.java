package kg.megacom.sqlextest.services.impl;

import kg.megacom.sqlextest.dao.LaptopRepository;
import kg.megacom.sqlextest.dao.PCRepository;
import kg.megacom.sqlextest.dao.PrinterRepository;
import kg.megacom.sqlextest.dao.ProductRepository;
import kg.megacom.sqlextest.models.Laptop;
import kg.megacom.sqlextest.models.Pc;
import kg.megacom.sqlextest.models.Printer;
import kg.megacom.sqlextest.models.Product;
import kg.megacom.sqlextest.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private PCRepository pcRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private LaptopRepository laptopRepository;

    @Autowired
    private PrinterRepository printerRepository;

    @Override
    public Object task1Name(double price) {
        List<Pc> pcs = pcRepository.findAllByPriceLessThan(price);
        return pcs;
    }
    @Override
    public Object task1Jpa(double price) {
        return pcRepository.findTask1ByPrice(price);
    }

    @Override
    public Object task2Name(String type) {
        List<Product> products = productRepository.findDistinctByType(type);
        return products;
    }
        @Override
        public Object task2Jpa(String type) {
            return productRepository.findTask2ByType(type);

        }
        @Override
        public Object task2Native(String type) {
            return productRepository.findTask2ByTypeNative(type);

        }

    @Override
    public Object task3Names(double price) {
        List<Laptop> laptops = laptopRepository.findAllByPriceGreaterThan(price);
        return laptops;
    }
        @Override
        public Object task3Jpa(double price) {
        return laptopRepository.findTask3ByPrice(price);
        }

    @Override
    public Object task4Jpa(char color) {
        return null;
    }

    @Override
    public Object task1Native(double price) {
        return null;
    }

    @Override
        public Object task3Native(double price) {
            return laptopRepository.findTask3ByPriceNative(price);
        }

    @Override
    public Object task4Native(char color) {
        return null;
    }


    @Override
    public Object task4Names(char color) {
        List<Printer> printers = printerRepository.findAllByColor(color);
        return printers;
    }



}
