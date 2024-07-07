public class StringApp {
    public boolean checkSubString(String data,String check){
        return data.contains(check);
    }
    public int countCharlnString(String mainString,String srearchChar){
        //lam hoang a
        int count = 0;//1
        int index = 0;

        while (true) {
            index = mainString.indexOf(srearchChar, index);//2
            if (index == -1) {
                break;
            }
            count++;
            index += srearchChar.length();// 2 + 1 = 3
        }

        return count;
    }
    public String UpperCaseToString(String mainString){
        return mainString.toUpperCase();
    }
    public boolean isPalindrome(String mainString) {

        String cleanedString = mainString.replaceAll("\\s", "").toLowerCase();

        // level
        for (int i = 0; i < cleanedString.length() / 2; i++) {
            if (cleanedString.charAt(i) != cleanedString.charAt(cleanedString.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
