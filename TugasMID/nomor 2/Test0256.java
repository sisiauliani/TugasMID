//Sisi Auliani 13020210256

public class Test0256 {
	public static void main(String[] args) {
	//	(a)buat instansi objek balok1 dari Balok()
		Balok balok1 = new Balok();
	//	(b)buat instansi objek balok2 dari Balok(20,35, 15)
		Balok balok2 = new Balok();
		balok2.Balok(20, 35, 15);
	//	(c)setter  set nilai l = 5 dari konstruktor Balok()
		int l = 5;
	//	(d)setter  set nilai p = 25 dari konstruktor Balok()
		int p = 25;
	//	(e)setter  set nilai t = 10 dari konstruktor Balok(20,35, 15)
		int t = 10;
	//	(f)tampilkan panjang, lebar, Luas, dan keliling balok dari konstruktor Balok()
		System.out.println("Panjang = " + p + " Lebar = " + l + " Luas = " + " Luas = " + balok1.luas() + " Keliling = " + balok1.keliling());
	//	(g)panggil method info dari konstruktor Balok(20,35, 15)
		balok2.info();
	}
}
//class Balok
class Balok extends PersegiPanjang{
	int t;
	public Balok() {
	//(h) berisi nilai panjang & lebar yang diperoleh dari konstruktor superclass persegi panjang serta tinggi=15
		int l;
		int p;
		int t;
		
	}
	public void Balok(int p, int l, int t) {
	//(i) berisi nilai pada saat runtime p p, l=l dari konstruktor superclass persegi panjang t t;
		this.l = l;
		this.p = p;
		this.t = t;
	}
	//(j) buat getter setter class balok
	public int volume(){
	//(k) untuk menghitung volume balok : p x l x t
		return p * l * t;
	}
	public int luas() {
		return (2 *((p*l) + (p*t) + (t*l)));
	}
	public void info(){
	//(l)tampilkan panjang, lebar, tinggi,Luas, dan volume balok
		System.out.println("Panjang = " + p + " Lebar = " + l + " Tinggi = " + t + " Luas = " + luas() + " Volume = " + volume());
	}
}
// class Persegi Panjang
class PersegiPanjang{
	int p, l;
	public PersegiPanjang() {
	//(m) berisi nilai panjang=30 & lebar=20
		p = 30;
		l = 20;
	}
	public PersegiPanjang(int p, int l) {
	//(n) berisi nilai pada saat runtime p p, l=l
		this.p = p;
		this.l = l;
	}
	//(o) buat getter setter class Persegi Panjang
	public int luas(){
	//(q) untuk menghitung luas persegi panjang : p x l
		return p * l;
	}
	public int keliling(){
	//(r) untuk menghitung keliling persegi panjang : 2x (p+l)
		return (2 *(p + 1));
	}
}