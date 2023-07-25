package dz;

public class CaesarCipher {

        public static String encrypt(String message, int shiftKey) {
        final String alpha = "abcdefghijklmnopqrstuvwxyz";

        message = message.toLowerCase();
        StringBuilder cipherText = new StringBuilder();
        for (int ii = 0; ii < message.length(); ii++) {
            int charPosition = alpha.indexOf(message.charAt(ii));
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = alpha.charAt(keyVal);
            cipherText.append(replaceVal);
        }
        return cipherText.toString();
    }
//    String decipher(String message, int offset) {
//        return encrypt(message, 26 - (offset % 26));
//    }
//
//    public static StringBuilder decoder(String message, StringBuilder chiper,  int shiftKe){
//        final String alpha = "abcdefghijklmnopqrstuvwxyz";
//
//        message = message.toLowerCase();
//
//        return null;
//    }

    static String decipher(String message, int offset) {
        return encrypt(message, 26 - (offset % 26));
    }

}
