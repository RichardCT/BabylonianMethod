
public class Numero {
	float num;
	
void setNumero(float value) {
	num = value;
}
void squareRoot(Numero n){ 
	//n is the approximation
	float a, b, div, prom;
	a = num;
	b = n.num;
	for (int x = 0; x < 3; x++) {
		div = a/b;
		prom = (b + div)/2;
		b = prom;
		
	}
	System.out.println("The square root is " + b);
}
}
