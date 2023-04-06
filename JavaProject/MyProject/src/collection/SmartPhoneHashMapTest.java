package collection;

import java.util.HashMap;
import java.util.Set;

public class SmartPhoneHashMapTest {

	public static void main(String[] args) {

		HashMap<String, SmartPhone> hashMap = new HashMap<String, SmartPhone>();

		SmartPhone p = new SmartPhone("Spring", "010-1111-2222");
		hashMap.put("ver", p);

		SmartPhone p2 = new SmartPhone("SON", "010-1111-2222"); // 키값, 이름 등등 중복 불가능, 마지막에 저장된 키로 저장됨
		hashMap.put("programName", p2);

		System.out.println(hashMap.get("ver"));
		System.out.println(hashMap.get("programName"));

		System.out.println("------------------------");

		Set<String> keySet = hashMap.keySet();
		for (String keyName : keySet) {
			System.out.println(keyName + " : " + hashMap.get(keyName));
		}

	}
}
