/*
�����ڲ��ࣺ
1.	�����ڲ�����ʵ�����ڲ���ļ�д��ʽ��
2.	���������ڲ����ǰ�᣺
		�ڲ�������Ǽ̳�һ�������ʵ�ֽӿڡ�
*/
abstract class AbsDemo
{
	abstract void show();
}
class Outer 
{
	int x = 3;
	
		class Inner extends AbsDemo
		{
			 void show()
			{
				System.out.println("show:"+x);
			}
		}
		public void function()
		{
			new Inner().show();
		}
}

class hideinner
{
	public static void main(String[] args)
	{
		new Outer().function();
	}
}