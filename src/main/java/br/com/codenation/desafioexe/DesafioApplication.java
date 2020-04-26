package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {


	private int [] sequenciaFibonacci2;

	public static List<Integer> fibonacci() {
		Integer [] sequenciaFibonacci = new Integer[15];
		List <Integer> fibonacci = new ArrayList<>();

		sequenciaFibonacci[0]=0;
		sequenciaFibonacci[1]=1;
		sequenciaFibonacci[2]=1;

		for(int i=2,j=3;j< sequenciaFibonacci.length;i++){
			int soma=sequenciaFibonacci[i-1]+sequenciaFibonacci[i];
			sequenciaFibonacci[j]=soma;
			j++;
		}

		for(int a : sequenciaFibonacci){
			fibonacci.add(a);
		}

		return fibonacci;
	}

	public static Boolean isFibonacci(Integer a) {
		List <Integer> fibonacci = fibonacci();

		if(fibonacci.contains(a)){
			return true;
		}
		return false;
	}

}