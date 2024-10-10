import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int n = 9;
        int[] arr = {3, 1, 2, 4, 1, 5, 2, 6, 4};
        mergeSort(arr, 0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = low, j = mid+1;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }
        }
        while (i <= mid) {
            temp.add(arr[i]);
            i++;
        }
        while (j <= high) {
            temp.add(arr[j]);
            j++;
        }
        for (int k = low; k <= high; k++) {
            arr[k] = temp.get(k - low);
        }
    }
}
