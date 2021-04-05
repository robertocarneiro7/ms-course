package com.robertocarneiro.hroauth.entities;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "roleName")
public class Role {

    private Long id;
    private String roleName;
}
