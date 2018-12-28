public class Main {

    public static void main(String[] args) {
        String line="11222";
        System.out.println(line);

        int len=line.length();
        String nextLine="";
        int counter=1;
        for (int k=0; k<len; k++){
            if (k+1<len && line.charAt(k)==line.charAt(k+1)){
                counter++;
            } else {
                nextLine+=counter;
                nextLine+=line.charAt(k);
                counter=1;
            }
        }
        System.out.println(nextLine);
    }
}