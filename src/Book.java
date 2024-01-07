public class Book {
    private String title;
    private int printed_year;
    private int num_of_pages;

    public Book(){

    }

    public Book(String new_title, int printed_year, int num_of_pages){
        title=new_title;
        this.printed_year=printed_year;
        this.num_of_pages=num_of_pages;
    }

    public Book(String new_title, int num_of_pages){
        title=new_title;
        this.printed_year=2023;
        this.num_of_pages=num_of_pages;
    }


    public String get_info(){
        return "Title: "+ title + "\nPrinted year: "+ printed_year + "\nNumber of pages: "+ num_of_pages;
    }
}

