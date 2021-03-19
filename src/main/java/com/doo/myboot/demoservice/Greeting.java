package com.doo.myboot.demoservice;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Greeting {

    private final long id;
    private final String content;
}
