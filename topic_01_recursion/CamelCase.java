public class CamelCase {
    public static void camelCase(String words[], int idx, StringBuilder sb) {

        if (idx == words.length) {
            System.out.println(sb);
            return;
        }

        StringBuilder word = new StringBuilder(words[idx]);
        if (word.length() == 0) {
            camelCase(words, idx + 1, sb);
        } else {
            char first = word.charAt(0);
            char newFirst = Character.toUpperCase(first);  // or first = Character.toUpperCase(first);
            word.setCharAt(0, newFirst);
            sb.append(word);
            camelCase(words, idx + 1, sb);
        }
    }
    public static void main(String[] args) {
        String str = "Hello world   JaVa jAva";
        StringBuilder sb = new StringBuilder();
           // small
        String samll = str.toLowerCase();  // or str = str.toLowerCase();
        
        // split with space
        String words[] = samll.split(" ");

        sb.append( words[0]);
        camelCase(words, 1, sb); //helloWorldJavaJava
    }
}

