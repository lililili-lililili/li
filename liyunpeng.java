package test;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class liyunpeng {
	public static void main(String[] args) throws Exception {
		//�½�����,�������������ѡ���������ѡ���������
		FileWriter f = new FileWriter("F://result.txt");
		Random rm = new Random();
		char[] opera_all = { '*', '/', '+', '-' };
		char operachar;
		//Ҫд���ļ����ַ������� ������ ���涨������
		String write_file = "";
		int m = 0, n = 0, c = 0;
		Scanner sc=new Scanner(System.in);
		int mm=sc.nextInt();
		//������ȡ������Ų��������
		System.out.println("�������ݷ�Χ  ");
		Scanner ss=new Scanner(System.in);
		int nn=sc.nextInt();
		for (int i = 0; i < mm; i++) {
			
			int ope = rm.nextInt(4);
			operachar = opera_all[ope];
			m = (int) (Math.random() * nn);
			n = (int) (Math.random() * nn);
			if ('*' == operachar || '/' == operachar) {
				i--;
				continue;
			}
         //�ж� ѡ��
			switch (operachar) {  
			case '+':
				c = m + n;
				break;
			case '-':
				c = m - n;
				break;
			case '*':
				c = m * n;
				break;
			case '/':
				//�ų���ĸΪ0
				if (n == 0) {
					i--;
					continue;
				}
				c = m / n;
				break;
			}
			//�ų�����
			if (c >= 100 || c < 0) {
				i--;
				continue;
			}
             //�ַ�ƴ�� ��ȥ���ظ�����
			String h = m + "" + operachar + n + "=";
             if (write_file.contains(h)) {
				i--;
				continue;
			}
			write_file = write_file +"��"+(i+1)+"�⣺"+h + " " + "\n";	
		}
		
		//д���ļ����ļ��ر�
		f.write(write_file);
		f.close();
		System.out.println("д���������ļ�F:// result.txt");
	}
}
