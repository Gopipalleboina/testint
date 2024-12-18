public class countingvowel {
    public static void main(String[] args) {
       String s = "Hey Everyone";
       int count = 0;
       s = s.toLowerCase();
       char[] ar = {'a', 'e', 'i', 'o', 'u'};
       for (int i = 0; i < s.length(); i++) {
           for (int j = 0; j < ar.length; j++) {
               if (s.charAt(i) == ar[j]) {
                   count++;
               }
           }
       
       System.out.println(count+" "+s.charAt(i));
        }
    }
}
