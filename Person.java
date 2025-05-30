//Only saw it fit to import one interface in this application

import java.util.ArrayDeque;


public class Person {

    public static void main(String[] args)
    //Both ArrayDeque classes are created. One for the line and the other for Tickets. ArrayDeque is also a Queue interface
    {
        ArrayDeque<Integer> TicketNumber = new ArrayDeque<>();
        ArrayDeque<String> Person = new ArrayDeque<>();

        //My line
        Person.add("John");
        Person.add("James");
        Person.add("Nathaniel");
        Person.add("Francis");
        Person.add("Mariah");
        Person.add("Kiana");
        Person.add("Luis");

        System.out.println("Line: " + Person);
        System.out.println(); // Added spacing for legibility

        //Array created for ticketing.
        TicketNumber.add(1);
        TicketNumber.add(2);
        TicketNumber.add(3);
        TicketNumber.add(4);
        TicketNumber.add(5);
        TicketNumber.add(6);
        TicketNumber.add(7);

        System.out.println("Ticket numbers: " + TicketNumber);
        System.out.println();

        //people are dequeued from the line.
        String FirstPersonRemoved = Person.removeFirst();
        String SecondPersonRemoved = Person.remove();
        String LastPersonRemoved = Person.removeLast();

        //Using print statements we assign dequeued members of the lines ticket numbers and display the updated line in the last statement.
        System.out.println("John Ticket number 1 removed: " );
        System.out.println("James Ticket number 2 removed: " );
        System.out.println("Luis Ticket number 7 removed: " + Person);


    }

}
