package a.b.c.java_basic.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap03 {
	
	static HashMap phoneBook = new HashMap();
	
	public static void main(String[] args) {
		addPhoneNum("친구","김","01045975423");
		addPhoneNum("친구","이","01045975422");
		addPhoneNum("친구","오","01045975426");
		addPhoneNum("회사","대리","01045975429");
		addPhoneNum("회사","과장","01045975421");
		addPhoneNum("회사","사원","01045975428");
		addPhoneNum("세탁","강","01045975411");
		printList();
	}
	
	static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap());
		}
	}
	
	static void addPhoneNum(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tel, name); // 중복될 일 없는 전화번호를 key로 설정.
	}
	
	static void addPhoneNum(String name, String tel) {
		addPhoneNum("기타", name, tel);
	}
	static void printList() {
		Set set = phoneBook.entrySet(); // 키, 값 모두
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			Set subSet = ((HashMap)e.getValue()).entrySet(); // 키, 값 모두. 처음의 값이 map 이었고, 그 map의 키, 값을 가져오기 위해. 
			Iterator subIt = subSet.iterator();
			
			System.out.println(" * " + e.getKey()+ "["+subSet.size()+"]");
			
			while(subIt.hasNext()) {
				Map.Entry subE = (Map.Entry)subIt.next();
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name + " " + telNo);
			}
			System.out.println();
		}
	}
	
	
	
	
	

}
