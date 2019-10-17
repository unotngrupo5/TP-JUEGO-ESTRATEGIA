package ar.edu.uno.trabajo.practico;

public abstract class Unidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private Integer hp;
	private Integer p_atk;
	private Integer x;
	private Integer y;
	private Integer dmax;
	private Integer dmin;



	public Unidad(Integer x,Integer y, Integer hp, Integer p_atk, Integer dmax, Integer dmin) {
		this.setX(x);
		this.setY(y);
		this.setHp(hp);
		this.setP_atk(p_atk);
		this.setDmax(dmax);
		this.setDmin(dmin);
	}

	public abstract void atack(Unidad b);

	public void norte() {
		this.setY(getY()+1);
	}

	public void sur() {
		this.setY(getY()-1);
	}

	public void este() {
		this.setX(getX()+1);
	}

	public void oeste() {
		this.setX(getX()-1);
	}

	public void move(String msg) {
		if(this.dead()) return;
		if(msg.matches("^[cC][SsEeNnOo]*[fF]$")){
			for (int i=1;i<msg.length();i++) {
				if (msg.charAt(i)=='n'||msg.charAt(i)=='N'){
					this.norte();
				}
				else if (msg.charAt(i)=='s'||msg.charAt(i)=='S'){
					this.sur();
				}
				else if (msg.charAt(i)=='e'||msg.charAt(i)=='E'){
					this.este();
				}
				else if (msg.charAt(i)=='o'||msg.charAt(i)=='O'){
					this.oeste();
				}
			}
		}
	}

	public Integer distance(Unidad b){
		int x = (int) Math.sqrt(Math.pow((this.getX()-b.getX()),2)+Math.pow((this.getY()-b.getY()),2));
		return x;
	}

	public boolean calcuDistance(Unidad b) {
		if(this.distance(b)>=this.getDmin() && this.distance(b)<=this.getDmax()) return true;
		System.out.println("It out of Range");
		return false;
	}

	protected boolean dead() {
		if (this.getHp()<=0) {
			System.out.println("The Unit is dead!");
			return true;
		}
		return false;
	}
	
	public void quitarHp(Integer a) {
		if (a<=this.getHp()) this.setHp(getHp()-a);
		this.setHp(0);
	}

	public abstract void pocionA();

	public abstract void paquete();

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			System.out.println("I will not hit me");
			return true;
		}
		return false;
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public Integer getP_atk() {
		return p_atk;
	}

	public void setP_atk(Integer p_atk) {
		this.p_atk = p_atk;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}


	public Integer getDmax() {
		return dmax;
	}

	public void setDmax(Integer dmax) {
		this.dmax = dmax;
	}

	public Integer getDmin() {
		return dmin;
	}

	public void setDmin(Integer dmin) {
		this.dmin = dmin;
	}

	@Override
	public String toString() {
		return "Unidad [hp=" + hp + ", p_atk=" + p_atk + ", x=" + x + ", y=" + y + "]";
	}

}
