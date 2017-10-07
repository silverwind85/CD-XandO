import java.util.HashMap;
import java.util.Map;

public class XandO {
    public static boolean countOX(String n) {
        char[] charArr = n.toCharArray();
        String variableX = "x";
        String variableO = "o";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < charArr.length; i++) {
            map.put(charArr[i], 0);
            for (int j = 0; j < charArr.length; j++) {
                if (charArr[i] == charArr[j]) {
                    map.put(charArr[i], map.get(charArr[i]) + 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()
                ) {
            /*System.out.println(entry.getKey());*/
        }
        for (int i = 0; i < charArr.length; i++) {
            if ((map.get(variableX.charAt(0)) == map.get(variableO.charAt(0)))
                    || ((charArr[i] != variableX.charAt(0)) && (charArr[i] != variableO.charAt(0)))) {
                System.out.println(charArr[i]);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        XandO.countOX("kjk");
    }
}
