package com.srikanth.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Test {

	static Set<String> splitAndTrimWords(String word, Set<String> set) {
		if(word.isEmpty()) {
			return set;
		}
		StringTokenizer st = new StringTokenizer(word, ":., ");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println("Test.splitAndTrimWords() st="+token);

			set.add(token.trim().toLowerCase());
		}
		return set;
	}
	private static boolean fuzzyNameMatch(Set<String> set1, Set<String> set2) {

		List<String> found = new ArrayList<String>();
		boolean allFound = true;
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()) {
			String token = iter.next();
			if(set2.contains(token)) {
				found.add(token);
			} else {
				allFound = false;
			}
		}
		if(allFound) {
			return true;
		}

		for(int i=0; i<found.size(); i++) {
			set1.remove(found.get(i));
			set2.remove(found.get(i));
		}
		
		// now do acronym match
		// find all possible acronyms
		
		String acronym = "";
		Iterator<String> iter2 = set2.iterator();
		while(iter2.hasNext()) {
			String token = iter2.next();
			acronym = acronym + token.charAt(0);
		}
		List<String> possibleAcronyms = permutations(acronym);

		if(possibleAcronyms != null) {
			allFound = true;
			iter = set1.iterator();
			while(iter.hasNext()) {
				String token = iter.next();
				if(!possibleAcronyms.contains(token)) {
					allFound = false;
				}
			}
			if(allFound) {
				return true;
			}
		}
		
		return false;
	}
	
	private static List<String> permutations(String s) {
        List<String> partial = new ArrayList<>();
 
        partial.add(String.valueOf(s.charAt(0)));
 
        for (int i = 1; i < s.length(); i++) {
 
            for (int j = partial.size() - 1; j >= 0 ; j--) {
                String str = partial.remove(j);
 
                for (int k = 0; k <= str.length(); k++) {
                    partial.add(str.substring(0, k) + s.charAt(i) +
                                str.substring(k));
                }
            }
        }
 
        return partial;
    }
	
	
	
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		splitAndTrimWords("srikanth:kri ",set);
		splitAndTrimWords(" kkk",set);
		
		Set<String> set2 = new HashSet<String>();
		splitAndTrimWords("srikanth ", set2);
		splitAndTrimWords("kk", set2);

		System.out.println(set.toString());
		System.out.println(set2.toString());
		
		System.out.println("method="+fuzzyNameMatch(set,set2));
		
	}

}
