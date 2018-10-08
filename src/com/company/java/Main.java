package com.company.java;
////I/O classes

import com.company.java.model.ClothingItem;
import com.company.java.model.Product;
import com.company.java.model.Shirt;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {
     Path sourceFile = Paths.get("files", "loremipsom.txt");
     Path targetFile = Paths.get("files", "target.txt");

        try {
            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

//import java.io.*;
//
//public class Main {
//    public static void main(String[] args) {
//        String sourceFile = "files/loremipsom.txt";
//        String targetFile =  "files/target.txt";
//
//        try (   FileReader fileReader = new FileReader(sourceFile);
//                BufferedReader bufferedReader = new BufferedReader(fileReader);
//                FileWriter writer = new FileWriter(targetFile);
//        ){
//
//
//            while (true) {
//                String line = bufferedReader.readLine();
//                if (line == null) {
//                    break;
//                }
//                writer.write(line + "\n");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//}

//import com.company.java.model.ClothingItem;
//        import com.company.java.model.Product;
//        import com.company.java.model.Shirt;
//
//public class Main {
//    public static void main(String[] args) {
////        ClothingItem item = new ClothingItem("shirt", "L", 19.99);
////        System.out.println(item);
//// // you cannot call the setPattern() method here before the constructor because it is not a superclass
////        displayProduct(item);
//
//        Shirt shirt = new Shirt("M", 14.99);
//        displayProduct(shirt);
//        shirt.setPattern("Plaid");
//        System.out.println("this shirt has a pattern of " + shirt.getPattern());
//
//        ClothingItem reallyAShirt = new Shirt("L", 18.99);
//        displayProduct(reallyAShirt);
//
//        Shirt shirt2 = (Shirt) reallyAShirt; // this is the upcasting syntax
//        // this because I treat a sub-class as a supper class.
//        // otherwise this will through an error
//        shirt2.setPattern("Solid");
//        System.out.println("pattern = " + shirt2.getPattern());
//
//    }
//
//    private static void displayProduct(Product product){
//        String output = product.getClass().getSimpleName() + "{" +
//                "type='" + product.getType() + '\'' +
//                ", size='" + product.getSize() + '\'' +
//                ", price=" + product.getPrice() +
//                '}';
//        System.out.println(output);
//    }
//}




//package com.company.java;
//
//import com.company.java.utilities.MathHelper;
//
//import static com.company.java.utilities.MathHelper.Operation.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//	MathHelper helper = new MathHelper(100);
//
//        try {
//            while(true){
//                int input = helper.doMath("Enter a number: ",
//                        ADD);
//                int total = helper.getTotal();
//                String message = String.format(
//                        "Entered: %d, total = %d" , input, total
//);
//System.out.println(message);
//            }
//        } catch (NumberFormatException e) {
//            System.out.println("All done");
//        }
//    }
//}
