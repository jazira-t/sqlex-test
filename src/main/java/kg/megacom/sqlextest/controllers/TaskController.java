package kg.megacom.sqlextest.controllers;

import kg.megacom.sqlextest.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

 @Autowired
 private TaskService taskService;


 @GetMapping("/1v1")
 public Object task1Names(@RequestParam double price) {
  return taskService.task1Name(price);
 }

 @GetMapping("/1v2")
 public Object task1Jpa(@RequestParam double price) {
  return taskService.task1Jpa(price);
 }

 @GetMapping("/1v3")
 public Object task1Native(@RequestParam double price) {
  return taskService.task1Native(price);
 }



 @GetMapping("/2v1")
 public Object task2Names(@RequestParam String type) {
  return taskService.task2Name(type);
 }

 @GetMapping("/2v2")
 public Object task2Jpa(@RequestParam String type) {
  return taskService.task2Jpa(type);
 }

 @GetMapping("/2v3")
 public Object task2Native(@RequestParam String type) {
  return taskService.task2Native(type);
 }



 @GetMapping("/3v1")
 public Object task3Names(@RequestParam double price) {
  return taskService.task3Names(price);
 }

 @GetMapping("/3v1")
 public Object task3Jpa(@RequestParam double price) {
  return taskService.task3Jpa(price);
 }

 @GetMapping("/3v1")
 public Object task3Native(@RequestParam double price) {
  return taskService.task3Native(price);
 }



 @GetMapping("/4v1")
 public Object task4Names(@RequestParam char color) {
  return taskService.task4Names(color);
 }

 @GetMapping("/4v2")
 public Object task4Jpa(@RequestParam char color) {
  return taskService.task4Jpa(color);
 }

 @GetMapping("/4v3")
 public Object task4Native(@RequestParam char color) {
  return taskService.task4Native(color);
 }

}