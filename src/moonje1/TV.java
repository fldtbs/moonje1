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
		System.out.print(this.brand + "���� ���� ");
		System.out.print(this.year + "���� ");
		System.out.println(this.inch + "��ġ TV");
	}

}
