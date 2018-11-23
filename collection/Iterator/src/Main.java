import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<Integer> art = new ArrayList();
        for (int i =1; i<=10; i++)
        {
            art.add(i);
        }

        System.out.println(art);

        Iterator itr = art.iterator();
        while (itr.hasNext())
        {
            int i = (Integer) itr.next();
            if(i%2 != 0)
            {
                itr.remove();
            }

        }
        System.out.println(art);

    }
}
