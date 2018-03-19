import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;


@Data
@NoArgsConstructor
public class UserEntity {
    private int id;
    private String username;
    private String password;
    private String firstname;
    private String surname;
    private boolean isLogin;
    //private LocalDateTime creationDate;
    private KeyEntity key;


}
