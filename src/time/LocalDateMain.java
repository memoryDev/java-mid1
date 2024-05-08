package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2023, 11, 21);
        System.out.println("오늘 날짜 : " + nowDate);
        System.out.println("지정 날짜 : " + ofDate);

        // 모든 날짜 객체는 불변클래스임 반환값 필수로 받아야함
        LocalDate plusDays = ofDate.plusDays(10);
        System.out.println("지정 날짜+10d : " + plusDays);
    }
}
