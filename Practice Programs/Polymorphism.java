package packageinheritance;
class One{
	int x=10;
	float calc_si(float p,int t,float roi) {
		float si=(p*t*roi)/100;
		return si;
	}
		

}
class Two extends One{
	@Override
	float calc_si(float p, int t,float roi) {
		float si=(p*t*roi/10);
		return si;
		
	}
	
		
	void access () {
		float result =calc_si(1000,3,3.45f);
		System.out.println("SI value is:" + result);
	}
}

class Three extends One{
	@Override
	float calc_si(float p,int t,float roi) {
		float si=(p*t*roi)/1000;
		return si;
	}
	void access () {
		float result =calc_si(1000,3,3.45f);
		System.out.println("SI value is:" + result);
	}
}
	

 class Multiple{
	public static void main(String[] args) {
		Three three=new Three();
		three.access();
		
	}
}

