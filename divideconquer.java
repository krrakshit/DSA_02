public class divideconquer {
    public static void printarr(int arr[]){
        for (int i =0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergesort(int arr[], int si,int ei){
        if (si>=ei) {
            return;

        }
        //body
        int mid = si + (ei-si)/2;
        mergesort(arr, si, mid); //  left part
        mergesort(arr, mid+1, ei); //  right part
        merge(arr,si, mid, ei);

    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si;// iterator for left part;
        int j = mid+1;//iterator for right part
        int k = 0;
        while (i<=mid && j<=ei) {
            if (arr[i]<arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;

        }
        //left part
        while (i<=mid) {
            temp[k++]=arr[i++];
        }
        // right part
        while (j<=ei) {
            temp[k++]=arr[j++];
        }
        // copy temp to original
        for (k=0,i=si;k<temp.length;k++,i++) {
            arr[i]=temp[k];

        }

    }
    public static void quicksort(int arr[],int si,int ei){
        if (si>=ei) {
            return;

        }
        // last element
        int pidx = partition(arr,si,ei);
        quicksort(arr, si, pidx-1);//left
        quicksort(arr, pidx+1, ei);

    }
    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1; // to make place for els smaller than pivot
        for(int j = si;j<ei;j++){
            if (arr[j]<=pivot) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i]= temp;

            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i]; // pivot = arr[i] should not be written
        arr[i]= temp;
        return i;


    }
    public static int search(int arr[],int tar,int si,int ei){
        if (si>ei) {
            return -1;

        }


        // body
        int mid = si+(ei-si)/2;
        // case
        if (arr[mid]==tar) {
            return mid;

        }
        // mid on l1;
        if (arr[si]<=arr[mid]) {
            //case a; left
            if (arr[si]<= tar&& tar<=arr[ei]) {
                return search(arr, tar, si, mid);

            }
            else{
                // case b;
                return search(arr, tar, mid+1, ei);
            }
        }
        else{
            // case right
            if (arr[mid]<= tar && tar<=arr[ei]) {
                return search(arr, tar, mid+1, ei);

            }
            else{
                return search(arr, tar, si, mid-1);
            }

        }

    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int tar = 0;
        int taridx = search(arr, tar, 0, arr.length-1);
        System.out.println(taridx);

    }

}
