package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchLogger {
    public static void main(String[] args) {
        try {
            //setup formatter for log dates & scanner for log input
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            Scanner scanner = new Scanner(System.in);

            BufferedWriter writer = new BufferedWriter(new FileWriter("logs.txt", true));

            writer.write(LocalDateTime.now().format(formatter) + " launch");

            while (true) {
                System.out.println("Enter a search term (X to exit): ");
                String searchTerm = scanner.nextLine();

               /* if ("X".equalsIgnoreCase(searchTerm)) {
                    logAction("exit");
                    break;
                }else{
                    logAction("search: " + searchTerm);
                }*/
            }


        } catch (Exception e) {

        }
    }
}
