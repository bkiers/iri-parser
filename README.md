# IRI-parser

An IRI ANTLR 4 grammar and parser.

The grammar can be found in 
[`src/main/antlr4/nl/bigo/iriparser`](https://github.com/bkiers/iri-parser/tree/master/src/main/antlr4/nl/bigo/iriparser).

Seeing the generated parser in action can be done by building
a *fat* JAR of the project and then running it to parse some
input provided as a command line parameter.

# Get started

### 0. clone this repository

```bash
git clone https://github.com/bkiers/iri-parser
cd iri-parser
```

### 1. generate the lexer and parser classes

```bash
mvn clean antlr4:antlr4
```

### 2. build the *fat* JAR

```bash
mvn clean install package
```

### 3. parse an IRI

```bash
java -jar target/iri-parser-0.1.0.jar "https://me@[2001:db8::ff00:42:8329]/path?query=nothing#somewhere"
```

Running the command above would print the following output:

```text
> the scheme      : https
> ihier-part      : //me@[2001:db8::ff00:42:8329]/path
> an IPv6 address : 2001:db8::ff00:42:8329
> a query         : query=nothing
> a fragment      : somewhere
```