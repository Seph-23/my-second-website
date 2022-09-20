package myweb.secondboard.domain;

import static javax.persistence.FetchType.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Getter @Setter
public class Board {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "board_id")
  private Long id;

  @NotNull @Size(min = 1, max = 30, message = "제목은 1 ~ 30 자 이내여야 합니다.")
  @Column(length = 31)
  private String title;

  @NotNull @Size(min = 1, max = 144, message = "내용은 1 ~ 144 자 이내여야 합니다.")
  @Column(length = 145)
  private String content;

  @NotNull @Column(length = 11)
  private String author;   //member nickname

  @Column(columnDefinition = "integer default 0")
  private int views;

  @CreatedDate @Column(length = 40)
  private String createdDate;
  @LastModifiedDate @Column(length = 40)
  private String modifiedDate;

  @ManyToOne(fetch = LAZY)
  @JoinColumn(name = "member_id")
  private Member member;

}
