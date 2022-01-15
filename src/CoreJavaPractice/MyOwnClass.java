package CoreJavaPractice;

public class MyOwnClass {
    public static void main(String[] args) {
        TreeMode treeMode = new TreeMode(2);
        System.out.println(treeMode);
    }

}
class TreeMode {
    int num;
    String left;
    String right;

    public TreeMode(int num, String left, String right) {
        this.num = num;
        this.left = left;
        this.right = right;
    }

    public TreeMode(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "TreeMode{" +
                "num=" + num +
                ", left='" + left + '\'' +
                ", right='" + right + '\'' +
                '}';
    }
}