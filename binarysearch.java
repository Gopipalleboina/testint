import java.util.*;
public class binarysearch{
static int binarysearch(int[] ar,int l,int h,int tar){
    //iteration process
    while(l<=h){
        int m=l+(h-l)/2;
        if(ar[m]==tar){
            return m;
        }
        else if(tar > ar[m]){
            l=m+1;
        }
        else{
            h=m-1;
        }
    }
    return -1;
    
    }
    public static void main(String[] args){
        int[] ar={12,11,13,5,6};
        int tar=6;
        int res=binarysearch(ar,0,ar.length-1,tar);
        System.out.println(res);
    }
}
//recurssion process
/*if(l<=h){
    int m=l+(h-l)/2;
    if(ar[m]==tar){
        return m;
    }
   else if(tar> ar[m]){
       return binarysearch(ar,m+1,h,tar);
    }
    else {
return binarysearch(ar, l, m - 1, tar);
}

}
    
        return -1;
    

}*/
    
