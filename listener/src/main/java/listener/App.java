package listener;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class App 
{
    public static void main ( String[] args ) throws Exception
    {
        
        System.out.println( "Bienvenido al compilador" );
        CharStream input = CharStreams.fromFileName("input/programa.txt");
        listenerLexer lexer = new listenerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        listenerParser parser = new listenerParser(tokens);
        miListener listener = new miListener(parser);
        miErrorListener miEListener = new miErrorListener(listener.getErrores());
        lexer.addErrorListener(miEListener);
        parser.addErrorListener(miEListener);
        parser.addParseListener(listener);
        parser.si();
    }
}
