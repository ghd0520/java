package kr.hs.dgsw.ch15;

abstract class Weapon{
	int bullet;
	abstract void shot();
}

class Gun extends Weapon{

	public Gun(int bnum){ this.bullet = bnum; }
	public void shot(){
		System.out.println("BBANG");
		bullet--;
	}
}

class MachineGun extends Weapon{

	public MachineGun(int bnum){ this.bullet = bnum; }
	@Override
	void shot() {
	// TODO 머신건의 샷 구현
		System.out.println("DADADADA");
		bullet-=4;

	}

}

class Police{
	int handcuffs;
	Weapon weapons[] = new Weapon[2];

	public Police(int bcuff){
		this.handcuffs = bcuff;
		//무기초기화
		this.weapons[0] = new MachineGun(20);
		this.weapons[1] = new Gun(6);
	}

	public void shot(){
		//경찰의 샷 구현
		//가지고 있는 무기의 총알이 다 소진 될 깨까지 샷!
		//총알이 모두 소진되면 Game Over 출력
		for(Weapon i : weapons){
			while(i.bullet != 0){
				i.shot();
			}
		}
		System.out.println("Game Over");
		
		
	}
}

public class HasComposite {

	public static void main(String[] args) {

		//시뮬레이션 코드 작성
		
		Police gunner = new Police(3);
		gunner.shot();
	}

}