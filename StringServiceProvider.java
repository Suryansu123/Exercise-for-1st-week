package com.htc.exercise1stwk.main;

public class StringServiceProvider<Char> {
	
	public void reverseStr(String str) {
		byte[] strAsByteArr= str.getBytes();
		byte[] result = new byte[strAsByteArr.length]; 
	   	
    	for(int i=0; i< strAsByteArr.length; i++) {
    		
    		result[i] = strAsByteArr[strAsByteArr.length - i - 1];
    		
    	}
    	System.out.println("Result: " + new String(result));
	}
	
	public void linearSearch(String str1, String str2) {
		boolean found = false;
				
		if (str1.matches(str2)) {
				found=true;
				System.out.println(str1 + " matches " + str2 );	
			}
		else {
			System.out.println(str1 + " not matches " + str2 );
		}
			
	}
	
	public void replaceString(String realstr, String srchstr, String replstr) {
		String Replacestr = realstr.replaceFirst(srchstr, replstr);
		System.out.println("Replace String: " + Replacestr);
	}
		
}
			  

