package T05_Recursion;


public class R11_remove_duplicats {
    public static void main(String[] args) {
        removeDuplicats("appnacollege", 0, new StringBuilder(), new boolean[26]);
    }
    public static void removeDuplicats(String str, int ind, StringBuilder sb, boolean arr[]){
        if(ind == str.length()){
            System.out.println(sb);
            return;
        }
        char ch = str.charAt(ind);
        if(arr[ch-'a'] == true){
            removeDuplicats(str, ind+1, sb, arr);
        }else{
            arr[ch-'a'] = true;
            removeDuplicats(str, ind+1, sb.append(ch), arr);
        }
        
    }
}
