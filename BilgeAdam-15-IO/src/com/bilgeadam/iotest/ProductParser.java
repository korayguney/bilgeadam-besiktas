package com.bilgeadam.iotest;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductParser {
    public static void main(String[] args) {
        Reader reader = null;
        BufferedReader bufferedReader = null;
        try {
            reader = new FileReader("C:\\Users\\koray\\IdeaProjects\\BilgeAdam-Besiktas\\BilgeAdam-15-IO\\src\\com\\bilgeadam\\iotest\\products.txt");
            bufferedReader = new BufferedReader(reader);

            String line;
            List<Product> products = new ArrayList<>();

            while ((line = bufferedReader.readLine()) != null) {
                String[] lineArr = line.split("-");
                Product product = new Product(lineArr[0], lineArr[1], Integer.valueOf(lineArr[2]));
                products.add(product);
            }

            System.out.println("******************");
            System.out.println("COMPUTERS");
            writeParsedProductInfo(products, "computer");

            System.out.println("******************");
            System.out.println("TABLETS");
            writeParsedProductInfo(products, "tablet");

            System.out.println("******************");
            System.out.println("PHONES");
            writeParsedProductInfo(products, "phone");

            calculateTotalPriceOfAllProducts(products);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void calculateTotalPriceOfAllProducts(List<Product> products) {
        //Integer result = products.stream().map(product -> product.getpPrice()).reduce((p1, p2) -> p1 + p2).get();
        //Integer result = products.stream().filter(product -> product.getpType().equals("computer")).mapToInt(p -> p.getpPrice()).sum();
        Integer result = products.stream().mapToInt(p -> p.getpPrice()).sum();

        /*
        int sum = 0;
        for (Product product : products) {
            sum += product.getpPrice();
        }
         */
        System.out.println("******************");
        System.out.println("Total price of products: " + result);
    }

    private static void writeParsedProductInfo(List<Product> products, String pType) {
        for (Product product : products) {
            if (product.getpType().equals(pType)) {
                System.out.printf("\t%s:%d\n", product.getpBrand(), product.getpPrice());
            }
        }
    }

}
