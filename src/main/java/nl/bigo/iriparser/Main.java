package nl.bigo.iriparser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * A small demo class that demonstrates how to use the
 * generated parser classes.
 */
public class Main {

  public static void main(String[] args) throws Exception {

    if(args.length == 0) {
      System.err.println("Usage: java -jar iri-parser-0.1.0.jar \"input to parse\"");
      System.exit(1);
    }
    
    // Create the lexer and parser.
    IRILexer lexer = new IRILexer(new ANTLRInputStream(args[0]));
    IRIParser parser = new IRIParser(new CommonTokenStream(lexer));

    // Use the demo listener which will print some info about the input.
    ParseTreeWalker walker = new ParseTreeWalker();
    ParseTree tree = parser.parse();
    walker.walk(new DemoListener(), tree);
  }
}
