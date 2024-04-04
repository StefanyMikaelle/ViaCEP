package dto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GenerateFile {
    public void saveJson(Address address) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fileWriter = new FileWriter(address.cep() + ".json");
        fileWriter.write(gson.toJson(address));
        fileWriter.close();
    }
}
