/*
Создать проект Maven. В корень проекта положить текстовый файл с таким содержимым:
{
  "name": "java",
  "persons": [
    {
      "name": "Alex",
      "age": 22
    },
    {
      "name": "Ben",
      "age": 33
    }
  ]
}
Распарсить этот JSON и вывести обьекты через println().
 */

package chrvk.javaelementary.hw16.task1;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static final String fileName = "src/MyFile.json";

    public static String readFile() {
        File file = new File(fileName);
        Scanner in = null;
        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String json = "";
        while (in.hasNext()) {
            json += in.nextLine() + "\r\n";
        }
        return json;
    }

    public static void main(String[] args) {
        String json = readFile();
        Gson gson = new Gson();
        Group group = gson.fromJson(json, Group.class);
        System.out.println(group);
    }
}
