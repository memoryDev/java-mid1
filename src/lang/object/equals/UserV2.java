package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        UserV2 user = user = (UserV2)obj;
//        return id.equals(user.id);
//    }


    // IDE 자동생성 해줌 외우기X
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }
}
