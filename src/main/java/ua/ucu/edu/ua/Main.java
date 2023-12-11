package ua.ucu.edu.ua;

public class Main {
    public static void main(String[] args) {
        Document doc = new SmartDocument("/Users/victormuryn/Desktop/screen.png");
        String result = doc.parse();
        System.out.println(result);
    }
}