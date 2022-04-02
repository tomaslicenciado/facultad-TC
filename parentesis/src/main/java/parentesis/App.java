package parentesis;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class App {
    public static void main(String[] args) throws Exception{
        System.out.println("Bienvenido");
        CharStream input = CharStreams.fromFileName("input/parentesis.txt");
        parentesisLexer lexer = new parentesisLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parentesisParser parser = new parentesisParser(tokens);
        parser.si();
    }
}