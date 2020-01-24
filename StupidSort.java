/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;
 
import java.util.Random;
 
/**
 *
 * @author https://gist.github.com/pencil/1253001/c876af822be76a3ffc26a6fc8707f74553b3482b
 * @modified Natworpong.LS@mail.kmutt.ac.th
 */
public class StupidSort {
        static int n = 13;
           
        public void sort(Integer[] i){
            Integer counter = 0;
        System.out.println("I'll sort " + i.length + " elements...");
        while(!isSorted(i)) {
            shuffle(i);
            counter++;
        }
        System.out.println("Solution found! (shuffled " + counter + " times)");
        print(i);
        }
       
    private void print(Integer[] i) {
        for(Integer x : i) {
            System.out.print(x + ", ");
        }
        System.out.println();
    }
 
    private void shuffle(Integer[] i) {
        for(Integer x = 0; x < i.length; ++x) {
            Integer index1 = (int)(Math.random() * i.length),
                index2 = (int) (Math.random() * i.length);
            Integer a = i[index1];
            i[index1] = i[index2];
            i[index2] = a;
        }
    }
 
    private boolean isSorted(Integer[] i) {
        for(Integer x = 0; x < i.length - 1; ++x) {
            if(i[x] > i[x+1]) {
                return false;
            }
        }
        return true;
    }
       
        private static void addInteger(Integer[] iarr){
            Random r = new Random();
            for(int i=0; i < iarr.length; i++){
                iarr[i] = r.nextInt(n);
            }
        }
       
    /**
     * @param args
     */
    public static void main(String[] args) {
                Integer[] i = new Integer[n];
                addInteger(i);
//      Integer[] i = {1, 5, 2, 8, 5, 2, 4, 2, 6, 7, 66};
                double startTime = System.currentTimeMillis()/1000.0;
        StupidSort ss = new StupidSort();
                ss.sort(i);
                double endTime = System.currentTimeMillis()/1000.0;
                System.out.printf("time: %.2f",endTime - startTime);
    }
 
}
