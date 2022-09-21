package myweb.secondboard.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Member {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "member_id")
  private Long id;

  @NotNull @Column(unique = true, length = 16)
  private String loginId;

  @NotNull @Column(unique = true, length = 25)
  private String password;

  @NotNull @Column(length = 11)
  private String nickname;

  @NotNull @Column(unique = true, length = 50)
  private String email;

}
