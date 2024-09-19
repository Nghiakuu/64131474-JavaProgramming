package QLTINTUC;
import java.util.ArrayList;
import java.util.Scanner;
public class Apps {

    public static void main(String[] args) {
        System.out.println("1.Insert news");
        System.out.println("2.View list news");
        System.out.println("3.Average rate");
        System.out.println("4.Exit");
        Scanner sc = new Scanner(System.in);
        ArrayList<News> ManageNews = new ArrayList<News>();
        while (true) {
            System.out.print("Choose: ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    System.out.println("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Title: ");
                    String title = sc.nextLine();
                    System.out.println("Publish Date: ");
                    String publishDate = sc.nextLine();
                    System.out.println("Author: ");
                    String author = sc.nextLine();
                    System.out.println("Content: ");
                    String content = sc.nextLine();
                    News news = new News(id, title, publishDate, author, content);
                    System.out.println("Rate 1: ");
                    int rate1 = sc.nextInt();
                    sc.nextLine();
                    news.RateList[0] = rate1;
                    System.out.println("Rate 2: ");
                    int rate2 = sc.nextInt();
                    sc.nextLine();
                    news.RateList[1] = rate2;
                    System.out.println("Rate 3: ");
                    int rate3 = sc.nextInt();
                    sc.nextLine();
                    news.RateList[2] = rate3;
                    ManageNews.add(news);
                    break;
                case 2:
                   for (News i : ManageNews) {
                        i.Display();
                    }
                    break;
                case 3:
                for (News i : ManageNews) {
                    i.Calculate();
                    i.Display();
                }
                    break;
                case 4:
                    sc.close();
                    System.out.println("Exit.");
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
            
        }
    }
}
