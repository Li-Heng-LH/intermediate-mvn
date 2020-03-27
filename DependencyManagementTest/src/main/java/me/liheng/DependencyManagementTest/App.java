package me.liheng.DependencyManagementTest;

import me.liheng.DependencyManagementTestLibrary.DefaultRandomGenerator;
import me.liheng.DependencyManagementTestLibrary.RandomGenerator;

public class App {

    public static void main(String[] args) {

        RandomGenerator aRandomGenerator = new DefaultRandomGenerator();
        System.out.println("The number is :" + aRandomGenerator.generate());
    }
}
