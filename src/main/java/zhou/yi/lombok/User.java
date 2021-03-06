package zhou.yi.lombok;

import lombok.Builder;
import lombok.Data;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/26 10:13
 */
@Data
@Builder
public class User {
    private Integer id;
    private String name;
    private String description;

    public static void main(String[] args) {
        User user = User.builder().description("hello").id(3).build();
//        user.setId(0);
//        user.setName("zhouyi");
//        user.setDescription("hello world");
        System.out.println(user.toString());
    }
}
