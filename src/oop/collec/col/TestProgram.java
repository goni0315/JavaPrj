package oop.collec.col;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class TestProgram {

	public static void main(String[] args) {
		Map<String, String> student = new HashMap<>();
		
		student.put("�̸�", "�����");
		student.put("����", "20�찰�� 26");
		student.put("��ȭ��ȣ", "010112119");
		student.keySet();
		for(String key : student.keySet())
			System.out.printf("key :  %s, value : %s \n ",key,student.get(key));
		
		
		/*GenericList<String> list = new GenericList<String>();
		Set set = new HashSet<Integer>();
		
		list.add("fuck it");
		list.add("bye");
		list.add("hello");
		list.add("int i");
		list.add("int k");
		list.add("int j");
		list.add("int a");
		list.add("int b");
		list.add("int n");
		list.add("int z");
		
		GIterator iter = list.iterator();
		
		while(lter.hasNext()) {
			System.out.println(lter.next());*/
		
		/*Set set = new LinkedHashSet();
		set.add(1);
		set.add(4);
		set.add(3);
		set.add(89);
		set.add(6);
		set.add(8);
		set.add(56);
		set.add(33);
		set.add(10);
		
		
		for(Object o : set)
			System.out.println(o);*/
			
	}
}
