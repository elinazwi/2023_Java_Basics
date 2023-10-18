package at.elina.units;

public class Caersar_Verschluesselung {
    public static String doEncrypt(String data, int shift){
        char[] chars = data.toCharArray();
        char[] result = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            char actualCharacter = chars[i];
            // zw 65 und 90
            // dann zu 65 dazu zählen
            actualCharacter += shift;

            if (actualCharacter>122){
                actualCharacter =  (char)(97 + shift);

            }else if(actualCharacter>90){
                actualCharacter = (char)(65 + shift);
            }

            result[i]=actualCharacter;
        }

        String output = new String(result);
        System.out.println(output);
        return output;
    }

    public static String doDecrypt(String data,int shift){
        char[] chars = data.toCharArray();
        char[] result = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            char encryptedCharacter = chars[i];
            // zw 65 und 90
            // dann zu 65 dazu zählen
            encryptedCharacter -= shift;


            result[i]=encryptedCharacter;
        }

        String output = new String(result);
        System.out.println(output);
        return output;
    }
}
