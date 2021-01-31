package treballfinal;

/**
 *
 * @author mascport
 */
public class Paraula {
// Constants públiques
    private final int TRAM = 10;
    public static final char blanc = ' ';
// ATRIBUTS
    private char[] lletres;
    private int llargaria;
    private int capaci = 20;

// Constructor
    public Paraula() {
        lletres = new char[capaci];
        llargaria = 0;
    }

    public Paraula(char[] s) {
        capaci = s.length;
        lletres = new char[capaci];
        llargaria = 0;
        for (int i = 0; i < s.length; i++) {
            lletres[llargaria++] = s[i];
        }
    }

    public void add(char c) {
        if (llargaria == capaci) {
            char aux[] = new char[capaci + TRAM];
            for (int i = 0; i < capaci; i++) {
                aux[i] = lletres[i];
            }
            capaci = capaci + TRAM;
            lletres = aux;
        }
        lletres[llargaria++] = c;
    }

// Convertir un objecte Paraula en un String
    @Override
    public String toString() {
        String msg = "";
        for (int idx = 0; idx < llargaria; idx++) {
            msg += lletres[idx];
        }
        return msg;
    }

    public boolean buida() {
        return llargaria == 0;
    }

// Per obtenir la llargària
    public int getLlarg() {
        return llargaria;
    }
    
    public int toInt() {    // sols és vàlid si les paraules són de longitut 1 i són dígits
        return lletres[0] - '0';
    }
}
