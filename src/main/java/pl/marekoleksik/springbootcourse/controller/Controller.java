package pl.marekoleksik.springbootcourse.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.marekoleksik.springbootcourse.model.UserDTO;

@RestController
@RequestMapping(value = "/")
public class Controller {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        UserDTO userDTO = new UserDTO();
        userDTO.setFirstName("Michał");

        return "Hello End User";
    }

}
