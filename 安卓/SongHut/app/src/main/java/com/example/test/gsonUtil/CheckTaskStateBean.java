package com.example.test.gsonUtil;

/**
 * created by 李军邑
 */
public class CheckTaskStateBean {
    /**
     * errorCode : 0000
     * token : RmFuZ0t1blRlYW0=.Z2VuZXJhdGVUaW1lOjE1NjQzNjM3MjQ5MDY7.N2IyMzIzZDMxZDhlMzU0OWRlOWEzZjBjNzZiMGMwNTg=
     * data : {"filePath":"E:/data/2/2/result.mid"}
     */

    private String errorCode;
    private String token;
    private DataBean data;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * filePath : E:/data/2/2/result.mid
         */

        private String filePath;

        public String getFilePath() {
            return filePath;
        }

        public void setFilePath(String filePath) {
            this.filePath = filePath;
        }
    }
}
