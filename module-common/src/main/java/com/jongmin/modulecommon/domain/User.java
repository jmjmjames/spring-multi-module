package com.jongmin.modulecommon.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "users")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private User(String name) {
        this.name = name;
    }

    public static User of(String name) {
        return new User(name);
    }

}
