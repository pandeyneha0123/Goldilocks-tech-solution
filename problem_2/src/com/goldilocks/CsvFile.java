package com.goldilocks;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvFile {
	public static void main(String[] args) throws IOException {
		String fnme="src//inf.csv";
		BufferedReader rdr=null;
		String r="";
		try {
			rdr=new BufferedReader(new FileReader(fnme));
			while((r=rdr.readLine())!=null) {
				String [] rw=r.split(",");
				for(String p:rw) {
					System.out.print(" "+p);
				}
				System.out.println();
				
			}
		} catch (Exception exz) {
			
			exz.printStackTrace();
		}finally {
			rdr.close();
		}
		
	}

}
