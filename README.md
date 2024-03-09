

Changing class parameters does not recompile dependant class.

Repro with Mill:
- `mill scalaHelloWorld.run` , all good
- add parameter to `MyService`
- `mill scalaHelloWorld.run` again:
    - the code still compiles, but should not compile
    - throws `java.lang.NoSuchMethodError: 'void example.MyService.<init>(java.lang.String)'`

Same with sbt.

