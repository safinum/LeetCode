class Solution {
    public String interpret(String command) {
        String newString = command.replace("()","o");
        newString = newString.replace("(al)", "al");
        return newString;
    }
}