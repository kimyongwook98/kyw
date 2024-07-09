package ch12._22order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.text.NumberFormat;

public class Order {
    private static int orderCount = 0;
    private static List<Order> orders = new ArrayList<>();
    private int orderNumber;
    private List<Menu> menuList;
    private String orderTime;

    public Order(List<Menu> menuList) {
        this.orderNumber = ++orderCount;
        this.menuList = menuList;
        this.orderTime = getCurrentTime();
        orders.add(this);
    }

    private String getCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        return sdf.format(new Date());
    }

    public void printOrder() {
        System.out.println("==주문서==");
        System.out.println("*주문번호 : " + orderNumber);

        int totalPrice = 0;
        for (int i = 0; i < menuList.size(); i++) {
            Menu menu = menuList.get(i);
            System.out.printf("\t%d. ", i + 1);
            menu.printInfo();
            totalPrice += menu.getPrice();
        }

        System.out.println("*주문 메뉴수 : " + menuList.size());
        System.out.println("*주문액 : " + formatCurrency(totalPrice) + "(원)");
        System.out.println("*주문시간: " + orderTime + "\n");
    }

    public int getTotalPrice() {
        int total = 0;
        for (Menu menu : menuList) {
            total += menu.getPrice();
        }
        return total;
    }

    public int getTotalMenuCount() {
        return menuList.size();
    }

    public static void printSummary() {
        System.out.println("==정산==");
        System.out.println("총 주문 건수 : " + orders.size());

        int totalSales = 0;
        int totalMenuCount = 0;
        for (Order order : orders) {
            totalSales += order.getTotalPrice();
            totalMenuCount += order.getTotalMenuCount();
        }

        System.out.println("총 주문 메뉴 수 : " + totalMenuCount);
        System.out.println("총 매출: " + formatCurrency(totalSales) + "원");
    }

    private static String formatCurrency(int amount) {
        return NumberFormat.getNumberInstance().format(amount);
    }
}
