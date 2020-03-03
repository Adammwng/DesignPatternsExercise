package fuentBuilder;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BarChart barChart = new BarChart("Task types report", new ArrayList());
        barChart.setBackgroundColor("ss");
        BarChart barChart1 = BarChart.builder()
                .withTitle("Title1")
                .withbackgroundColor("Blue")
                .withFontColor("Black")
                .withheight(8)
                .withwidth(5)
                .build();
        System.out.println(barChart);
        System.out.println(barChart1);


    }
}
