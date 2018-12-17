package pl.coderslab;


import com.google.common.base.Joiner;

import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) {

        testJoiner();

    }

    public static void testJoiner() {
        System.out.println(Joiner.on(",")
                .skipNulls()
                .join(Arrays.asList(1,2,3,4,5,null,6)));
    }
}
