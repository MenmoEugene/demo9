class Demo
{
	int div(int a ,int b)
	{
		return a/b;
	}
}

class ExceptionDemo
{
	public static void main(String[] args)
	{
		Demo d = new Demo();
		try
		{
			int x = d.div(4,0);
			System.out.println("x="+x);
		}
		catch (Exception e)//Exception e = new AritchmeticException();
		{
			System.out.println("��ĸ����Ϊ��");
			System.out.println(e.getMessage());
			System.out.println(e.toString());//�쳣���ƣ��쳣��Ϣ

			e.printStackTrace();//�쳣���ƣ��쳣��Ϣ���쳣���ֵ�λ�á�
								//��ʵjvmĬ�ϵ��쳣������ƣ������ڵ���printStackTrace��������ӡ�쳣�Ķ�ջ�ĸ�����Ϣ��
		}
		System.out.println("over");
	}
}