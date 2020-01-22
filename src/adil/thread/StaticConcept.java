package adil.thread;

public class StaticConcept {
	static int t;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t=5;
		StaticConcept sc=new StaticConcept();
		sc.t=10;
		StaticConcept sc1=new StaticConcept();
		sc1.t=15;
		System.out.println(sc.t+" "+StaticConcept.t+" "+sc1.t);
	}
	
}
