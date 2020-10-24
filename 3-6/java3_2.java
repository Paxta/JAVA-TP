public class java3_2 {
    public static int findZip(String str) {
        char arr[] = str.toCharArray();
        int sum = 0;
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] == 'z' && arr[i + 1] == 'i' && arr[i + 2] == 'p') {
                sum += 1;
                if (sum == 2) {
                    index = i + 1;
                    break;
                } else
                    i = i + 2;
            }
        }
        if (sum > 1)
            return index;
        else
            return -1;
        // return str.indexOf("zip", str.indexOf("zip") + 1); // ЛeГкий способ
    }

    public static void main(String[] args) {
        System.out.println(findZip("zip asd adzip zooadpzip"));
    }
}