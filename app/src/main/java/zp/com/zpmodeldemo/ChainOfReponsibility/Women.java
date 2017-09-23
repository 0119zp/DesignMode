package zp.com.zpmodeldemo.ChainOfReponsibility;

/**
 * 女士具体实现
 */

public class Women extends IWomen{

    // 类型 1-未出嫁 2-出嫁 3-丧夫
    private int type = 0;
    // 请求内容
    private String request = "";

    public Women(int type,String request){
        this.type = type;

        switch (type){
            case 1:
                this.request = "女儿的请求是：" + request;
                break;
            case 2:
                this.request = "妻子的请求是：" + request;
                break;
            case 3:
                this.request = "母亲的请求是：" + request;
                break;
        }

    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
