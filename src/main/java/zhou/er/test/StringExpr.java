package zhou.er.test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.math.BigDecimal;

/**
 * @Author:XiaoLang
 * @Date:2019-09-06 15:51
 * 计算字符串表达式的值
 */
public class StringExpr {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("nashorn");
        String expression = "10 * 2 + 6 / (3 - 1)";
        Object o = scriptEngine.eval(expression);
        Double d = Double.parseDouble(o.toString());
        System.out.println(d);
    }
}
