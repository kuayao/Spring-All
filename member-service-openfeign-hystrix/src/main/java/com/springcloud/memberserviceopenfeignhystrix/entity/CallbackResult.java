package com.springcloud.memberserviceopenfeignhystrix.entity;

/**
 * @author kuayao
 * @create 2020-05-25 11:02 上午
 */
public class CallbackResult {

        private String code;
        private String result;

    public CallbackResult() {
    }

    public CallbackResult(String code, String result) {
        this.code = code;
        this.result = result;
    }

        public String getCode() {
        return code;
    }

        public void setCode(String code) {
        this.code = code;
    }

        public String getResult() {
        return result;
    }

        public void setResult(String result) {
        this.result = result;
    }
}
