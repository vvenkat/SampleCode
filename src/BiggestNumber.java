
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Arrays;


/*
 * Given a number, reorder the digits such that you can get the biggest number. For this,
 * have 3 methods - convertNumberToDigits, getBiggestNumber and then convertDigitsToNumber
 */
public class BiggestNumber {
    
    private static int input;
    private ArrayList<Integer> list;
    
    public static void main (String[] args){
        input = Integer.parseInt(args[0]);
        BiggestNumber biggest = new BiggestNumber();
        biggest.execute();
    }
    
    public BiggestNumber(){
        this.list = new ArrayList<Integer>();
    }
    
    public BiggestNumber(int inputValue){
        this.list = new ArrayList<Integer>();
        this.input = inputValue;
    }
    
    public int execute(){
        System.out.println("Input is " + input);
        convertNumberToDigits();    
        printAllDigits(list);
        sortDescendingOrder(list);
        int output = convertDigitsToNum(list);
        System.out.println ("Output is " + output);
        return output;
    }
    
    public int convertDigitsToNum(ArrayList<Integer> list){
        int num = 0;
        for (int digit:list){
            num = num * 10;
            num = num + digit;
        }
        return num;
        
    }

    public void sortDescendingOrder(ArrayList<Integer> list){
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("After reversing...");
        printAllDigits(list);
    }
     
     public void printAllDigits(ArrayList<Integer> list){
        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    
    public ArrayList<Integer> convertNumberToDigits(){
        LinkedList<Integer> stack = new LinkedList<Integer> ();
        while(input > 0){ 
            stack.push(input % 10);
            input = input / 10;
              }
        return getDigits(stack);
        
    }
    
    public ArrayList<Integer> getDigits(LinkedList<Integer> stack){
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
    
}
