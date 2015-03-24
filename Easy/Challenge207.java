	//-------------------------------------------------------------------------
	// Answer to Challenge #207 [Easy] Bioinformatics 1: DNA Replication
	//
	// Full Question can be found here:
	// http://www.reddit.com/r/dailyprogrammer/comments/2zyipu/20150323_challenge_207_easy_bioinformatics_1_dna/
	//
	// Input:
	// A A T G C C T A T G G C
	//
	// Output:
	// T T A C G G A T A C C G
	//
	// Console Output:
	// A A T G C C T A T G G C
	// T T A C G G A T A C C G
	//
	//-------------------------------------------------------------------------

	import java.util.HashMap;
	public class Challenge207 {
	
		public static void main(String[] args) {
			
			HashMap<Character, Character> hm = new HashMap<Character, Character>();
			
			hm.put((Character)'A', new Character('T'));
			hm.put((Character)'T', new Character('A'));
			hm.put((Character)'G', new Character('C'));		
			hm.put((Character)'C', new Character('G'));
			hm.put((Character)' ', new Character(' '));
			
			String input = "A A T G C C T A T G G C";
			
			System.out.println(input);
			
			for(int i = 0; i < input.length(); i++){
				System.out.print(hm.get(input.charAt(i)));
			}	
		}
	}