import java.io.*;
import java.util.*;
public class Client {
	public static void main(String[] args)
	{
		persistence fp=new Filepesistence();
		fp.persist();
		persistence dp=new Databasepersistence();
		dp.persist();
	}


}
