package by.alhr.Hw2_Task4_RandomGenerator;

import by.alhr.Hw2_Task4_RandomGenerator.service.RandomGeneratorService;

public class RandomGeneratorDemo {

    public static void main(String[] args) {
        Thread thread = new Thread(new RandomGeneratorService());
        thread.start();
//		SpringApplication.run(RandomGeneratorDemo.class, args);
    }

}
