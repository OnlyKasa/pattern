package com.socket.demo.model;

import lombok.Data;

@Data
public class BuilderExample {
    private String item1;
    private String item2;


    @SuppressWarnings("unused")
    private BuilderExample(){}

    private BuilderExample(String item1, String item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public static ClazzBuilder newBuilder() {
        return new ClazzBuilder();
    }

    public static class ClazzBuilder {

        private String item1;
        private String item2;

        private ClazzBuilder(){}

        public ClazzBuilder setItem1(String item1) {
            this.item1 = item1;
            return this;
        }

        public ClazzBuilder setItem2(String item2) {
            this.item2 = item2;
            return this;
        }

        public BuilderExample builder() {
            return new BuilderExample(item1, item2);
        }

    }
}
