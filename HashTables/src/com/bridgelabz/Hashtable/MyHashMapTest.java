package com.bridgelabz.Hashtable;

public class MyHashMapTest {	
	public static void main(String[] args) {
		givenASentence_WhenWordAreAddedToList_ShouldReturnParanoidFrequency();
	}

	private static void givenASentence_WhenWordAreAddedToList_ShouldReturnParanoidFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid "
				+ "but because they keep putting themselves "
				+ "deliberately into paranoid avoidable situations";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		String[] words = sentence. toLowerCase().split(" ");
		for(String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myHashMap.add(word, value);
		}
		int frequency = myHashMap.get("paranoid");
		System.out.println(myHashMap);
		System.out.println("Frequency of give word 'paranoid' is " + frequency);
		myHashMap.removeKey("avoidable");
		System.out.println("Hash Map after deleting avoidable");
		System.out.println(myHashMap);
	}
}

