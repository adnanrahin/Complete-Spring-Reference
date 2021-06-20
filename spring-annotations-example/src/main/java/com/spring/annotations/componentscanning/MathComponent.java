package com.spring.annotations.componentscanning;

import org.springframework.stereotype.Component;

@Component
public class MathComponent {

    public int add(int x, int y) {
        return x + y;
    }

}
