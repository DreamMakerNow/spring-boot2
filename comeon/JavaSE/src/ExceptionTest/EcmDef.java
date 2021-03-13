package ExceptionTest;

// DATE: 2021/1/29-12:35  Happy Every Day


public class EcmDef {
    public static void main(String[] args) throws EcDef {
        try {
            int i=Integer.parseInt(args[0]);
            int j=Integer.parseInt(args[1]);
            int result=ecm(i,j);
            System.out.println("result = " + result);
        } catch (NumberFormatException e) {//转换异常
            System.out.println("数据类型输入不一致 转换异常");
        } catch (ArrayIndexOutOfBoundsException e){//缺少参数 空值
            System.out.println("缺少参数 空值");
        }catch (ArithmeticException e){//分母为 0
            System.out.println("分母不能为 0");
        }
        catch (EcDef ecDef) {
            //ecDef.printStackTrace();
            System.out.println(ecDef.getMessage());
        }finally {
            System.out.println("完成");
        }

    }
    public static int ecm(int i, int j) throws EcDef {
        if (i < 0 || j < 0){
            throw new EcDef("分子分母不能为负数");
        }
        return i/j;
    }
}
