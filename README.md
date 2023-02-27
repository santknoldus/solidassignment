# SOLID Principle Assignment

**Problem :**

```
class Rectangle {
    protected int m_width;
    protected int m_height;

    public void setWidth(int width) {
        m_width = width;
    }

    public void setHeight(int height) {
        m_height = height;
    }

    public int getWidth() {
        return m_width;
    }

    public int getHeight() {
        return m_height;
    }

    public int getArea() {
        return m_width * m_height;
    }
}

class Square extends Rectangle {
    public void setWidth(int width) {
        m_width = width;
        m_height = width;
    }

    public void setHeight(int height) {
        m_width = height;
        m_height = height;
    }

}
```


SetWidth and SetHeight doesn't make sense because setting one would change the other to match it. In this case Square fails the Liskov Substitution Test with Rectangle and the abstraction of having Square inherit from Rectangle is a bad one.

**Solution :**
```
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
```

**Output : **
![Screenshot from 2023-02-27 21-01-42](https://user-images.githubusercontent.com/125345690/221607292-fed6c617-df48-4723-80a0-6520b2e66589.png)
