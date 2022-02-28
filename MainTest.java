import junit.framework.Assert;
import org.junit.Test;
import uv.interfacebasics.circle;
import uv.interfacebasics.rectangle;
public class MainTest {
    
    @Test
    public void SortTest(){
        circle circle1 = new circle(7.2);
        circle circle2 = new circle (5.3);
        
        rectangle rec1 = new rectangle(12.3,15);
        rectangle rec2 = new rectangle (4.5,17);
        
        boolean resultCircles = circle1.compareTo(circle2);
        boolean resultRecs = rec1.compareTo(rec2);
        
        Assert.assertEquals(false, resultCircles);
        Assert.assertEquals(false, resultRecs);
        
    }
}
