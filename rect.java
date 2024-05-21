class Area {
    double length;
    double breadth;
    // Method to set dimensions of the rectangle
    void setDim(double l, double b) {
    length = l;
    breadth = b;
    }
    // Method to calculate and return the area of the rectangle
    double getArea() {
    return length * breadth;
    }
    }
    public class Main {
    public static void main(String[] args) {
    Area rectangle = new Area();
    rectangle.setDim(5.0, 3.0); // Setting dimensions
    System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
    }