import java.awt.*;

public class BigRectangleFilter implements Filter {

    @Override
    public boolean accept(Object x) {
        if (x instanceof Rectangle){
           Rectangle rectangle = (Rectangle) x;
           if ((rectangle.width + rectangle.height)* 2 > 10){
               return true;
           }
        }
        return false;
    }
}

