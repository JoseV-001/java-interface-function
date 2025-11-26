package application;

import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import model.entities.Product;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<model.entities.Product> list = new ArrayList<>();

        list.add(new model.entities.Product("TV", 900.00));
        list.add(new model.entities.Product("Mouse", 50.00));
        list.add(new model.entities.Product("Tablet", 350.00));
        list.add(new model.entities.Product("HD Case", 80.90));

       List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
       //Operação map só funciona para stream, por isso a necessidade de converter

        names.forEach(System.out::println);


    }
}