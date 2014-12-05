//类方法（静态方法）不可访问非静态变量（成员）
//类方法不能被定义为抽象方法，当前类必须为静态类。
//可以通过对象引用类名（不需要实例化）访问静态方法
//不能再静态方法内部访问实例变量和实例方法
//静态方法中不可以使用this.super关键字
public class ClassTurns{
	//类变量
	static String a= getStaticVar();
	//类方法
	private static String  getStaticVar(){
		System.out.println("类方法方法");
		return"static变量";
	}
	
	//实例变量
	int var;
	//实例方法
	private int getInt(){
		System.out.println("实例方法");
		return 123;
	}
	//静态代码块
	
	static {
		System.out.println("静态代码块");
	
	}
	//构造方法
	public ClassTurns(){
		System.out.println("构造方法");
	}
	
	/* public static void main(String[] args){
		System.out.println("进入main");
		ClassTurns ci = new ClassTurns();
		System.out.println("退出main");
	} */
}