package kodilla.spring.intro.shape;


public class Drawer {

    final Shape shape;    //czy rzeczywiście bez private?

    public Drawer(Shape shape) {
        this.shape = shape;
    }

    public String doDrawing() {
        return shape.draw();
    }
}