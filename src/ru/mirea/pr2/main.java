package ru.mirea.pr2;

public class main
{
    public static void main(String[] args)
    {
        Author d1 = new Author("Leo", "yowu@gmail.com", 'M');
        Author d2 = new Author("Irina", "ndt@gmail.com", 'F');

        d1.Info();
        d2.Info();

        Ball b1 = new Ball(40, 30);
        System.out.println(b1);
        b1.move(35, 65);
        System.out.println(b1);
    }
}
