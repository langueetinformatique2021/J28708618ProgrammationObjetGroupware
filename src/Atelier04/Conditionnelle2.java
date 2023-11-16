package Atelier04;

public class Conditionnelle2 {
	public static void main(String[] args) {
		int p1=11, p2=12, p3=10, p4=4, p5=8;
		
		if (p1<p2) {
			if (p1<p3) 
				p4=p1;
			else
				p4=p3;
		} else {
			if (p2<p3)
				p4=p2;
			else 
				p4=p3;
		}
		System.out.println(p4);
	}
}