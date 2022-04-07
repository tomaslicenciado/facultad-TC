package programa;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al compilador");
        CharStream input = CharStreams.fromFileName("input/programa.txt");
        programaLexer lexer = new programaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        programaParser parser = new programaParser(tokens);
        parser.prog();
    }
}