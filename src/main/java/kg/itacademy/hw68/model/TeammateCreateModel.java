package kg.itacademy.hw68.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeammateCreateModel {
    private String fullName;
    private Integer age;
    private Boolean isActive;
    private Long teamId;
}
