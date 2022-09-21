package myweb.secondboard.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MemberSaveForm {

  @NotNull @Size(min = 8, max = 15, message = "아이디는 8 ~ 15자 이내여야 합니다.")
  private String loginId;

  @NotNull @Size(min = 9, max = 24, message = "비밀번호는 9 ~ 24자 이내여야 합니다.")
  private String password;

  @NotNull @Size(min = 4, max = 10, message = "닉네임은 4 ~ 10자 이내여야 합니다.")
  private String nickname;

  @NotNull @Email
  private String email;

}
