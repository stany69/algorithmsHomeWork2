public class algorithmHomeWork2 {

    public static void main(String[] args) {

        int array [] = {2,7,8,11,16,22,33};
        int sum = sumOfElements(array,array.length);
        System.out.println(sum);

        int secondArray [] = {3,9,10,88,14,18,77};
        int index = secondArray.length;
        System.out.println(maxElement(secondArray,index));

    }


    private static int sumOfElements (int array[],int i)
    {
        if (i <= 0) {
            return 0;
        }
        return sumOfElements(array,i-1)+array[i-1];
    }


    private static int maxElement (int secondArray[] ,int index)
    {
        if(index > 0){
            return Math.max(secondArray[index-1],maxElement(secondArray,index-1));
        }
        else {
            return secondArray[0];
        }
    }
}
