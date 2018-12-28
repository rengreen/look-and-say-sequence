public class Main {

    public static void main(String[] args) {
        int n=10;
        String line="11222";
        System.out.println(line);

        for (int i=0; i<n; i++){
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
            line=nextLine;
        }
    }
}