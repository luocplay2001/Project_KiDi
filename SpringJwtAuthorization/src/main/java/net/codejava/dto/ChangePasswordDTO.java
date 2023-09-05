package net.codejava.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChangePasswordDTO {
    private Integer userId;
    private String  oldPassword;
    private String newPassword;
    private String confirmPassword;
}
