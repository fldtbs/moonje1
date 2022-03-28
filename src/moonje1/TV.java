package moonje1;

public class TV {
	
	private String brand;
	private int year;
	private int inch;
	
	public TV(String brand, int year, int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		System.out.print(this.brand + "에서 만든 ");
		System.out.print(this.year + "년형 ");
		System.out.println(this.inch + "인치 TV");
	}

}
