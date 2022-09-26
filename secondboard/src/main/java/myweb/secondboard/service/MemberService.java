package myweb.secondboard.service;

import lombok.RequiredArgsConstructor;
import myweb.secondboard.domain.Member;
import myweb.secondboard.dto.MemberSaveForm;
import myweb.secondboard.repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

  private final MemberRepository memberRepository;

  @Transactional
  public Long signUp(MemberSaveForm form) {
    Member member = Member.createMember(form);
    memberRepository.save(member);
    return member.getId();
  }
}
