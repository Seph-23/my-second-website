package myweb.secondboard.dto;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MemberForm {

  private String loginId;

  private String password;

  private String nickname;

  private String email;

}
