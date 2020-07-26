/**
 * Author:   17976
 * Date:     2020/7/14 23:34
 * Description:
 */
public class First {
    private String name = "I am the first class";
    public String printFirst(String name){
        if (name!=null){
            this.name = name;
        }
        System.out.println(name);
        return this.name;
    }
}
