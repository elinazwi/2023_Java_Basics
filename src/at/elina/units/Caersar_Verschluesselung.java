package at.elina.units;

public class Caersar_Verschluesselung {
    public static String doEncrypt(String data){
        char[] chars = data.toCharArray();
        char[] result = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            char actualCharacter = chars[i];
            // zw 65 und 90
            // dann zu 65 dazu zählen
            actualCharacter += 1;
            if (actualCharacter==90){
                actualCharacter=65;
            }
            result[i]=actualCharacter;
        }

        String output = new String(result);
        System.out.println(output);
        return output;
    }
}
