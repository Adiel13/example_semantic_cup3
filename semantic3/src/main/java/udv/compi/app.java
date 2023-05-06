package udv.compi;

import java.io.StringReader;

/**
 * Hello world!
 *
 */
public class app 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World Semantic 3!" );
        String entrada = "1,3,5,7,2,1,3,5,7,9,2";
        Scanner lex = new Scanner(new StringReader(entrada));
        Parser sintax = new Parser(lex);
        
        sintax.parse();
        
    }
}
