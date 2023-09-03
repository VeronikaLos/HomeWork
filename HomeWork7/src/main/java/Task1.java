public class Task1 {

    public static void main(String[] args) {
        int a = 3;
        int b = 56;

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();

        sb.append(a).append('+').append(b).append('=').append(a+b);
        System.out.println(sb.toString());
        sb.replace(4,5," равно ");
        System.out.println(sb.toString());

        sb2.append(a).append('-').append(b).append('=').append(a-b);
        System.out.println(sb2.toString());
        sb2.replace(4,5," равно ");
        System.out.println(sb2.toString());

        sb3.append(a).append('*').append(b).append('=').append(a*b);
        System.out.println(sb3.toString());
        sb3.replace(4,5," равно ");
        System.out.println(sb3.toString());
    }
}