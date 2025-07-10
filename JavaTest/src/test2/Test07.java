package test2;

/*
	날짜: 2025/07/10
	이름: 윤종인
	내용: 자바 최대공약수 메서드 연습문제
*/

public class Test07 {
	public static void main(String[] args) {
		System.out.println("1과 5의 최대공약수: " + gcd(1,5));
		System.out.println("3과 6의 최대공약수: " + gcd(3,6));
		System.out.println("12과 18의 최대공약수: " + gcd(12,18));
		System.out.println("60과 24의 최대공약수: " + gcd(60,24));
		System.out.println("192과 162의 최대공약수: " + gcd(192,162));
	}
	
	public static int gcd(int a,int b) {
		int temp = 0;
		
		if(a < b) { // 1<5, 3<6, 12<18
			temp = a;//temp=1, temp=3, temp=12
		} else {
			temp = b;
		}
		
		while(true) {
			if(a % temp == 0 && b % temp == 0) { //1%1==0,5%1==0 break 3%3==0,6%3==0 break 
				break;
			} //12%12==0 18%12!=0 -> 12%11!=0 18%11!=0 -> 12%10!=0 18%10!=0 -> 12%9!=0 18%9==0 -> 12%8!=0 18%8==0 -> 12%7!=0 18%7==0 -> 12%6==0 18%6==0 위의 조건문으로 이동
			temp--; //temp=11 temp=10 temp=9 temp=8 temp=7 temp=6
		}
		return temp;
	} 
}
