package lab1;


public class Main{
    static boolean isKSpecial(int[] A, int n){
        if(A[0]!=1)
            return false;
        int count1 = 1;
        int count0 = 0;
        for(int i=1;i<n;i++){
            if(A[i]==1){
                count1++;
                count0 = 0;
            }
            else if(A[i]==0){
                count0++;
                if(count0>1)
                    return false;
            }
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        int[] A = new int[args.length];
        for(int i=0;i<args.length;i++){
            A[i]=Integer.parseInt(args[i]);
        }
        System.out.println(isKSpecial(A, args.length));
    }
}


