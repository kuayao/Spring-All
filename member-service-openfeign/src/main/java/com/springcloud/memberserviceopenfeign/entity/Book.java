package com.springcloud.memberserviceopenfeign.entity;

/**
 * @author kuayao
 * @create 2020-05-24 6:19 下午
 */
public class Book {

        private  String sn;
        private  String name;
        private  String desc;

        public String getSn() {
        return sn;
    }

        public void setSn(String sn) {
        this.sn = sn;
    }

        public String getName() {
        return name;
    }

        public void setName(String name) {
        this.name = name;
    }

        public String getDesc() {
        return desc;
    }

        public void setDesc(String desc) {
        this.desc = desc;
    }

}
