interface Printable {
void print();
}

interface Showable {
    void show();
}

class Documents implements Printable, Showable {
    @Override
    public void print() {   // must match interface method name
        System.out.println("Printing the document...");
    }

    @Override
    public void show() {    // must match interface method name
        System.out.println("Showing the document...");
    }
}

public class PrintableShowable {
    public static void main(String[] args) {
        Documents d = new Documents();
        d.print();   // call correct method
        d.show();    // call correct method
    }
}

