package ar.edu.uno.trabajo.practico;

public abstract class Unidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private Integer hp;
	private Integer p_atk;
	private Integer x;
	private Integer y;

	public Unidad() {
		this.setHp(0);
		this.setP_atk(0);
		this.setX(0);
		this.setY(0);
	}

	public Unidad(Integer x,Integer y) {
		this.setX(x);
		this.setY(y);
		this.setHp(0);
		this.setP_atk(0);
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



}
