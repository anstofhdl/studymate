package org.codenova.studymate.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
public class LoginLog {
    private int id;
    private String userId;
    private LocalDateTime loginAt;
}
