package com.target.automation.utils.ficheros;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVLector {

    public String[] escribirProductos(String archivo)
            throws IOException {

        CSVReader lector = new CSVReader(new FileReader(archivo), ',');
        String[] data = lector.readNext();

        return data;
    }
}
