/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    
    String name;
    int age;
     
    void setName(String name){
        this.name=name;
    } 
    
    void setAge(int age){
        this.age=age;
    } 
    
    String getName(){
        return this.name;
    } 
    
    int getAge(){
        return this.age;
    } 
	public static void main(String[] args) {
	    Main m1 = new Main();
	    m1.setName("Narendra");
	    m1.setAge(21);
		System.out.println(  m1.getName() +" "+m1.getAge());
	}
}
