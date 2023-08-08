package Project;

import java.util.Arrays;
import java.util.Scanner;


public class Cart {

	public static void main(String[] args) {
		
//		ArrayList<Goods> cartList = new ArrayList<>();
		
		Goods[][] makeup = {
				// 베이스
				{ new Goods("에스쁘아 프로테일러 파운데이션 비벨벳", 34000),
						new Goods("파넬 시카마누 세럼쿠션 (2종 중 택1)", 29800),
						new Goods("클리오 킬커버 파운웨어 파운데이션",23800),
						new Goods("네이밍 레이어드 핏 쿠션 12g", 22400) },
				// 포인트
				{ new Goods("롬앤쥬시래스팅틴트",8400), new Goods("베네피트 프리사이슬리 마이브로우펜슬",34000),
						new Goods("힌스뉴뎁스아이섀도우",14400), new Goods("홀리카홀리카 젤리도우블러셔",6500) } };
		
		Goods[][] perfume = {

				{ new Goods("클린 웜코튼",58590), new Goods("포맨트 시그니처 퍼퓸",37000),
						new Goods("랑방에끌라드 아르페쥬", 44800), new Goods("안나수이 스카이", 46500) } };

		Goods[][] skincare = {
				// 선크림
				{ new Goods("AHC 마스터즈 에어리치 선스틱 22g",14060),
						new Goods("식물나라 산소수 워터프루프 선스프레이 SPF50+PA++++1+1 기획",13900),
						new Goods("닥터지 그린 마일드 업 선플러스 50ml 1+1 기획세트", 26100),
						new Goods("라운드랩 자작나무 무기자차 선크림 50ml 1+1 기획", 25000) },
				// 토너
				{ new Goods("아누아 어성초 77 수딩 토너 350ML 리필 기획세트", 31900),
						new Goods("토리든 다이브인 저분자 히알루론산 토너 500ml 기획",19800),
						new Goods("라운드랩 1025 독도 토너 500ml+200ml 기획",29800),
						new Goods("브링그린 티트리시카수딩토너 대용량증정기획", 20520) } };

		Goods[][] Items = {
				// 기타용품
				{ new Goods("닥터아토 손소독티슈 20매",1600), new Goods("필리밀리 듀얼 라운드 화장솜 60P",3300),
						new Goods("디어달리아 블루밍에디션 프로페탈 브러쉬", 19000),
						new Goods("메디힐 비타 에센셜 마스크 10매입", 10000) } };
		
		
		
		int menu;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("상품 주문하기");
		
		loop:while(true) {
			System.out.println("메뉴 : 1.상품조회 , 2.상품담기, 3.수량변경, 4.삭제,5.주문하기");
			menu = sc.nextInt();
			
			switch(menu) {
				case 1:
					System.out.println("조회할 카테고리를 선택하세요");
					System.out.println("1. 색조, 2.기초 , 3.향수 , 4.기타");
					int choice = sc.nextInt();
					if(choice==1) {
						for(int i=0;i<makeup.length;i++) {
							for(int j=0;j<makeup[i].length;j++) {
								System.out.println(makeup[i][j]);
								
							}
						}
						
						}else if(choice==2) {
							for(int i=0;i<skincare.length;i++) {
								for(int j=0;j<skincare[i].length;j++) {
									System.out.println(skincare[i][j]);
									
								}
							}
						}else if(choice==3) {
							for(int i=0;i<perfume.length;i++) {
								System.out.println(Arrays.toString(perfume[i]));
								
							}
						}else {
							for(int i=0;i<Items.length;i++) {
								System.out.println(Arrays.toString(Items[i]));
								
							}
						}
					break;
				case 2:
					int number;
					int count;
					System.out.println("구매하실 상품 번호와 수량을 적어주세요");
					Scanner sc2 = new Scanner(System.in);
					number = sc2.nextInt();
					count = sc2.nextInt();
					
					
					
					
					}
					
					
			}
		}
	}
	

