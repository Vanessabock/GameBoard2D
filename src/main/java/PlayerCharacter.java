public class PlayerCharacter {
    static int x = 0;
    static int y = 0;
    public static int getX(){

        return x;
    }

    public static int getY() {

        return y;
    }

    public static void move(String s){
        if (s.equals("W")){
            y++;
        }
    }
}
