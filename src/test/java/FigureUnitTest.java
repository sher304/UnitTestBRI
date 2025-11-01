import org.example.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FigureUnitTest {

    IShape sphere = new Sphere(5);
    IShape cylinder = new Cylinder(3, 7);
    IShape rectangle = new Rectangle(4, 8);
    IShape cube = new Cube(4);
    @Test
    public void TestSphereCalculateArea() {
        assertEquals(314.159, sphere.CalculateArea(), 0.001, "Sphere Area is 314.159");
    }

    @Test
    public void TestSphereCalculateVolume() {
        assertEquals(523.598, sphere.CalculateVolume(), 0.001, "Sphere Volume is 523.598");
    }

    @Test
    public void TestCylinderArea() {
        assertEquals(188.49555921538757, cylinder.CalculateArea(), 0.001, "Cylinder Area is 188.49555921538757");
    }

    @Test
    public void TestCylinderVolume(){
        assertEquals(197.92033717615698, cylinder.CalculateVolume(), 0.001, "Cylinder Volume is 197.92033717615698");
    }

    @Test
    public void TestRectangleArea(){
        assertEquals(32.0, rectangle.CalculateArea(), 0.001, "Rectangle Area is 32.0");
    }

    @Test
    public void TestCubeArea(){
        assertEquals(96.0, cube.CalculateArea(), 0.001, "Cube Area is 96");
    }

    @Test
    public void TestCubeVolume(){
        assertEquals(64, cube.CalculateVolume(), 0.001, "Cube volume is 64");
    }
}
