package tacos.security;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/register")
public class RegistrationController {
    
    private UserRepository userRepo;
    private PasswordEncoder passwordEncoder;
    public RegistrationController(UserRepository userRepo, PasswordEncoder passwordEncoder) {
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping
    public String registerForm() {
        return "registration";
    }

    @PostMapping
    public String processRegistration(RegistrationForm form) {
        userRepo.save(form.toUser(passwordEncoder)));
        return "redirect:/login";
    }
}
