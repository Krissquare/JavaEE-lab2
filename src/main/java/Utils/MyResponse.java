package Utils;

import java.util.HashMap;
import java.util.Map;

public class MyResponse {
    public static Object OK(Object data){
        Map<String, Object> obj = new HashMap<String, Object>();
        obj.put("errno", 0);
        obj.put("errmsg", "成功");
        obj.put("data",data);
        return obj;
    }
}
