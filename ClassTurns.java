//�෽������̬���������ɷ��ʷǾ�̬��������Ա��
//�෽�����ܱ�����Ϊ���󷽷�����ǰ�����Ϊ��̬�ࡣ
//����ͨ��������������������Ҫʵ���������ʾ�̬����
//�����پ�̬�����ڲ�����ʵ��������ʵ������
//��̬�����в�����ʹ��this.super�ؼ���
public class ClassTurns{
	//�����
	static String a= getStaticVar();
	//�෽��
	private static String  getStaticVar(){
		System.out.println("�෽������");
		return"static����";
	}
	
	//ʵ������
	int var;
	//ʵ������
	private int getInt(){
		System.out.println("ʵ������");
		return 123;
	}
	//��̬�����
	
	static {
		System.out.println("��̬�����");
	
	}
	//���췽��
	public ClassTurns(){
		System.out.println("���췽��");
	}
	
	/* public static void main(String[] args){
		System.out.println("����main");
		ClassTurns ci = new ClassTurns();
		System.out.println("�˳�main");
	} */
}