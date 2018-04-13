package event.server.Event.Controller;

import event.server.Event.Domain.Dto.UserDto;
import event.server.Event.Domain.Enum.RoleEnum;
import event.server.Event.Domain.User;
import event.server.Event.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user.create")
    @ResponseBody
    public ResponseEntity createUser (@RequestBody @Valid UserDto userDto, HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap<String, Object> result = new HashMap<>();
        User newUser = new User(userDto.getFirstName(), userDto.getLastName(), userDto.getLogin(), userDto.getPassword(), userDto.getEmail(), userDto.getPhone(), userDto.isActive(), RoleEnum.USER.getIndex(), new Date(), new Date());
        User createdUser = userService.create(newUser);
        result.put("user", createdUser);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
