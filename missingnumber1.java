class missingnumber1 {
    public static void main(String[] args) {
       int[] arr={1,2,4,5};
       int n=5;
       int sum1=(n*(n+1)/2);
       int sum=0;
       for(int i=0;i<arr.length;i++){
           sum=sum+arr[i];
       }
       int missing=sum1-sum;
       System.out.println(missing);
      
    }
}