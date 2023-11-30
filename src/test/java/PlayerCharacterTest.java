import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {
    @Test
    public void getXTEst_whenCreated_then0(){
        // GIVEN
        int expectedY = 0;
        //WHEN
        int actual = PlayerCharacter.getX();
        //THEN
        assertEquals(expectedY, actual);
    }

    @Test
    public void getYTest_whenCreated_then0(){

        //GIVEN
        int expectedY = 0;

        //WHEN
        int actual = PlayerCharacter.getY();

        //THEN
        assertEquals(expectedY, actual);

    }

    @Test
    public void moveTest_whenW_thenGetYIs1(){
        //GIVEN
        int expectedY = 1;
        String move = "W";

        //WHEN
        PlayerCharacter.move(move);
        int actual = PlayerCharacter.getY();

        //THEN
        assertEquals(expectedY, actual);
    }
    @Test
    public void moveTest_whenS_thenGetYIs0(){
        //GIVEN
        int expectedY = 0;
        String move = "S";

        //WHEN
        PlayerCharacter.move(move);
        int actual = PlayerCharacter.getY();

        //THEN
        assertEquals(expectedY, actual);
    }

    @Test
    public void moveTest_whenD_thenGetXIs1(){
        //GIVEN
        int expectedX = 1;
        String move = "D";

        //WHEN
        PlayerCharacter.move(move);
        int actual = PlayerCharacter.getX();

        //THEN
        assertEquals(expectedX, actual);
    }

    @Test
    public void moveTest_whenA_thenGetXIs0(){
        //GIVEN
        int expectedX = 0;
        String move = "A";

        //WHEN
        PlayerCharacter.move(move);
        int actual = PlayerCharacter.getX();

        //THEN
        assertEquals(expectedX, actual);
    }


}
