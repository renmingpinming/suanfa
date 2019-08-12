package zhou.yi.poi;

import com.alibaba.excel.read.context.AnalysisContext;
import com.alibaba.excel.read.event.AnalysisEventListener;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/8 9:20
 */
@Data
public class ExcelListener extends AnalysisEventListener {
    private List<EasyModel> datas = new ArrayList<>();

    @Override
    public void invoke(Object object, AnalysisContext context) {
        datas.add((EasyModel) object);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
