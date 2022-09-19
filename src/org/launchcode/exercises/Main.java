package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        Divide(1,2);
        Divide(1,0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");
        studentFiles.put("Bobby",null);
        studentFiles.put("Faux","IsThisGood.js");

        // Test out your CheckFileExtension() function!
        for (Map.Entry<String,String> student : studentFiles.entrySet()) {
            System.out.println(student.getKey()+", "+student.getValue()+
                    "\n   result: "+CheckFileExtension(student.getValue()));
        }
    }

    public static void Divide(int x, int y) {
        if (y == 0) {
            // throw exception
            try {
                throw new ArithmeticException("Cannot divide by zero");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(x/y);
        }
    }

    public static int CheckFileExtension(String fileName) {
        if (fileName == null || fileName.isBlank()) {
            //throw exception
            try {
                throw new NoFileException("No file submitted, resulting in -1 points.");
            } catch (NoFileException e) {
                e.printStackTrace();
            }
            return -1;
        } else {
            String ext = fileName.substring(fileName.indexOf('.'));
            if (ext.equals(".java")) {
                return 1;
            }
        }
        return 0;
    }

}
