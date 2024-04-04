import dto.Address;
import dto.GenerateFile;
import dto.SearchCep;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        SearchCep searchCep = new SearchCep();

        System.out.println("Please input your CEP for search your address: ");
        var cep = read.nextLine();

        try{
            Address newAddress = searchCep.searchAddress(cep);
            System.out.println(newAddress);
            GenerateFile generateFile = new GenerateFile();
            generateFile.saveJson(newAddress);
        }catch (RuntimeException | IOException exception){
            System.out.println(exception.getMessage());
            System.out.println("Error: Finish the application!");
        }


    }
}
