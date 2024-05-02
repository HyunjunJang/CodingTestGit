public class MaxPresident {

    public int solution(String[] friends, String[] gifts) {
        int[] ansarray = num_presidents(friends, gifts);
        int answer = ansarray[0];
        for(int x : ansarray){
            if(x>answer){
                answer = x;
            }
        }
        return answer;
    }

    //각각 주고받은 선물 개수 배열 메서드
    public int[] num_presidents(String[] friends, String[] gifts){
        int[] presidents = new int[friends.length];
        int[] a = friend_pre_index(friends, gifts);
        for(int i=0; i<friends.length-1; i++){
            String x = friends[i];
            for(int j=i+1; j<friends.length; j++){
                String y = x + " " + friends[j];
                String z = friends[j] + " " + x;
                int count = 0;
                for(String w : gifts){
                    if(w.equals(y)){
                        count++;
                    }else if(w.equals(z)){
                        count--;
                    }
                }
                if(count>0){
                    presidents[i]++;
                } else if (count<0) {
                    presidents[j]++;
                } else {
                    if(a[i]-a[j]>0){
                        presidents[i]++;
                    } else if (a[i]-a[j]<0) {
                        presidents[j]++;
                    }
                }
            }
        }
        return presidents;
    }

    //각각의 선물 지수 구하는 매서드
    public int[] friend_pre_index(String[] friends, String[] gifts){
        int[] pre_index = new int[friends.length];
        for(int i=0; i<pre_index.length; i++){
            String x = friends[i];
            int sum = 0;
            for(String s : gifts){
                String[] sarray = s.split(" ");
                if(sarray[0].equals(x)){
                    sum++;
                }else if(sarray[1].equals(x)){
                    sum--;
                }
            }
            pre_index[i] = sum;
        }
        return pre_index;
    }
}
