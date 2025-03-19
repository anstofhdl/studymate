package org.codenova.studymate.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Avatar {
    private int id;
    private String name;
    private String imageUrl;
}
