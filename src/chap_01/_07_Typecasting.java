package chap_01;

import java.sql.SQLOutput;

public class _07_Typecasting {
    public static void main(String[] args) {



        int score = 93;
        System.out.println(score);
        System.out.println((float)score);
        System.out.println((double) score);

        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f);
        System.out.println((int)score_d);

        score = 93 + (int)98.8;
        System.out.println(score);
        score_d = 93 + 98.8;
        System.out.println(score_d);





    }
}
