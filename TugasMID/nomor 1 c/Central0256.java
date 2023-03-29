interface A {
    public void aaa();
}

interface B extends A { }

class Central0256 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0256 obj = new Central0256 ();
        System.out.println("main");
        obj.aaa(); 
	}
}