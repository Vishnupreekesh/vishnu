import java.util.*;
class skill2{
	public static void main(String[] args){
		int a[]=new int[7];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<7;i++){
			a[i]=s.nextInt();
		}
		float S;
		float n[]=new float[5];
		for(int i=0;i<5;i++){
			S=a[i]+a[i+1]+a[i+2];
			 n[i]=S/3;
		}
		float min=n[0];
		for(int i=1;i<5;i++){
			if(min>n[i]){
				min=n[i];
			}
		}
		System.out.format("%.2f",min);
	}
}
				
			
		
	