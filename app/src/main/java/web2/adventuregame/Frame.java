package web2.adventuregame;

/**
 * Created by paul.rodrigues on 24/02/16.
 */
public class Frame {

    int id;
    String text;
    int[] choix;

    public Frame() {
        choix= new int[2];
        choix[0] = -1;
        choix[1] = -1;

    }
}
