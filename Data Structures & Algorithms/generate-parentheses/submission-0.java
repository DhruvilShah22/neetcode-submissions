class Solution {
    private List<String> list;
    public List<String> generateParenthesis(int n) {
        list = new ArrayList<>();
        makeParan(n-1, 1, "(");
        return list;
    }

    public void makeParan(int openPending, int closePending, String runningParam){
        if(openPending > 0){
            makeParan(openPending-1, closePending+1, runningParam + "(");
        }
        if(closePending > 0){
            makeParan(openPending, closePending-1, runningParam + ")"); 
        }
        if(openPending == 0 && closePending == 0){
            list.add(runningParam);
            return;
        }
    }
}
