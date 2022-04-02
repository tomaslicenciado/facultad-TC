package fechas;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class App {
    public static void main(String[] args) throws Exception{
        //Mensaje de bienvenida
        System.out.println("Bienvenido");

        //Crear un CharStream que lea desde un archivo
        CharStream input = CharStreams.fromFileName("input/fechasYHoras.txt");

        //Crear un lexer que se alimenta del input creado
        fechasLexer lexer = new fechasLexer(input);

        //Crear un buffer de tokens obtenidos del lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //Crear un parser que se alimenta de los tokens
        fechasParser parser = new fechasParser(tokens);

        //Solicito al parser que comience con una regla gramatical
        parser.s();
    }
}