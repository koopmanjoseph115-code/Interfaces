import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BigRectLister {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(1,1);
        Rectangle r2 = new Rectangle(2,2);
        Rectangle r3 = new Rectangle(3,3);
        Rectangle r4 = new Rectangle(4,4);
        Rectangle r5 = new Rectangle(5,5);
        Rectangle r6 = new Rectangle(3,1);
        Rectangle r7 = new Rectangle(2,1);
        Rectangle r8 = new Rectangle(4,1);
        Rectangle r9 = new Rectangle(1,5);
        Rectangle r10 = new Rectangle(1,6);

        List < Rectangle > list = new ArrayList<Rectangle>();
        list.add(r1);
        list.add(r2);
        list.add(r3);
        list.add(r4);
        list.add(r5);
        list.add(r6);
        list.add(r7);
        list.add(r8);
        list.add(r9);
        list.add(r10);

        for (Rectangle rectangle : list){
            Filter filter = new BigRectangleFilter();
            if (filter.accept(rectangle)){
                System.out.println(rectangle.toString());
            }
        }

    }
}
