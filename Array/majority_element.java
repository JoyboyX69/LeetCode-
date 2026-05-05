class Main {
    public static void main(String[] args) {
        int[] arr ={ 2,1,1,1,2,2,1};
        int candidate=arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++){
           if(count==0){
                candidate=arr[i];
                count++;
           }
            else if(candidate==arr[i]){
                count++;
            }
            
            else{
                count--;
            }
        }
        int freq = 0;
        for(int num : arr){
            if(num == candidate) freq++;
        }

        if(freq > arr.length / 2){
            System.out.println("Majority Element: " + candidate);
        } else {
            System.out.println("No Majority Element");
        }
    
    }
}