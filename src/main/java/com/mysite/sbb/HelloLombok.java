package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
public class HelloLombok {

    private final String hello;
    private final int lombok;
    // final을 적용해서 @Setter는 의미가 없다.
    // RequiredArgsConstructor를 적용하면 해당 속성을 필요로하는 생성자가 롬복에 의해 자동 생성됨. (final없는 속성은 생성자에 포함 안됨)

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok("헬로", 5);
        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}
