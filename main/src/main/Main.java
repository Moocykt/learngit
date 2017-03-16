package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	private HashMap<String, Integer> map = new HashMap<String,Integer>();
	private ArrayList<String> city = new ArrayList<String>();
	public void add( String s ){
		city.add(s);
	}
	public String get(int index){
		return city.get(index);
	}
	public void put(String s,int k){
		map.put(s,k);
	}
	public int get(String s){
		return map.get(s);
	}
 	public static void main(String[] args) {
 		Main m = new Main();
 		Scanner in = new Scanner(System.in);
 		int cnt=0;
 		while( true ){
 			String s = in.next();
 			if( s.equals("###") ){
 				break;
 			}else{
 				m.add(s);
 				cnt++;
 			}
 		}
 		int[][] a = new int[cnt][cnt];	
 		for( int i=0;i<cnt;i++ ){
 			for( int j=0;j<cnt;j++ ){
 				a[i][j] = in.nextInt();
 			}
 		}
 		String s1 = in.next();
 		String s2 = in.next();
 		for( int i=0;i<cnt;i++ ){
 			for( int j=0;j<cnt;j++ ){
 				m.put(m.get(i)+" "+m.get(j),a[i][j] );
 			}
 		}
 		System.out.println(m.get(s1+" "+s2));
		System.out.println("Hello World");
 		}
		
}


