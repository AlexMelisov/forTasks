public class Line {
    private Point x,y;
    public Line(Point x, Point y)
    {
        this.x = x;
        this.y = y;
    }
    //d = sqrt((x2-x1)^2+(y2-y1)^2)
    public double get_length()
    {
        return Math.sqrt(Math.pow(this.y.getX() - this.x.getX(),2)+ Math.pow(this.y.getY() - this.x.getX(),2));
    }

}
