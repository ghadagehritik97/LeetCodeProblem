package src.binarySearchOn1DArray;

public class RotationCountInRotatedArray {
    public static void main(String[] args) {
        int []arr={4,5,6,7,0,1,2};
        //rotation count will be number of elements till pivot i.e why counting pivot.
        System.out.println(rotationCount(arr));
    }

    private static int rotationCount(int[] arr) {
        return findPivot(arr)+1;
    }
    private static int findPivot(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid-1]>arr[mid]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;

    }

}
