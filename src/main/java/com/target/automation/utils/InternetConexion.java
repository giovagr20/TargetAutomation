package com.target.automation.utils;

import javax.net.ssl.HttpsURLConnection;
import java.net.URL;

public class InternetConexion {

    public String obtenerEstadoConexion (String strUrl) {
        String conStatus = null;
        try {
            URL url = new URL(strUrl);
            HttpsURLConnection huc = (HttpsURLConnection) url.openConnection();
            huc.connect();
            conStatus = "Online";
            System.out.println("El estado de internet está: "+conStatus);
        } catch (Exception e) {
            conStatus = "Offline";
            System.out.println("El estado de internet está: "+conStatus);
        }
        return conStatus;
    }
}
