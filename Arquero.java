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
	private static Integer hp=5;
	private static final Integer p_atk=5;
	private static final Integer DMIN=2;
	private static final Integer DMAX=5;
	
	
	public Arquero(Integer x, Integer y) {
		super(x,y,hp,p_atk,DMAX,DMIN);	
		this.setArrows(20);
	}

	public void atack(Unidad b) {
		if(this.equals(b)) return;
		if(this.dead()||b.dead())	return;	
		if (this.calcuDistance(b)) {
			if(this.getArrows()!=0) {
				b.quitarHp(this.getP_atk());
				this.setArrows(this.getArrows()-1);
			}	
			else System.out.println("I need more arrows");
		}
	}
	
	public void paquete() {
		if(this.getArrows()<=14) {
			this.setArrows(getArrows()+6);
		}
		else this.setArrows(20);
	}
	
	public void pocionA(){
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
