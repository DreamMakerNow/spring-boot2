package ExceptionTest;

// DATE: 2021/1/29-12:39  Happy Every Day


public class EcDef extends Exception{
    static final long serialVersionUID = -33875169929948L;

    public EcDef() {}
    public EcDef(String msg) {
        super(msg);
    }
}
