package myweb.secondboard.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Member {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "member_id")
  private Long id;

  @NotNull @Size(min = 8, max = 15, message = "아이디는 8 ~ 15자 이내여야 합니다.")
  @Column(unique = true, length = 16)
  private String loginId;

  @NotNull @Size(min = 9, max = 24, message = "비밀번호는 9 ~ 24자 이내여야 합니다.")
  @Column(unique = true, length = 25)
  private String password;

  @NotNull @Size(min = 4, max = 10, message = "닉네임은 4 ~ 10자 이내여야 합니다.")
  @Column(length = 11)
  private String nickname;

  @NotNull @Email
  @Column(unique = true, length = 50)
  private String email;

}
