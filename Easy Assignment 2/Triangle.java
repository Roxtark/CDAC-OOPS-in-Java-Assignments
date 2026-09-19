//class Triangle {
//    int side1;
//    int side2;
//    int side3;
//
//    Triangle(int side1, int side2, int side3) {
//        this.side1 = side1;
//        this.side2 = side2;
//        this.side3 = side3;
//    }
//
//    void calculate() {
//        int perimeter = side1 + side2 + side3;
//        double area = (side1 * side2) / 2.0;
//
//        System.out.println("Area of Triangle: " + area);
//        System.out.println("Perimeter of Triangle: " + perimeter);
//    }
//
//    public static void main(String[] args) {
//        Triangle t = new Triangle(3, 4, 5);
//
//        t.calculate();
//    }
//}
//

class Triangle {
	
	double base;
	double height;
	double hypotenuse;
	
	Triangle(double base, double height, double hypotenuse){
		
		this.base = base;
		this.height = height;
		this.hypotenuse = hypotenuse;
		
	}
	
	double area(){
		
		return 0.5*base*height;
		
	}
	
	double perimeter() {
		
		return base + height + hypotenuse;
		
	}
	
	public static void main(String[] args) {
		
		Triangle t1 = new Triangle(3,4,5);
		
		System.out.println("The perimeter of Triangle is " + t1.perimeter());
		System.out.println("The Area of Triangle is " + t1.area());
		
	}
	
	
	
	
	
}




























