import java.util.ArrayList;

public class TwoSecret {
    public String sol(String s, String skip, int index) {

        ArrayList<String> skipList = new ArrayList<>();
        for(int i=0; i <= skip.length()-1; i++){
            skipList.add(skip.substring(i,i+1));
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for(char ap = 'a'; ap <= 'z'; ap++){
            if (!skipList.contains(String.valueOf(ap))) {
                arrayList.add(String.valueOf(ap));
            }
        }
        String [] ansarr = new String[s.length()];

        for(int i=0; i<=s.length()-1; i++){
            ansarr[i] = s.substring(i,i+1);
            int pos = arrayList.indexOf(ansarr[i]);
            int num = pos+index;
            if(num < arrayList.size()) {
                ansarr[i] = arrayList.get(num);
            }else if(num < 2*arrayList.size()){
                ansarr[i] = arrayList.get(num - arrayList.size());
            }else{
                ansarr[i] = arrayList.get(num - 2*arrayList.size());
            }
        }
        String result = String.join("", ansarr);
        return result;
    }
}
