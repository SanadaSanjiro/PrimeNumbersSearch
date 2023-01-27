
public class PrimeNumbersSearch {
    static final int SEARCH_RANGE = 1000; //Задает диапазон поиска простых чисел

    public static void main(String[] args) {
        boolean result;
        System.out.println("Выполняется поиск простых чисел в диапазоне от 1 до "
                + SEARCH_RANGE);
        for (int i = 1; i<SEARCH_RANGE; i++)
        {
            result = true;
            for (int j = 2; j<i; j++)
            {
                if ((i%j)==0)
                {
                    result = false;
                    break;
                }
            }
            if (result)
            {
                System.out.println(i);
            }
        }
    }
}
