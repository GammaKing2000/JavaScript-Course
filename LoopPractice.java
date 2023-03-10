public class LoopPractice {
	public static void main(String[] args) {
		String[][] wordData = {{"study", "consider", "examine", "learn"}, {"ponder", "read", "think", "cogitate"}};
		
		//Use nested enhanced for loops to calculate the total number of characters in the wordData 2D array and print the result to the console. (Get the string .length() of each element)
		int characterCount = 0;
    for(String[] s: wordData){
      for(String p: s){
      characterCount+=p.length();}
    }
    
    System.out.println(characterCount);
		
		//Using nested while loops, iterate through all of the elements in the 2D array and print them to the console using the format: word [row][column]. The formatted print statement has been provided.
		int i=0;
    int j=0;
    while(i<=1){
      j=0;
      while(j<4){
        System.out.println(wordData[i][j] + ": [" + i + "]" + "[" + j + "]");
        j++;
      }
      i++;
    }
	}	
}
