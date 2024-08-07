public interface FuncInterface {
    void abractFun(int x);

    default void normalFun()
    {
        System.out.println("Hello normalFun");
    }
}
