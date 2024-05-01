import java.util.ArrayList;

public class DataAnalysis {

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        ArrayList<int[]> answer_list = new ArrayList<>(); //Integer배열을 요소로하는 ArrayList

        if(ext.equals("code")){
            for(int i=0; i<data.length; i++){
                if(data[i][0]<val_ext){
                    answer_list.add(data[i]);
                }
            }
        } else if (ext.equals("date")) {
            for(int i=0; i< data.length; i++){
                if(data[i][1]<val_ext){
                    answer_list.add(data[i]);
                }
            }
        } else if (ext.equals("maximum")) {
            for(int i=0; i< data.length; i++){
                if(data[i][2]<val_ext){
                    answer_list.add(data[i]);
                }
            }
        }else if (ext.equals("remain")) {
            for(int i=0; i< data.length; i++){
                if(data[i][3]<val_ext){
                    answer_list.add(data[i]);
                }
            }
        }
        int[][] answer = new int[answer_list.size()][];
        if(sort_by.equals("code")){
            //선택정렬 알고리즘
            for(int i=0; i<answer_list.size()-1; i++){
                int minIndex = i; //최소값이 올 위치 index
                //반복문이 한번더 필요함 2차
                for(int j=i+1; j<answer_list.size(); j++){
                    if(answer_list.get(minIndex)[0]>answer_list.get(j)[0]){
                        minIndex=j;
                    }
                }
                int[] mini = answer_list.get(minIndex);
                answer_list.set(minIndex, answer_list.get(i));
                answer_list.set(i,mini);
                answer[i] = mini;
            }

        } else if (sort_by.equals("date")) {
            //선택정렬 알고리즘
            for(int i=0; i<answer_list.size()-1; i++){
                int minIndex = i; //최소값이 올 위치 index
                //반복문이 한번더 필요함 2차
                for(int j=i+1; j<answer_list.size(); j++){
                    if(answer_list.get(minIndex)[1]>answer_list.get(j)[1]){
                        minIndex=j;
                    }
                }
                int[] mini = answer_list.get(minIndex);
                answer_list.set(minIndex, answer_list.get(i));
                answer_list.set(i,mini);
                answer[i] = mini;
            }
        } else if (sort_by.equals("maximum")) {
            //선택정렬 알고리즘
            for(int i=0; i<answer_list.size()-1; i++){
                int minIndex = i; //최소값이 올 위치 index
                //반복문이 한번더 필요함 2차
                for(int j=i+1; j<answer_list.size(); j++){
                    if(answer_list.get(minIndex)[2]>answer_list.get(j)[2]){
                        minIndex=j;
                    }
                }
                int[] mini = answer_list.get(minIndex);
                answer_list.set(minIndex, answer_list.get(i));
                answer_list.set(i,mini);
                answer[i] = mini;
            }
        } else if (sort_by.equals("remain")) {
            //선택정렬 알고리즘
            for(int i=0; i<answer_list.size()-1; i++){
                int minIndex = i; //최소값이 올 위치 index
                //반복문이 한번더 필요함 2차
                for(int j=i+1; j<answer_list.size(); j++){
                    if(answer_list.get(minIndex)[3]>answer_list.get(j)[3]){
                        minIndex=j;
                    }
                }
                int[] mini = answer_list.get(minIndex);
                answer_list.set(minIndex, answer_list.get(i));
                answer_list.set(i,mini);
            }
        }
        for(int i=0; i< answer_list.size(); i++){
            answer[i] = answer_list.get(i);
        }

        return answer;
    }
}
