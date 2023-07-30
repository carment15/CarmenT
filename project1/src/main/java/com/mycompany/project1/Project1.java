/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project1;

/**
 *
 * @author CARMENT
java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PhishingDetector {
    public static void main(String[] args) {
        // Ruta del archivo de texto a explorar
        String filePath = "ruta_del_archivo.txt";

        // Lista de palabras, frases y nombres de compañías frecuentes en phishing
        String[] phishingList = {
                "Banco XYZ",
                "PayPal",
                "Actualizar información de la cuenta",
                "Verificación de seguridad",
                "Restablecer contraseña",
                "Ganador de un premio",
                "Oferta exclusiva",
                "Amazon",
                "Apple",
                "Microsoft",
                "Netflix",
                "Facebook",
                "Instagram",
                "Google",
                "Correo electrónico sospechoso",
                "Actualización de seguridad",
                "Verificación de cuenta",
                "Phishing",
                "Tarjeta de crédito",
                "Cuenta bloqueada",
                "Estimado cliente",
                "Problema con su cuenta",
                "Descuento exclusivo",
                "Herencia inesperada",
                "Lotería internacional",
                "Préstamo rápido y fácil",
                "Compra segura",
                "Phishing Awareness Training",
                "Protección contra el fraude",
                "Seguridad en línea"
        };

        // Mapa para almacenar los términos y su frecuencia de ocurrencia
        Map<String, Integer> termFrequency = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (String term : phishingList) {
                    if (line.contains(term)) {
                        termFrequency.put(term, termFrequency.getOrDefault(term, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Imprimir los términos y su frecuencia de ocurrencia
        for (String term : phishingList) {
            int frequency = termFrequency.getOrDefault(term, 0);
            System.out.println(term + " - Ocurrencias: " + frequency);
        }
    }
}
