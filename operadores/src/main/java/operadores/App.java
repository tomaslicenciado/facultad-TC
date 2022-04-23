package operadores;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al compilador");
        CharStream input = CharStreams.fromFileName("input/operadores.txt");
        operadoresLexer lexer = new operadoresLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        operadoresParser parser = new operadoresParser(tokens);
        parser.si();
    }
}