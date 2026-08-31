class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        for(String i : arr){
            if("..".equalsIgnoreCase(i)){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else if(!"".equalsIgnoreCase(i) && !".".equalsIgnoreCase(i)){
                stack.push("/" + i);
            }
        }
        String str = "";
        while(!stack.isEmpty()){
            str = stack.pop() + str;
        }
        return str == "" ? "/" : str;
    }
}