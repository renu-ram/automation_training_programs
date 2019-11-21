package stepdef;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Dataprovider {
	
public static String data;
	
	public String readData() throws FilloException
	{

	Fillo obj = new Fillo();
	Connection connect = obj.getConnection("C:\\Users\\training\\Desktop\\Renu\\data.xlsx");
	String str = "Select * from Sheet1 where Name='renulavender@gmail.com'";
	Recordset set = connect.executeQuery(str);
	
	
	while(set.next())
	{
			
		data = set.getField("pwd");
		System.out.println(data);
		
	}

return data;
}
}
