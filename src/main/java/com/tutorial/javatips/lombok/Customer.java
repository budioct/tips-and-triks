package com.tutorial.javatips.lombok;

import lombok.*;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
@Data
@Builder
public class Customer {

    String id;
    String name;
    String email;

}
