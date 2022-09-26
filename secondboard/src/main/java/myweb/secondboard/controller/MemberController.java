package myweb.secondboard.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import myweb.secondboard.dto.MemberSaveForm;
import myweb.secondboard.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Slf4j
@Controller
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

  private final MemberService memberService;

  @GetMapping("/new")
  public String signUpPage(Model model) {
    model.addAttribute("member", new MemberSaveForm());
    return "/members/signUpPage";
  }

  @PostMapping("/new")
  public String signUp(@Validated @ModelAttribute("member") MemberSaveForm form,
    BindingResult bindingResult) {

    if (bindingResult.hasErrors()) {
      log.info("errors = {}", bindingResult);
      return "/members/signUpPage";
    }

    //SignUp Success Logic
    memberService.signUp(form);

    return "redirect:/";
  }
}
