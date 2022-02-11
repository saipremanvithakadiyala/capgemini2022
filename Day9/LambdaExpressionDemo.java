package com.demo.collections;

@FunctionalInterface
interface Drawables{
	
	public void  draw();
	
}


public class LambdaExpressionDemo {
		
	public static void main(String ar[]) {
		
		int width = 10;
		//functional style
		Drawables d =() ->{
			
			System.out.println("draw"+width);
		};
		d.draw();
	}

}
