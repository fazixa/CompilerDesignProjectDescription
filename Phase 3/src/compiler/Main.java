package compiler;

import compiler.gen.MiniJavaLexer;
import compiler.gen.MiniJavaListener;
import compiler.gen.MiniJavaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream stream = CharStreams.fromFileName("inputs/input5.mj");
        MiniJavaLexer lexer = new MiniJavaLexer(stream);
        TokenStream tokens = new CommonTokenStream(lexer);
        MiniJavaParser parser = new MiniJavaParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();

        // phase2
        MiniJavaListener saveSymbols = new SaveSymbols();
        walker.walk(saveSymbols, tree);

        // phase3
        MiniJavaListener findErrors = new FindErrors();
        walker.walk(findErrors, tree);
    }
}
