package myArray;

public class MyArrayTest {
	public static void main(String[] args) {
		MyArray t = new MyArray();
		int size = t.size();
		System.out.println("t size : " + size);
		t.show();
		t.add(20);
		t.add(99);
		t.add(86);
		t.add(23);
		t.add(25);
		System.out.println("添加之后");
		t.show();
		System.out.println("t size : " + t.size());
		t.delete(0);
		System.out.println("删除之后");
		t.show();
		System.out.println("t size : " + t.size());
		//t.delete(20);
		System.out.println("得到的元素为："+t.get(1));
		t.insert(2, 520);
        t.show();
		
	}
}
