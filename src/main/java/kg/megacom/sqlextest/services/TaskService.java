package kg.megacom.sqlextest.services;

public interface TaskService {

    Object task1Name(double price);

    Object task2Name(String type);

    Object task3Names(double price);

    Object task4Names(char color);

    Object task1Jpa(double price);

    Object task2Jpa(String type);

    Object task3Jpa(double price);

    Object task4Jpa(char color);

    Object task1Native(double price);

    Object task2Native(String type);

    Object task3Native(double price);

    Object task4Native(char color);
}
