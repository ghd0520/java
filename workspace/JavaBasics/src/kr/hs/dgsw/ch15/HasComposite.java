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
	// TODO �ӽŰ��� �� ����
		System.out.println("DADADADA");
		bullet-=4;

	}

}

class Police{
	int handcuffs;
	Weapon weapons[] = new Weapon[2];

	public Police(int bcuff){
		this.handcuffs = bcuff;
		//�����ʱ�ȭ
		this.weapons[0] = new MachineGun(20);
		this.weapons[1] = new Gun(6);
	}

	public void shot(){
		//������ �� ����
		//������ �ִ� ������ �Ѿ��� �� ���� �� ������ ��!
		//�Ѿ��� ��� �����Ǹ� Game Over ���
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

		//�ùķ��̼� �ڵ� �ۼ�
		
		Police gunner = new Police(3);
		gunner.shot();
	}

}