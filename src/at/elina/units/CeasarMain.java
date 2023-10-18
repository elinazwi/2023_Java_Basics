package at.elina.units;

public class CeasarMain    {
    public static void main(String[] args) {
        String text = "az";
        int shift = 4;
        System.out.println("Original:" + text);

        String encrypted = Caersar_Verschluesselung.doEncrypt(text,shift);
        String decrypted = Caersar_Verschluesselung.doDecrypt(encrypted,4);
        System.out.println("Encrypted with shift " + shift + " - " + encrypted);
        System.out.println(decrypted);
    }
}
