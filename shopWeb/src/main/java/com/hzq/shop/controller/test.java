package com.hzq.shop.controller;

public class test {
	public static void main(String[] args){
	    String str = "洪智全";
	    byte[] b = str.getBytes();
	    for(int i=0;i<b.length;i++){
	        System.out.println(Integer.toBinaryString(b[i]&0xff));
	    }
//	         byte  [] xing  =  new byte[3];
//	         xing.
//	         xing[0]='11100110';
//	         xing[2]="10110100";
//	         xing[3]="10101010";
//	         String ss = new String(xing);                         
//	                                  
	                                  
	}
//	    String name = null;
//		try {
//			name = new String(b,"UTF-8");
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    
//	    System.out.println(name);
	         
//	}
}
