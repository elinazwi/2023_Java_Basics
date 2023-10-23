package at.elina.units;

import java.util.Scanner;

public class CeasarMain    {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        int shift = 1;
        System.out.println("Original:" + text);


        String encrypted = Caersar_Verschluesselung.doEncrypt(text,shift);
        String decrypted = Caersar_Verschluesselung.doDecrypt(encrypted,shift);
        System.out.println("Encrypted with shift " + shift + " - " + encrypted);
        System.out.println("Decrxpted with shift " + shift + " - " + decrypted);
    }
}
