package ceasars;

public class Main {
    public static void main(String[] args) {
        CaesarsCipher caesarsCipher = new CaesarsCipher();

        String message = "how are you doing today";
        int offset = 12;//numbers from whatever letter goes through the loop

       String cipheredMessage = caesarsCipher.cipher(message, offset);
        //caesarsCipher.cipher("Hello",5);

        System.out.println("message: " + message);
        System.out.println("offset: " + offset);
        System.out.println("Cipher message: " + cipheredMessage);
    }
}
