package com.rupeshmandal.useruervice.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Contact {
    private Long contactId;
    private String email;
    private String contactName;

    private Long userId;
}
