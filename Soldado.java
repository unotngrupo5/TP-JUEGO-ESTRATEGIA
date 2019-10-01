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
		System.out.println("a:"+a);
		a.move("cnnnnof");
		System.out.println("a:"+a);
		a.atack(b);
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	
	private Integer ep;
	
	public Soldado() {
		super();
		this.setEp(0);
	}
	
	public Soldado(Integer x,Integer y) {
		this.setHp(200);
		this.setP_atk(10);
		this.setEp(20);
		this.setX(x);
		this.setY(y);
		
	}
	
	public void atack(Unidad b) {
		if (this.distance(b)==1) {
			if(this.getEp()!=0) {
				b.setHp(b.getHp()-this.getP_atk());
				this.setEp(this.getEp()-10);
			}	
			else System.out.println("I need more energy");
		}
		else System.out.println("It out of Range");
	}
	
	public Integer distance(Unidad b){
		int x = (int) Math.sqrt(Math.pow((this.getX()-b.getX()),2)+Math.pow((this.getY()-b.getY()),2));
		return x;
	}

	public Integer getEp() {
		return ep;
	}

	public void setEp(Integer ep) {
		this.ep = ep;
	}

	@Override
	public String toString() {
		return super.toString()+"Soldado [ep=" + ep + "]";
	}
	
	
}
