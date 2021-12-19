package baiTapVeNha;


public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Bolt();
        animals[1] = new AngryBird();
        animals[2] = new Nemo();
        Machine[] machines = new Machine[2];
        machines[0] = new McQueen();
        machines[1] = new Siddeley();

        for (Animal animal : animals) {

            if (animal instanceof Bolt) {
                Runable run = (Bolt) animal;
                System.out.print("Bolt: ");
                System.out.println(run.run());
                Barkable bark = (Bolt) animal;
                System.out.print("Bolt: ");
                System.out.println(bark.bark());
            }
            if (animal instanceof AngryBird){
                Flyable fly = (AngryBird) animal;
                System.out.print("AngryBird: ");
                System.out.println(fly.fly());
            }
            if (animal instanceof Nemo){
                Swimable swim = (Nemo) animal;
                System.out.print("Nemo: ");
                System.out.println(swim.swim());
            }
        }

        for (Machine machine : machines) {

            if (machine instanceof McQueen) {
                Runable run = (McQueen) machine;
                System.out.print("McQueen: ");
                System.out.println(run.run());
            }
            if (machine instanceof Siddeley) {
                Flyable fly = (Siddeley) machine;
                System.out.print("Siddeley: ");
                System.out.println(fly.fly());
            }

        }

    }

}


