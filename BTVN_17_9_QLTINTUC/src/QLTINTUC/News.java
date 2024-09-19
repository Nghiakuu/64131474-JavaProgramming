package QLTINTUC;

public class News implements INews {
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    public News(int id, String title, String publishDate, String author, String content) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
    }
    public void setid(int id) {
        this.id = id;
    }
    public int getid() {
        return id;
    }
    public void settitle(String title) {
        this.title = title;
    }
    public String gettitle() {
        return title;
    }
    public void setpublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
    public String getpublishDate() {
        return publishDate;
    }
    public void setauthor(String author) {
        this.author = author;
    }
    public String getauthor() {
        return author;
    }
    public void setcontent(String content) {
        this.content = content;
    }
    public String getcontent() {
        return content;
    }
    public void setaverageRate(float averageRate) {
        this.averageRate = averageRate;
    }
    public float getaverageRate() {
        return averageRate;
    }
    
    @Override
    public void Display() {
        System.out.println("Title: " + title);
        System.out.println("Publish Date: " + publishDate);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
        System.out.println("Average Rate: " + averageRate);
        System.out.println("--------------------");
    }

    public int[] RateList = new int[3];
    public void Calculate() {
        int sum = 0;
        for (int rate : RateList) {
            sum += rate;
        }
        this.averageRate = sum / (float) RateList.length;
    }

}
