package Oop.LottoEx;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	private int [] nums;
	//생성자
	public Lotto(){
		nums=new int[6];
	}
	
	public void gen() {
	Random rand = new Random();
		for(int i=0; i<6; i++){
			nums[i]=rand.nextInt(45)+1;
		}
	}
	public void print(){ 
			for (int i = 0; i < 6; i++) {
			System.out.print(nums[i] + "  ");
		}
		}
	}

