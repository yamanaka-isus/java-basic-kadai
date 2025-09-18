package kadai_015;

public class Car_Chapter15 {
	
	// フィールド(内部データ)
	private int  gear;
	private int speed;
	
	// コンストラクタ（初期化処理）
	public Car_Chapter15 () {
		gear  =  1;
		speed = 10;
	}
	
	// 【メソッド】ギアの値により速度を変える
	public void changeGear(int afterGear) {
		System.out.println("ギア" + gear + "から" + afterGear + "に切り変えました");
	    gear = afterGear;
		speed = gear * 10;

	
	}
	
	public void run() {
		if( gear > 0 && gear <= 5 ) {
		System.out.println("速度は時速" + speed + "kmです");
	}else {
		System.out.println("速度は時速" + "10kmです");
	}


	}
}
