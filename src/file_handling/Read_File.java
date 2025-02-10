package file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Read_File {

	public static void main(String[] args) throws IOException{
		String filepath="C:\\Users\\gaura\\eclipse-workspace\\Day_24\\src\\file_handling\\Product.txt";
		File file =new File(filepath);
		FileReader fileReader=new FileReader(file);
		BufferedReader br=new BufferedReader(fileReader);
		
		ArrayList<Product>al=new ArrayList<Product>();
		
		String line ="";
		while((line=br.readLine())!=null) {
			String productArray[]= line.split(",");
			
			Product product=new Product();
			product.productName=productArray[0];
			product.price=productArray[1];
			product.quantity=productArray[2];
			al.add(product);	
			
											
		}
		for(Product product:al)
		{
			System.out.println("Product Name="+product.productName);
			System.out.println("Product price="+product.price);
			System.out.println("Product quantity="+product.quantity);
		}
	}
}
