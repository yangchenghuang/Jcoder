package cn.com.infcn.api.test;

import com.alibaba.fastjson.JSONObject;
import org.nlpcn.jcoder.run.annotation.Execute;
import org.nlpcn.jcoder.run.annotation.Schedule;

@Schedule("while")
public class TestEtlApi {

	@Execute

	public void test(JSONObject doc) {
		doc.put("aaa", "ccc");
		doc.remove("bbb");

	}

}
