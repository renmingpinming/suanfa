package zhou.yi.fastjson;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/4/30 14:11
 */
@Data
public class Model {
    private Integer compprodId;
    private Integer proditemId;
    private Integer num;
    List<Integer> list;
    List<String> list2;
    List<Model> models;
//    private Date gmt_create;
//    private Date gmt_modify;
}
