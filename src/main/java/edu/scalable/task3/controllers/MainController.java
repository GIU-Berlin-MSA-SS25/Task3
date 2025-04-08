//package edu.scalable.task3.controllers;
//
//import edu.scalable.task3.services.DatabaseSeeder;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/")
//public class MainController {
//    @Value("${instance}")
//    String instance;
//
//    DatabaseSeeder databaseSeeder;
//
//    public MainController(DatabaseSeeder databaseSeeder) {
//        this.databaseSeeder = databaseSeeder;
//    }
//
//    @GetMapping
//    public String Hello() {
//        return "Hello From Instance %s".formatted(instance);
//    }
//
//    @PostMapping("/seed")
//    public String seed() {
//        databaseSeeder.seed();
//        return "The database has been seeded successfully!!";
//    }
//}
