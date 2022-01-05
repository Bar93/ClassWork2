import java.util.Scanner;

public class TestElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index=0;
        char letter;
        int amount;
        System.out.println("enter a size of array 1");
        Element [] arr1 = new Element[scanner.nextInt()];
        while (index<arr1.length){
            System.out.println("enter a letter");
            letter = scanner.next().charAt(0);
            System.out.println("enter a amount");
            amount = scanner.nextInt();
            Element element = new Element(letter,amount);
            arr1[index] = element;
            index++;
        }
        index=0;
        System.out.println("enter a size of array 2");
        Element [] arr2 = new Element[scanner.nextInt()];
        while (index<arr2.length){
            System.out.println("enter a letter");
            letter = scanner.next().charAt(0);
            System.out.println("enter a amount");
            amount = scanner.nextInt();
            Element element = new Element(letter,amount);
            arr2[index] = element;
            index++;
        }
        Element [] newElement = arangeArr(arr1,arr2);
        for (int i=0;i<newElement.length;i++){
            System.out.println(newElement[i].toString());
        }
    }

    public static Element[] arangeArr (Element[] arr1, Element[] arr2){
        Element [] tempArr = new Element[arr1.length+arr2.length];
        int counter=0;
        int index1 = 0, index2=0;
        Element tempElements;
            while (index1<arr1.length){
                tempElements = arr1[index1];
                tempArr[index1] = tempElements;
                index1++;
            }
            while (index2<arr2.length){
                tempElements = arr2[index2];
                tempArr[index1] = tempElements;
                index1++;
                index2++;
            }
        index1=0;
        index2=0;
        while (index1< tempArr.length){
            while (index2< tempArr.length){
                if (tempArr[index1].getLetter()== tempArr[index2].getLetter()&&index1!=index2){
                    tempArr[index1].setAmount(tempArr[index1].getAmount()+ tempArr[index2].getAmount());
                    tempArr[index2].setAmount(0);
                    tempArr[index2].setLetter('*');
                    counter++;
                    break;
                }
                index2++;
            }
            index1++;
            index2=0;
        }
        index1=0;
        Element [] returnArr = new Element[tempArr.length-counter];
        for (int i=0;i<tempArr.length;i++){
            if (tempArr[i].getLetter()!='*'){
                tempElements = tempArr[i];
                returnArr[index1] = tempElements;
                index1++;
            }
        }
        return returnArr;
        }

}
