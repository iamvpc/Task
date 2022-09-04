package jdbcapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnSingleton {
	//Static member holds only on instance of the SingletonClass class.
	private static  DBConnSingleton singletonClass;
	private static final String URL="jdbc:mysql://localhost:3306/prodaptdb";
	 Connection conn=null;
	
	 private  DBConnSingleton() {
			
		
	 
	 
	  try {
          conn=DriverManager.getConnection(URL,"root","admin");
	  
	 } catch(SQLException e) {
       	   //TODO-Auto-generated catch block
       	   e.printStackTrace();
          }
}

        //Now we are going to provide access 
        public static DBConnSingleton getInstance() {
	if(singletonClass ==null) {
		singletonClass= new DBConnSingleton();
	}
	
	return (DBConnSingleton) singletonClass.conn;
        }


		public static Connection getDBConnection() {
			// TODO Auto-generated method stub
			return null;
		}
}