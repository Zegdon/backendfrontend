package hu.me.iit.malus.thesis.course.controller.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@NoArgsConstructor
@Getter @Setter
@ToString
public class CourseModificationDto {
    @Min(1)
    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String description;
}
