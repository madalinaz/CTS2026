import cts.s12.g1093.flyweight.implementare.Canvas;
import cts.s12.g1093.flyweight.implementare.FlyweightFactory;

public void main() {
    FlyweightFactory flyweightFactory=new FlyweightFactory();
    Canvas canvas=new Canvas(200, 200);

    flyweightFactory.getPersonaj().pozitionare(10, 100, canvas);
    flyweightFactory.getPersonaj().pozitionare(10, 100, canvas);
    flyweightFactory.getPersonaj().pozitionare(20, 100, canvas);

}