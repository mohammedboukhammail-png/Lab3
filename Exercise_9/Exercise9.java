package Exercise_9;

public class Point{
    private int x;
    private int y;
    public Point(){

    }
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double distance(){
        int x = getX();
        int y = getY();
        int d = Math.pow(x,2) + Math.pow(y,2);
        return Math.pow(d,0.5);
    }
    public double distance(Point a){
        int x2 = getX();
        int y2 = getY();
        int x1 = a.x;
        int y1 = a.y;
        int d = Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
        return Math.pow(d,0.5);
    }
    public double distance(int x1,int y1){
        int x2 = getX();
        int y2 = getY();
        int d = Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
        return Math.pow(d,0.5);
    }

}