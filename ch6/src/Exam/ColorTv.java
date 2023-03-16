package Exam;

public class ColorTv extends Tv {

	private int color;
	public ColorTv(int size, int color) {
		super(size);
		this.color = color;
	}


	public void printProperty(){
		System.out.println(super.getSize()+"인치, "+color+"컬러");
	}

}
