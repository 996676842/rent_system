package car;

import java.util.Scanner;

public class Sys {

	public void rentMoto() {
		double carFee = 0;
		double busFee = 0;
		double fee = 0;
		
		int i = 0;
		int countCar = 0;
		int countBus = 0;
		
		String yn = null;
		

		String[] carRent = new String[6];
		String[] busRent = new String[4];
		
		System.out.println("********欢迎来到自动租车系统**********");
		Scanner input = new Scanner(System.in);
		System.out.println("请输入租车天数：");
		int day = input.nextInt();
		do {
			System.out.println("请选择你要租的车的类型：1、car or 2、bus");
			int sel = input.nextInt();
			if (sel == 1) {
				Moto moto = new Car();
				System.out.println("请选择轿车类型： 1、bmw 2、audi 3、benc（请输入数字）");
				sel = input.nextInt();
				String[] carType = { "宝马", "奔驰", "奥迪" };
				((Car) moto).setType(carType[sel - 1]);
				String[] motoNo = { "鲁 B888880", "鲁 B888881", "鲁 B888882",
						"鲁 B888883", "鲁 B888884", "鲁 B888885" };
				System.out.println("请输入租车的数量：");
				int num = input.nextInt();
				for (i = 0; i < num; i++) {
					countCar++;
					//车牌号码
					moto.setMotoNo(motoNo[i]);
					// 计算一辆车的租金
					double totalFee = moto.rentFee(day);
					
					carRent[i] = "Car:" + ((Car) moto).getType() + "\t"
							+ moto.getMotoNo() + "\t" + day + "\t" + totalFee;
					//计算轿车的总租金
					carFee = carFee + totalFee;
				}

			} else {
				Moto moto = new Bus();
				System.out.println("选择您要租的客车大的座位数： 1、 < 16 2、 > 16（请输入数字）");
				sel = input.nextInt();
				int[] busType = { 10, 32 };
				((Bus) moto).setSeatCount(busType[sel - 1]);
				String[] motoNo = { "鲁 B88880", "鲁 B88881", "鲁 B88882",
				"鲁 B88883" };
				System.out.println("请输入租车的辆数：");
				int num = input.nextInt();
				for (i = 0; i < num; i++) {
					countBus++;
					//车牌号码
					moto.setMotoNo(motoNo[i]);
					//计算一辆车的总租金
					double totalFee = moto.rentFee(day);
					busRent[i] = "Bus:" + ((Bus) moto).getSeatCount() + "\t"
							+ moto.getMotoNo() + "\t\t" + day + "\t" + totalFee;
					//计算所有bus的总租金
					busFee = busFee + totalFee;
				}

			}
			System.out.println("是否继续？y/n");
			yn = input.next();

		} while (yn.equalsIgnoreCase("y"));
		System.out.println("您租的车为：\t 车牌号码为：\t\t 租车天数为:\t 租车费用为：");
		for (int k = 0; k < countCar; k++) {
			System.out.println(carRent[k]);
		}
		for (int k = 0; k < countBus; k++) {
			System.out.println(busRent[k]);
		}
		//计算全部车的总租金
		fee = carFee + busFee;
		System.out.println("您租车的总费用为：" + fee);

	}

	public static void main(String[] args) {
		new Sys().rentMoto();
	}
}
