/**
 * java期末專題
 * 個人圖書管理系統
 *
 * @作者: ACS107106 林芃儀
 * @日期: 2020/1/1
 */
import java.util.*;
import java.io.*;
public class BOOK 
{
		static ArrayList<BOOK> book=new ArrayList<>();
		private String name;
		private String author;
		private String publisher;
		private String number;
		private String category;
		private String year;
		
		public void menu()throws IOException
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("-----主選單-----");
			System.out.println("1:新增資料");
			System.out.println("2:查詢資料");
			System.out.println("3:修改資料");
			System.out.println("4:刪除資料");
			System.out.println("5:顯示資料");
			System.out.println("6:回上一層");
			System.out.println("7:離開");
			System.out.println("您要使用哪個功能(輸入數字1~7): ");
		
			int choice=sc.nextInt();
			while(choice<1||choice>7)
			{
				System.out.print("輸入錯誤,請重新輸入(1~7): ");
				choice=sc.nextInt();
			}
			switch(choice)
			{
				case 1:this.Add();break;
				case 2:this.Search();break;
				case 3:this.Modify();break;
				case 4:this.Delete();break;
				case 5:this.ViewAll();break;
				case 6:this.Back();break;
				case 7:this.Quit();break;
			}
			sc.close();
		}
		
		//程式碼太長，部分省略，提供參考
		
		public static void main(String[] args)throws IOException 
		{
			BOOK b=new BOOK();
		}
}