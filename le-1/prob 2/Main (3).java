/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class Mother {
    public void show() {
        System.out.println("Hello World");
    }
}
class Child extends Mother {
    @Override
    public void show() {
        System.out.println("Hello JUET");
    }
}
public class Main {
    public static void main(String[] args) {
        Mother mother = new Mother();
        Child child = new Child();
        mother.show(); 
        child.show();   
    }
}
