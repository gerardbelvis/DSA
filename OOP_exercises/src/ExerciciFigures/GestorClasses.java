package ExerciciFigures;

import ExerciciFigures.Figures.Cercle;
import ExerciciFigures.Figures.Figura;
import ExerciciFigures.Figures.Quadrat;
import ExerciciFigures.Figures.Rectangle;
import java.util.Arrays;

public class GestorClasses
{
    public static void sort (Figura[] v)
    {
        Arrays.sort(v, (o1, o2) -> (int)(o1.area() - o2.area()));
    }

    public static double suma (Figura[] v)
    {
        double ret = 0;
        for (Figura f: v)
        {
            ret += f.area();
        }
        return ret;
    }

    public static void main(String[] args)
    {
        Figura[] v = new Figura[4];
        v[0] = new Cercle(6);
        v[1] = new Quadrat(2);
        v[2] = new Rectangle(5,3);
        v[3] = new Rectangle(2,8);


        double r = GestorClasses.suma(v);

        System.out.println("Àrea total després d'haver fet la suma: " + r);

        System.out.println("Figures sense ordenar: " + Arrays.asList(v));
        GestorClasses.sort(v);
        System.out.println("Figures ordenades per àrea: " + Arrays.asList(v));
    }
}
