package at.elina.units;

public class CeasarMain    {
    public static void main(String[] args) {
        String text = "az";

        String encrypted = Caersar_Verschluesselung.doEncrypt(text);
        System.out.println(encrypted);
    }
}
