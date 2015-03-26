//-------------------------------------------------------------------------
// Answer to Challenge #202 [Easy] 
//
// Full Question can be found here:
// http://www.reddit.com/r/dailyprogrammer/comments/2w84hl/20150216_challenge_202_easy_i_am_bender_please/
//
// Notes:
//   Used bit shifting. Since we are already given the data in 1 and 0 we can 
//   create the integer representation of the character by shifting left and setting
//   the current LSB (least significant bit) to a 1 (if we read a 1) or 0. We
//   do this 8 times, print the character, and the reset our counter.
//-------------------------------------------------------------------------

public class Challenge202 {

	public static void main(String[] args) {
		String input = "0111000001101100011001010110000101110011011001010010000001110100011000010110110001101011001000000111010001101111001000000110110101100101";		
		int tempChar = 0;
		char c;
		for(int i = 0; i < input.length(); i++){
			tempChar = tempChar << 1;
			if(input.charAt(i) == '1') tempChar++;

			if(((i+1) % 8) == 0){    //print out when we get a byte
				c = (char) tempChar; //cast to char
				System.out.print(c);
				tempChar = 0;
			}
		}		
	}

}
