package myfirstproject;

import java.io.*;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

public class main
{
	public static void main(String[] args)
	{
		try 
		{
		File f = new File("bloom.txt");
		if(f.createNewFile())
		{
			System.out.println("File Created!");
		}
		else
		{
			System.out.println("File not Created!");
		}
		}
		catch(IOException e)
		{
			System.out.println("An Error Occured!!");
		}
		try
		{
			FileWriter w=new FileWriter("bloom.txt");
			w.write("Mano: 9095302145"+"\n"+"Mohan: 9095302146");
			w.close();
		}
		catch(IOException e)
		{
			System.out.println("An Error Occured!!");
			e.printStackTrace();
		}
			try
			{
				File f = new File("bloom.txt");
				Scanner s=new Scanner(f);
				while(s.hasNextLine()) 
				{
					String data=s.nextLine();
					String num[]=data.split(" ");
					if(Pattern.matches("[7-9]{1}[\\d]{9}",num[1]))
					{
						try 
						{
							File f1=new File(num[0]+".txt");
							if(f1.createNewFile()) 
							{
								System.out.println("File created!!");
								try
								{
									Calendar c=Calendar.getInstance();
									FileWriter w1=new FileWriter(num[0]+".txt");
									w1.write(c.getTime().toString());
									w1.close();
								}
								catch(IOException e)
								{
									System.out.println("An Error Occured!!");
									e.printStackTrace();
								}
							}
						}
						catch(IOException e)
						{
							System.out.println("An Error Occured!!");
							e.printStackTrace();
						}
					}
				}
			}
			catch(IOException e)
			{
				System.out.println("An Error Occured!!");
				e.printStackTrace();
			}
		
		
		
		}		
	    
}

