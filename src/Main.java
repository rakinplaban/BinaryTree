import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        char info[] = {'A','B','C','D','E','F','G',' ','H',' ',' ','I','J',' ',' '};
        int left[] = {1,3,5,-1,-1,11,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int right[] = {2,4,6,8,-1,12,-1,-1,-1,-1,-1,-1,-1,-1,-1};

        Queue<Integer> tree = new ArrayDeque<>();
        int root = 0;
        tree.add(root);
        while(!tree.isEmpty()){
            if(left[root] != -1){
                tree.add(left[root]);
            }
            if(right[root] != -1){
                tree.add(right[root]);
            }
            int poped_item = tree.remove();
            System.out.print(info[poped_item]);
            root++;
        }
    }
}