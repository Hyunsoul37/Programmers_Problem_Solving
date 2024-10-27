package level2;

public class Problem_42746
{
    public String solution(int[] numbers)
    {
        StringBuilder answer = new StringBuilder();
        int arrayLength = numbers.length - 1;

        // 퀵 정렬을 이용해 가장 큰 수로 정렬
        quickSort(numbers, 0, arrayLength);

        // {0, 0} 일경우 '00'이 아닌 0으로 리턴 예외 처리
        if (numbers[0] == 0)
        {
            return "0";
        }

        for (int i = 0; i < arrayLength + 1; i++)
        {
            answer.append(numbers[i]);
        }

        return answer.toString();
    }

    private void quickSort(int[] arr, int start, int end)
    {
        int part2 = partition(arr, start, end);

        if (start < part2 - 1)
        {
            quickSort(arr, start, part2 - 1);
        }

        if (part2 < end)
        {
            quickSort(arr, part2, end);
        }
    }

    // 정렬 로직
    private int partition(int[] arr, int start, int end)
    {
        int m = (start + end) / 2;
        int pivot = arr[m];

        // 두 수를 앞 뒤로 붙혔을 경우 큰 수가 앞으로 갈 수 있도록 함 / String 비교
        while (start <= end)
        {
            String strString = String.valueOf(arr[start]);
            String endString = String.valueOf(arr[end]);
            String pivString = String.valueOf(pivot);

            while ((strString + pivString).compareTo(pivString + strString) > 0)
            {
                start++;
                strString = String.valueOf(arr[start]);
            }

            while ((endString + pivString).compareTo(pivString + endString) < 0)
            {
                end--;
                endString = String.valueOf(arr[end]);
            }

            if (start <= end)
            {
                swap(arr, start, end);
                start++;
                end--;
            }
        }

        return start;
    }

    private void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args)
    {
        Problem_42746 p = new Problem_42746();
        int[] arr1 = new int[] { 3, 30, 34, 5, 9 };
        int[] arr2 = new int[] { 0, 0, 0, 0 };

        System.out.println(p.solution(arr1));
        // p.quickSort(arr1, 0, arr1.length -1);

        // for (int a : arr1)
        // {
        //     System.out.println(a);
        // }
    }
}
