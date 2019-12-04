package com.example.demo.domain.basic;

public class Response<T> {
    private static final String OK ="ok";
    private static final String ERROR = "error";

    private Meta meta;//元数据
    private Object data;//响应内容

    public Response<T> success() {
        this.meta = new Meta(true, OK);
        return this;
    }

    public Response<T> success(T data) {
        this.meta = new Meta(true, OK);
        this.data = data;
        return this;
    }

    public Response<T> failure() {
        this.meta = new Meta(false, ERROR);
        return this;
    }

    public Response<T> failure(String message) {
        this.meta = new Meta(false, message);
        return this;
    }

    public Meta getMeta() {
        return meta;
    }

    public Object getData() {
        return data;
    }
    /*请求元数据*/
    class Meta {
        private boolean success;
        private String message;
        public boolean isSuccess() {
            return success;
        }
        public void setSuccess(boolean success) {
            this.success = success;
        }
        public String getMessage() {
            return message;
        }
        public void setMessage(String message) {
            this.message = message;
        }
        @Override
        public String toString() {
            return "Meta [success=" + success + ", message=" + message + "]";
        }
        public Meta(boolean success, String message) {
            super();
            this.success = success;
            this.message = message;
        }
        public Meta() {
            super();
        }

    }
    @Override
    public String toString() {
        return "Response [meta=" + meta + ", data=" + data + "]";
    }

}
