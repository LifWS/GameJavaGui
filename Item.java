/*import java.util.Scanner;
import java.util.Random;

public class Item{
    private int upHP = 200;
    private int upSD = 80;

    public int upBlood(){
        return upHP;
    }
    public int upMana(){
        return upSD;
    }
}*/
public class Item {
    private static int upHP = 200;
    private int upSD = 80;
    private int upATK = 30;

    public int getUpHP() {
        return upHP;
    }
    public int getUpATK() {
        return upATK;
    }
    public void setUpATK(int upATK) {
        this.upATK = upATK;
    }
    public int getUpSD() {
        return upSD;
    }
    public void setUpSD(int upSD) {
        this.upSD = upSD;
    }
    public void setUpHP(int upHP) {
        this.upHP = upHP;
    }
    
    public static int upMana() {
        return 80;
    }
    public static int upBlood() {
        return 200;
    }
    
}