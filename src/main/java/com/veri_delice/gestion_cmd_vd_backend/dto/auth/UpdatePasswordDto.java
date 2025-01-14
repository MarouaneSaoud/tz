package com.veri_delice.gestion_cmd_vd_backend.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePasswordDto {
    private String email;
    private String currentPassword;
    private String newPassword;
}