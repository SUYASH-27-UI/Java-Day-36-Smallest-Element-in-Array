public class Main
{
    public static void main(String[] args)
    {
        int[] numbers = {25, 80, 45, 20, 60, 90};

        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] < smallest)
            {
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest element = " + smallest);
    }
}
