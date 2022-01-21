public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String binaryString="00000010100101000001111010011100";
        int decimal=Integer.parseInt(binaryString,2);
        
        System.out.println(solution.hammingWeight(decimal));
    }
}
