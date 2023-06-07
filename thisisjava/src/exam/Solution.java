package exam;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        for(int i=0;i<park.length;i++){
            if(park[i].contains("S")){
                answer = new int[]{i, park[i].indexOf("S")};
            }
        }
        for(int i=0;i<routes.length;i++){
            char dir = routes[i].charAt(0);
            int dis =  routes[i].charAt(2) -'0';
            if("W".equals(dir+"")){
                if(answer[1]-dis< 0){
                    continue;
                }
                if(park[answer[0]].substring(answer[1]-dis,answer[1]).contains("X")){
                    continue;
                }
                answer[1]-=dis;
            }
            if("N".equals(dir+"")){
                if(answer[0]-dis<0){
                   continue;
                }
                for(int j =answer[0];j<answer[0]-dis;j--){
                    if("X".equals(park[j].charAt(answer[1])+"")){
                        continue;
                    }
                }
                 answer[0]-=dis;
            }
            if("E".equals(dir+"")){
                if(answer[1]+dis >= park[answer[0]].length()){
                   continue;
                }
                if(park[answer[0]].substring(answer[1],answer[1]+dis).contains("X")){
                    continue;
                }
                answer[1]+=dis;
            }
            if("S".equals(dir+"")){
                if(answer[0]+dis >= park.length){
                    continue;
                }                
                for(int j =answer[0]+1;j<=answer[0]+dis;j++){
                    if("X".equals(park[j].charAt(answer[1])+"")){
                        continue;
                    }
                }
                answer[0]+=dis;
            }
            System.out.println(answer[0]+" "+answer[1]);
        }
        return answer;
    }
    public static void main(String[] args){
    	intsolution()
    }
}