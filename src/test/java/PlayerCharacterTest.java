import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {
    @Test
    public void getXTEst_whenCreated_then0(){
        // GIVEN
        int positionX = 0;
        //WHEN
        int actual = PlayerCharacter.getX();
        //THEN
        assertEquals(positionX, actual);
    }
}
