/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treballfinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Character.isDigit;

/**
 *
 * @author USUARIO
 */
public class TreballFinal {
    public final char blanc = ' ';
    public final char fiSequencia = '.';
    private char[] frase;
    private int ind;
    private int lin,col;
    
    public void inici() throws IOException {
        presentacio();
    }   
    public void presentacio() throws IOException {
          
        LT teclat = new LT();
        String arxiu;
        System.out.println("*****************************");
        System.out.println("*****************************");
        System.out.println("Introduiex un arxiu:");
        arxiu = teclat.llegirLiniaS();
        File file = new File(arxiu);
        TreballFinal treballFinal = new TreballFinal();
        treballFinal.contarCaracters(file);
        treballFinal.contarParaules(file);
        treballFinal.contarLinies(file);
          
    }
    
    public void contarCaracters(File file){
          
        int numCaracters = 0;
        for (int i = 0; i < file.length(); i++) {
            numCaracters++;
        }
        
        System.out.println("Nombre de caràcters: " + numCaracters);
        
        }
    
    public void contarParaules(File file) throws FileNotFoundException, IOException{
       
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader br = new BufferedReader(input);
        
        int caracter = 0;
        
        int numParaules = 0;
        while ((caracter = br.read()) != -1) {
            
            char car = (char)caracter;
            if(car == ' ' || caracter == 10) {
               numParaules++; 
            }
            
        }
        numParaules++;        
        System.out.println("Nombre de paraules: " + numParaules);  
        
    }
    
    public void contarLinies(File file) throws FileNotFoundException, IOException{

    FileInputStream fileStream = new FileInputStream(file);
    InputStreamReader input = new InputStreamReader(fileStream);
    BufferedReader br = new BufferedReader(input);

    int caracter = 0;

    int numLinies = 1; // mínim hi haurà una linia sempre
    while ((caracter = br.read()) != -1) {

        if(caracter == 10) {
           numLinies++; 
        }

    }
    System.out.println("Nombre de linies: " + numLinies);  

    }
    
    public static void main(String[] args) throws IOException {
        (new TreballFinal()).inici();
        
    }    
    
}   