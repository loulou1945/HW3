public class Main {
    public static void main(String[] args) {

        //Задача 1
        int age = 10;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        //Задача 2
        int temperature = -10;

        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        //Задача 3
        int speed = 100;

        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        //Задача 4
        int agePerson = 27;

        if (agePerson >= 2 && agePerson <= 6) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в детский сад");
        }
        if (agePerson >= 7 && agePerson <=17) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в школу");
        }
        if (agePerson >= 18 && agePerson <=24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в унивеоситет");
        }
        if (agePerson > 24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить на работу");
        }

        //Задача 5
        int ageChild = 3;

        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        }
        else if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении");
        } else {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения");
        }

        //Задача 6
        int wagonCapacity = 102;
        int countSeats = 60;
        int countPeople = 79;

        if (countPeople < countSeats) {
            System.out.println("В вагоне есть сидячие места");
        } else if (countPeople > countSeats && countPeople < wagonCapacity) {
            System.out.println("В вагоне есть стячие места");
        } else {
            System.out.println("В вагоне нет мест, он полностью забит");
        }

        //Задача 7
        int one = 30;
        int two = 50;
        int three = 5;

        if (one >= two && one >= three) {
            System.out.println(one);
        } else if (two >= one && two >= three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }

    }
}