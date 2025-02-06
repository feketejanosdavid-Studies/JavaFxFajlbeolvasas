package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Handler {
    public ArrayList<Termes> ReadFile() {
        try {
            return tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            System.out.println("elbasztad");
            return null;  
        }
    }
    private ArrayList<Termes> tryReadFile() throws FileNotFoundException {
        ArrayList<Termes> termesLista = new ArrayList<Termes>();

        File file = new File("termes.txt");
        Scanner sc = new Scanner(file, "utf8");
        sc.nextLine();
        while(sc.hasNext()) {
            String line = sc.nextLine();
            String[] lineArray = line.split(":"); // "* [:;] *" --> ha rossz lenne az elválasztás a kapott állományban
            Termes termes = new Termes();

            termes.setId(Integer.parseInt(lineArray[0]));
            termes.setNev(lineArray[1]);
            termes.setDulo(lineArray[2]);
            termes.setMennyiseg(Integer.parseInt(lineArray[3]));
            termes.setBetakaritas(LocalDate.parse(lineArray[4]));

            termesLista.add(termes);
            
        } 
        sc.close();
        return termesLista;
        
    }
}
