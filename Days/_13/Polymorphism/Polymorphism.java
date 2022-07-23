package _13.Polymorphism;

import java.lang.reflect.MalformedParameterizedTypeException;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot(){
        return "no plot here";
    }

}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "A shark eats lot of people";

    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence day");
    }

    @Override
    public String plot(){
        return "Alines jkldjl  jkdjal";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");

    }
    @Override
    public String plot(){
        return "kics try and escape";
    }
}

class Forgetable extends Movie{
    public Forgetable(){
        super("Forgetable");
    }

    // no plot
}

public class Polymorphism {
    public static void main(String[] args) {
        for(int i=1;i<11;i++){

            Movie movie = randomMovie();
            System.out.println("movie #"+1+": "+movie.getName() +"\n"+"Plot"+movie.plot());
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random()*5);
        System.out.println("random no is:"+randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new Forgetable();


        }

        return null;
    }
}


