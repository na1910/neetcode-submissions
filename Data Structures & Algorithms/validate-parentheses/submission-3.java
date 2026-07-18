class Solution {
    public boolean isValid(String s) {

Map<Character, Character> map= new HashMap<>();
map.put('}','{');
map.put(']','[');
map.put(')','(');
Stack<Character> stack = new Stack<>();
for(char ch:s.toCharArray() ){
if(map.containsKey(ch)) { 
    if(stack.isEmpty()){return false;}
    if(map.get(ch)==stack.peek()){ 
        stack.pop();
    }
    else{return false;}//when case doesnt match top key
}

else {
    stack.push(ch);
}
}

return stack.isEmpty();
        
    }
}
