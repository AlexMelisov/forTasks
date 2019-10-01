public class PointLine {
    public static void main(String[] args)
    {
        Line[] one  = new Line[10];
        int from = 0, to = 10; //range for random

        for(int i  = 0; i < 10; i++)
        {
            one[i] = new Line(new Point(from + (int)(Math.random() * to), from + (int)(Math.random() * to))
                              ,new Point(from + (int)(Math.random() * to),from + (int)(Math.random() * to)));
        }
        for(Line item: one)
        {
            System.out.println(item.get_length());
        }
    }
}
