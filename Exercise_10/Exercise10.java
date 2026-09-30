class Floor{
    private double length;
    private double width;
    public Floor(double length,double width){
        if(length>=0){
            this.length = length;
        }
        else{
            this.length=0;
        }
        if(width>=0){
            this.width = width;
        }
        else{
            this.width=0;
        }
    }
    public double getArea(){
            return this.length*this.width;
        }

}
class Carpet{
    private double cost;
    public Carpet(double cost){
        if(cost>=0){
            this.cost=cost;
        }
        else{
            this.cost=0;
        }
    }
    public double getCost(){
        return this.cost;
    }
}
class Calculator{
    Floor f;
    Carpet c;
    public Calculator(Floor f,Carpet c){
        this.f = f;
        this.c = c;
    }
    public double getTotalCost(){
        double s=getArea();
        double price=getCost();
        return s*price; 
    }

}