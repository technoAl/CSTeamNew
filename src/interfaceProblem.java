public class interfaceProblem {
}
interface A {
	int gimmeSomeInt ();
}

interface B extends A {
	C nextC (String yoSup);
}

interface C extends A {
	B b ();
}
abstract class D {
	public abstract void notMuch ();
	public abstract D yetAgain ();
}

class F implements C, B{
	public B b (){
		return this;
	}

	public C nextC (String yoSup){
		return this;
	}

	public int gimmeSomeInt (){
		return 0;
	}
}

class E extends D implements B {
	public void notMuch(){

	}

	public D yetAgain(){
		return this;
	}

	public C nextC(String yoSup){
		return new F();
	}

	public int gimmeSomeInt (){
		return -1;
	}

}
