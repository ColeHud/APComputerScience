

public class TestASCII
{
    public static void main(String[] args)
    {
        long table[] = {83, 101, 110, 100, 32, 121, 111, 117, 114, 32, 116, 101, 97, 99, 104, 101, 114, 32, 97, 110, 32, 101, 109, 97, 105, 108, 32, 116, 111, 100, 97, 121};
        for(int i = 0; i < table.length ;i++){
            System.out.print((char)table[i]);
        }
        
    }
}