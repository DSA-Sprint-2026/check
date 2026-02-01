class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');
        LinkedList<Character> sequence = new LinkedList<>();

        int n = s.length();
        for(char ch : s.toCharArray()){
            if(brackets.containsKey(ch)){
                if(sequence.isEmpty() || sequence.removeLast() != brackets.get(ch)){
                    return false;
                }
            }
            else{
                sequence.add(ch);
            }
        }

        if(sequence.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
