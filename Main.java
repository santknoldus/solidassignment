class Rectangle{
    int width;
    int height;
   
    public void setWidth(int width){
      this.width = width;
    }
   
    public void setHeight(int height) {
      this.height = height;
    }
   
    public int getWidth() {
      return width;
    }
   
    public int getHeight() {
      return height;
    }
   
    public int getArea() {
      return width * height;
    }
   
}
  
class Square {
    int side;

    public void setSide (int side) {
        this.side=side;
    }

    public int getSide(){
        return this.side;
    }

    public int getArea(){
        return side*side;
    }
        
}

public class Main{
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(4);
        System.out.println(rectangle.getArea()); 

        Square square = new Square();
        square.setSide(5);
        System.out.println(square.getArea());
    }
}