/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuetest;

/**
 *
 * @author yonathan
 */
public class QueueTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee janeJones = new Employee("Michel", "Christoper", 123);
        Employee johnDoe = new Employee("Didhan", "Aditya", 4567);
        Employee marySmith = new Employee("David", "Bayu", 22);
        Employee mikeWilson = new Employee("Syahrul", "Hidayat", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);
        
        System.out.println("Add to Queue \n");
        queue.printQueue();

        queue.remove();
        queue.remove();
        System.out.println("Remove 2 Data from Queue \n");
        queue.printQueue();

        System.out.println("Peek Data From Queue \n");
        System.out.println(queue.peek());
        queue.remove();
        queue.remove();
        queue.remove();
        //queue.remove();

        queue.add(mikeWilson);

        System.out.println("Print Queue \n");
        queue.printQueue();
    }
    
}
