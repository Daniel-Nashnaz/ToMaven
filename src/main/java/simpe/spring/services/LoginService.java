package simpe.spring.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simpe.spring.models.Login;
import simpe.spring.models.User;
import simpe.spring.repository.LoginRepository;
import simpe.spring.repository.UserRepository;

@Service
public class LoginService {

    @Autowired
    private LoginRepository userRepository;

    public List<Login> getAll() {
        return this.userRepository.findAll();
    }

    public Optional<Login> getById(Long id) {
        return this.userRepository.findById(id);
    }

//    public void save(String fistName, String lastName) {
//        this.userRepository.save(new User(fistName, lastName));
//    }
}
