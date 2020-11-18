package com.target.automation.utils.ficheros;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVLector {

    public void escribirProductos(String archivo ,String articulo, String descripcion, String precio)
            throws IOException {

        CSVReader lector = new CSVReader(new FileReader(archivo));
        CSVWriter escribir = new CSVWriter(new FileWriter(archivo));
    }
}
