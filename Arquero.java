package ar.edu.uno.trabajo.practico;

public class Arquero extends Unidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arquero a = new Arquero(5,2);
		Unidad b = new Arquero(1,2);
		System.out.println("b:"+b);
		System.out.println("a:"+a);
		a.atack(b);
		System.out.println("b:"+b);
		System.out.println("a:"+a);
		a.paquete();
		System.out.println("a:"+a);
		a.paquete();
		a.paquete();
		System.out.println("a:"+a);
		
		
	}

	private Integer arrows;
	
	public Arquero() {
		super();
		this.setArrows(0);
	}
	
	public Arquero(Integer x, Integer y) {
		this.setHp(50);
		this.setP_atk(5);
		this.setArrows(14);
		this.setX(x);
		this.setY(y);
	}

	public void atack(Unidad b) {
		if (this.distance(b)<=5 && this.distance(b)>=2) {
			if(this.getArrows()!=0) {
				b.setHp(b.getHp()-this.getP_atk());
				this.setArrows(this.getArrows()-1);
			}	
			else System.out.println("I need more arrows");
		}
		else System.out.println("It out of Range");
	}
	
	public Integer distance(Unidad b){
		int x = (int) Math.sqrt(Math.pow((this.getX()-b.getX()),2)+Math.pow((this.getY()-b.getY()),2));
		return x;
	}
	
	public void paquete() {
		if(this.getArrows()<=14) {
			this.setArrows(getArrows()+6);
		}
		else this.setArrows(20);
	}
	
	public Integer getArrows() {
		return arrows;
	}

	public void setArrows(Integer arrows) {
		this.arrows = arrows;
	}

	@Override
	public String toString() {
		return super.toString()+"Arquero [arrows=" + arrows + "]";
	}
		
}

