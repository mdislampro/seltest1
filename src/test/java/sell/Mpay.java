package sell;

public class Mpay {

	public static void main(String[] args) {
		
		Mpay mpay =new Mpay();
		
		double mp = mpay.cal(50000,5.5, 60, 1000);
		
		


		
	}
	
	public double cal(double v,double r, int t,double d) {
		
		r = r/100/12;
		v = v-d;
		
		double a = r*Math.pow(1+r, t);
		double b = Math.pow(1+r, t)-1;
		
		double mp= v*(a/b);
		
		double mpri = v/t;
		double mi = mp-mpri;
		
		
		System.out.println(mp);
		System.out.println(mpri);
		System.out.println(mi);
		
		
		
		return mp;
	}

}
