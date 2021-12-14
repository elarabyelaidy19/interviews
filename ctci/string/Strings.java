package ctci.arrstring;

import java.util.Arrays;



public class Strings { 
    public boolean isUnique(String str) { 
        if(str.length() > 128) // 128 indecates the number of unique chars in ascii code  
            return false; 
        
        boolean[] charSet = new boolean[128]; // array of boolean values indecates the presence of a char 
        for(int i = 0; i < str.length(); i+= 1) { 
            int val = str.charAt(i); // 
            if(charSet[val]) { // if the value at the given index is true return false 
                return false; 
            }
            charSet[val] = true; // set the value of the index to true 
        } 
        return true;
    } 

    public boolean isPermutauion(String s, String t) { 
        if(s.length() != t.length()) 
            return false;

        return sort(s).equals(sort(t));
    }

    public String sort(String s) { 
        char[] chars = s.toCharArray(); 
        Arrays.sort(chars); 
        return new String(chars);

    } 

    boolean isPermutauion2(String s, String t) { 
        if(s.length() != t.length()) 
            return false; 

        int[] letters = new int[128]; 
        char[] char_set = s.toCharArray(); 

        for(char c : char_set) 
            letters[c]++;  // frquency array
        
        for(int i = 0; i < t.length(); i++) { 
            int c = (int) t.charAt(i); 
            letters[c]--; 
            if(letters[c] < 0) {
                return false;
        
            }
        }
        return true;

    } 

    void replaceSpaces(char[] str, int actualLength) { 
        int spaceCount = 0; 
        int index, i = 0; 

        for(i = 0 ; i < actualLength; i++) { 
            if(str[i] == ' ')  
                spaceCount++; 
        }

        index = actualLength + spaceCount * 3; 
        for(i = actualLength - 1; i >= 0; i--) {  // O(N) Time, O(N) space

            if(str[actualLength] == ' ') { 
                str[index - 1] = '0'; 
                str[index - 2] = '2'; 
                str[index - 3] = '%'; 
                index -= 3;
            }else { 
                str[index - 1] = str[i]; 
                i--;
            }
        }
    } 

    boolean blindromePermutation(String s) { 
        int[] table = frquencyTable(s);  
        return checkMaxOneOdd(table);

    } 

    boolean checkMaxOneOdd(int[] table) { 
        boolean flag = false; 
        for(int count : table) { 
            if(count % 2 == 1) { 
                if(flag) { 
                    return false;
                }
                flag = true;
            }
        }
        return true;
    }

    int getCharNumber(Character c) { 
        int a = Character.getNumericValue('a'); 
        int z = Character.getNumericValue('z'); 
        int val = Character.getNumericValue(c); 

        if(a <= val && val <= z) {
            return val - a;  
        }
        return -1;
    }

    int[] frquencyTable(String str) { 
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a')]; 
        for(char c : str.toCharArray()) { 
            int x = getCharNumber(c); 

            if(x != -1) { 
                table[x]++;
            }
        }
        return table;
    } 

    boolean blindromePermutation2(String str) { 
        int countOdd = 0; 
        int[] table = new int[Character.getNumericValue('a') - Character.getNumericValue('z') + 1]; 
        
        for(char c : str.toCharArray()) {
            int x = getCharNumber(c);  
            if(x != -1) {  
                table[x]++;
                if(table[x] % 2 == 1) { 
                    countOdd++;
                }else { 
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;

    }


} 
