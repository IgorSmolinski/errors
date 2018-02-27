package kodilla.spring.intro.shape;

import org.junit.Assert;
import org.junit.Test;

public class DrawerTestSuite {


    @Test
    public void testDoDrawningwithCircle() {
        //Given
        Circle circle = new Circle();

        //When
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();

        //Then
        Assert.assertEquals("This is Circle which implement Shape.", result);
    }

    @Test
    public void testDoDrawningwithTriangle() {
        //Given
        Triangle triangle = new Triangle();

        //When
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();

        //Then
        Assert.assertEquals("This is Triangle which implement Shape.", result);
    }
}
