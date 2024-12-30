package com.telran.base.lesson10;

public class HomeworkTask {

    public static void main(String[] args) {
        String[] parameter = {"model", "V60", "country", "Germany", "city", "Berlin",
                "year", null, "active", "true"};

        StringBuilder sb = new StringBuilder("SELECT * FROM cars WHERE ");

        boolean isFirst = true;
        for (int i = 0; i < parameter.length; i+=2) {
            String key = parameter[i];
            String value = parameter[i + 1];
            if (value != null) {
                if (!isFirst) {
                    sb.append(" AND ");
                }
                sb.append(key).append("=").append("'").append(value).append("'");
                isFirst = false;
            }
        }
        sb.append(";");

        System.out.println(sb.toString());
    }
}
