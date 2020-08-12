package leetcode.Java_String;

import edu.princeton.cs.algs4.*;

/**
 * @description: Point的练习
 * @author: liuzhi
 * @Date: 2020-08-05 20:27
 **/
public class Point {
    public static void main(String[] args) {
        double xlo = Double.parseDouble("0.2");
        double xhi = Double.parseDouble("0.5");
        double ylo = Double.parseDouble("0.5");
        double yhi = Double.parseDouble("0.6");

        int T = Integer.parseInt("10000");

        Interval1D xinterval = new Interval1D(xlo,xhi);
        Interval1D yinterval = new Interval1D(ylo,yhi);
        Interval2D box = new Interval2D(xinterval,yinterval);

        box.draw();

        Counter c= new Counter("hits");
        for (int i=0;i<T;++i)
        {
            double x = Math.random();
            double y = Math.random();

            Point2D p = new Point2D(x,y);
            if (box.contains(p)) {
                c.increment();

            }else {
                p.draw();
            }
            StdOut.println(c);
            StdOut.println(box.area());
        }
    }
}
