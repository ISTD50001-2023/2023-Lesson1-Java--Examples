package Example2;

public class Duck {

    private String name;

    Duck(String name){
        this.name = name;
    }

    void quack(){
        System.out.println("I say quack!!");
    }

    /******************
     * Imagine now that requirements change and you have to change how Duck objects quack().
     * How would you do it?
     * A. Go into the codebase and rewrite quack()
     * B. Go into the codebase and write a new method quack_new() (i.e. leave quack() alone)
     * C. Go into the codebase and make quack() abstract (i.e. now Duck becomes abstract class)
     * D. Write a new class that inherits from Duck and override quack()
     * E. None of these are good solutions
     */
}
