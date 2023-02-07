package ceasars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {
    private CaesarsCipher caesarsCipher = new CaesarsCipher();//first create an instance like so to call into your class object logic

    @Test
    void shouldTestForCipherMessaegOffsetOf12() {
        assertEquals("tai mdq kag pauzs fapmk",
                caesarsCipher.cipher("how are you doing today",12));
    }
    @Test
    void ShouldTestEmptyString(){
        assertEquals("",caesarsCipher.cipher("",12));
    }
}