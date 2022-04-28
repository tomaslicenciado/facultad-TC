package simbolos;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class App{
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido");
        CharStream input = CharStreams.fromFileName("input/simbolos.txt");
        simbolosLexer lexer = new simbolosLexer (input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        simbolosParser parser = new simbolosParser(tokens);
        parser.si();
    }
}
