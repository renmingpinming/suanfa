package zhou.yi.lombok;

import lombok.Data;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/26 10:13
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String description;

    public static void main(String[] args) {
        User user = new User();
        user.setId(0);
        user.setName("zhouyi");
        user.setDescription("hello world");
        System.out.println(user.toString());
    }
}
