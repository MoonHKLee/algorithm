package NumK;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        quickSort(arr, 0, arr.length - 1);
        System.out.println(arr[K-1]);
    }

    public static void quickSort(int[] arr, int start, int end) {
        int res = partition(arr, start, end);

        if(start < res - 1) {
            quickSort(arr, start, res - 1);
        }

        if(end > res) {
            quickSort(arr, res, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start+end)/2];
        while(start<=end) {
            while (arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;
            if(start<=end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end --;
            }
        }
        return start;
    }
}