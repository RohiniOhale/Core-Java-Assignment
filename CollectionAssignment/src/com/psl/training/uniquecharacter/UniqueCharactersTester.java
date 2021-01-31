package com.psl.training.uniquecharacter;



public class UniqueCharactersTester {

	


	  public static void main(String[] args) {
	        int nArgs = args.length;
	        for (int i=0; i<nArgs; i++) {
	            String str = args[i];
	            int result = UniqueCharacters.countUniqueCharacters(str);
	            System.out.println(str + ": " + result);
	        }
	  
	  }

}
