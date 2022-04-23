package tp1;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Bienvenido al compilador" );
        CharStream input = CharStreams.fromFileName("input/tp1.txt");
        tp1Lexer lexer = new tp1Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tp1Parser parser = new tp1Parser(tokens);
        parser.si();
    }
}
