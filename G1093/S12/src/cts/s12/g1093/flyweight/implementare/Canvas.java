package cts.s12.g1093.flyweight.implementare;

import java.util.Map;

public class Canvas {
    private int xMax;
    private int yMax;
    private boolean matrice[][];

    public Canvas(int xMax, int yMax) {
        this.xMax = xMax;
        this.yMax = yMax;
        this.matrice=new boolean[xMax][yMax];
    }

    public boolean adauga(int x, int y){
        if(!matrice[x][y]){
            matrice[x][y]=true;
            return true;
        }
        else {
            return false;
        }
    }
}
