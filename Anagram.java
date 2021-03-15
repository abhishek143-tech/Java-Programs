package Problems;

public class Anagram {
    public static void main(String[] args) {
        String s1 ="abhi";
        String s2 = "abhis";
        boolean isAnagram = true;
        int arr[] = new int[256];
        for(char c : s1.toCharArray()){
            int index = (int)c;
            arr[index]++;
        }
        for(char c : s2.toCharArray()){
            int index = (int)c;
            arr[index]--;
        }
        for (int i=0;i<256;i++){
            if(arr[i]!=0){
                isAnagram = false;
                break;
            }
        }
        if(isAnagram){
            System.out.println("Anagram");
        }else
            System.out.println("Not an Anagram");
    }
}
