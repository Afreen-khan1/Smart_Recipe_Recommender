package com.recipe.util;
import java.sql.Connection;
import com.recipe.util.DBUtil;

public class TestDBConnection {

	public static void main(String[] args) {
		try{
			Connection conn = DBUtil.getConnection();
			if(conn !=null){
				System.out.println("Connection Successful");
			}
		} catch(Exception e){
			e.printStackTrace();
		}

	}

}
