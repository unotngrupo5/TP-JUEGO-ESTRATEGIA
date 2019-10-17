package ar.edu.uno.trabajo.practico;

public class Soldado extends Unidad{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unidad a = new Soldado(1,2);
		Unidad b = new Soldado(1,3);
		System.out.println("b:"+b);
		System.out.println("a:"+a);
		a.atack(b);
		System.out.println("b:"+b);
		a.atack(b);
		//a.atack(b);
		//a.atack(b);
		System.out.println("b:"+b);
		b.atack(a);	
		a.atack(b);
		a.atack(b);
		System.out.println("a:"+a);
		a.move("cnnnnof");
		System.out.println("a:"+a);		
		b.atack(a);
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		a.pocionA();
		System.out.println("a:"+a);
		a.atack(a);
	}

	private static Integer ep=30;
	private static Integer hp=200;
	private static final Integer p_atk=10;
	private static final Integer DMIN=1;
	private static final Integer DMAX=1;

	public Soldado(Integer x,Integer y) {
		super(x,y,hp,p_atk,DMAX,DMIN);		
	}

	public void atack(Unidad b) {
		if(this.equals(b)) return;
		if(this.dead()||b.dead())	return;
		if (this.calcuDistance(b)) {
			if(this.tengoEp()) {
				b.setHp(b.getHp()-this.getP_atk());
				ep=this.getEp()-10;
			}	 
		}
	}	

	public void pocionA(){
		ep=this.getEp()+10;
	}

	public boolean tengoEp() {
		if(this.getEp()==0) {
			System.out.println("I need more energy");
			return false;
		}
		return true;
	}

	public void paquete() {
	}

	public Integer getEp() {
		return ep;
	}

	@Override
	public String toString() {
		return super.toString()+"Soldado [ep=" + ep + "]";
	}	
}
