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
		
		System.out.println("********��ӭ�����Զ��⳵ϵͳ**********");
		Scanner input = new Scanner(System.in);
		System.out.println("�������⳵������");
		int day = input.nextInt();
		do {
			System.out.println("��ѡ����Ҫ��ĳ������ͣ�1��car or 2��bus");
			int sel = input.nextInt();
			if (sel == 1) {
				Moto moto = new Car();
				System.out.println("��ѡ��γ����ͣ� 1��bmw 2��audi 3��benc�����������֣�");
				sel = input.nextInt();
				String[] carType = { "����", "����", "�µ�" };
				((Car) moto).setType(carType[sel - 1]);
				String[] motoNo = { "³ B888880", "³ B888881", "³ B888882",
						"³ B888883", "³ B888884", "³ B888885" };
				System.out.println("�������⳵��������");
				int num = input.nextInt();
				for (i = 0; i < num; i++) {
					countCar++;
					//���ƺ���
					moto.setMotoNo(motoNo[i]);
					// ����һ���������
					double totalFee = moto.rentFee(day);
					
					carRent[i] = "Car:" + ((Car) moto).getType() + "\t"
							+ moto.getMotoNo() + "\t" + day + "\t" + totalFee;
					//����γ��������
					carFee = carFee + totalFee;
				}

			} else {
				Moto moto = new Bus();
				System.out.println("ѡ����Ҫ��Ŀͳ������λ���� 1�� < 16 2�� > 16�����������֣�");
				sel = input.nextInt();
				int[] busType = { 10, 32 };
				((Bus) moto).setSeatCount(busType[sel - 1]);
				String[] motoNo = { "³ B88880", "³ B88881", "³ B88882",
				"³ B88883" };
				System.out.println("�������⳵��������");
				int num = input.nextInt();
				for (i = 0; i < num; i++) {
					countBus++;
					//���ƺ���
					moto.setMotoNo(motoNo[i]);
					//����һ�����������
					double totalFee = moto.rentFee(day);
					busRent[i] = "Bus:" + ((Bus) moto).getSeatCount() + "\t"
							+ moto.getMotoNo() + "\t\t" + day + "\t" + totalFee;
					//��������bus�������
					busFee = busFee + totalFee;
				}

			}
			System.out.println("�Ƿ������y/n");
			yn = input.next();

		} while (yn.equalsIgnoreCase("y"));
		System.out.println("����ĳ�Ϊ��\t ���ƺ���Ϊ��\t\t �⳵����Ϊ:\t �⳵����Ϊ��");
		for (int k = 0; k < countCar; k++) {
			System.out.println(carRent[k]);
		}
		for (int k = 0; k < countBus; k++) {
			System.out.println(busRent[k]);
		}
		//����ȫ�����������
		fee = carFee + busFee;
		System.out.println("���⳵���ܷ���Ϊ��" + fee);

	}

	public static void main(String[] args) {
		new Sys().rentMoto();
	}
}
