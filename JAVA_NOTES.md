# Java Learning Notes

This folder is a collection of small, independent lessons and runnable
examples, not one application. Each Java source file has a short lesson
description in its opening comment. This guide connects the examples and
collects definitions, key points, compile/run instructions, and common errors.

## Study order and folder map

```text
basics/
  introduction/java-introduction.txt
  program-structure/ProgramStructure.java
  recursion/HaltingCondition.txt
  recursion/HaltingConditionExample.java
data-types/
  conversion/{CastingExample,RegexSplitExample,TypeConversionExample}.java
  strings/{FloatingPointExample,StringOperationsExample}.java
methods/
  StaticMethodSameClass.java
  InstanceMethodSameClass.java
  StaticMethodDifferentClass.java
  InstanceMethodDifferentClass.java
  static-and-instance-members.txt
classes/access-control/
  public-and-package-private/One.java
  shared-static-field/{FieldAccessExample,SharedField}.java
oop/
  object-oriented-programming.txt
  access-modifiers.txt
  encapsulation/{EncapsulationExample,BankAccountExample}.java
  constructors/ConstructorExample.java
  inner-classes/InnerClassExample.java
  inheritance/{AnimalInheritanceExample,ReferenceTypeExample}.java
  polymorphism/RuntimePolymorphismExample.java
  abstraction/{AbstractClassExample,InterfaceExample}.java
  abstraction/abstract-class-vs-interface.txt
input/ScannerInputExample.java
collections/ArrayListExample.java
math/MathExample.java
```

Suggested sequence: basics → types and strings → methods and classes → OOP →
input and collections → math.

## Compile and run

Install a JDK so both `javac` and `java` are available. From this folder,
compile all current examples into a separate output directory in PowerShell:

```powershell
$sources = Get-ChildItem -Recurse -Filter *.java | ForEach-Object FullName
javac -d build\classes $sources
java -cp build\classes ProgramStructure
```

Each public class can then be run by its class name, for example:

```powershell
java -cp build\classes TypeConversionExample
java -cp build\classes RuntimePolymorphismExample
java -cp build\classes HaltingConditionExample
```

`build\legacy` contains compiled `.class` files kept from the old layout. They
are snapshots, not the source of truth; compile the `.java` files to make fresh
classes. Folder names do not create Java packages. The examples use the
unnamed (default) package so each class name must be unique when they are
compiled together.

## Java and program structure

**Java** is a high-level, general-purpose, statically typed, class-based
programming language. The compiler translates `.java` source to bytecode in
`.class` files. A **JVM** executes that bytecode on the current platform, so
compatible JVMs allow the same bytecode to run on different systems.

- **JDK:** development tools, including `javac`, plus runtime components.
- **JVM:** loads and executes Java bytecode.
- **JRE:** runtime libraries and components needed to run Java applications;
  packaging varies across modern Java distributions.
- **JIT compiler:** a JVM component that can compile frequently executed
  bytecode into native instructions while the program runs.
- Inspect compiled bytecode with `javap -c ClassName`.

The `main` method is the usual application entry point:

```java
public static void main(String[] args)
```

`String... args` is also valid; inside the method it is an array. `public`
makes the entry point accessible and `static` lets the JVM invoke it without
first constructing the class. Command-line arguments are strings, so check
`args.length` before reading an element and parse numeric arguments explicitly.

`System.out.print` does not append a line break; `println` does. `printf` and
`format` accept format specifiers such as `%d`, `%s`, and `%n`.
[`ProgramStructure.java`](./basics/program-structure/ProgramStructure.java)
demonstrates output and command-line arguments.

## Primitive types, conversions, and arrays

Java has eight primitive types:

| Types | Meaning |
|---|---|
| `byte`, `short`, `int`, `long` | Signed whole numbers (8, 16, 32, and 64 bits). |
| `float`, `double` | Binary floating-point values; use `f` for a `float` literal. |
| `char` | One 16-bit UTF-16 code unit, written with single quotes. |
| `boolean` | `true` or `false`; Java does not define it as a particular portable byte size. |

**Widening conversion** is often automatic, e.g. `int` to `long`; it is not
always lossless (a large integer converted to `float` may lose precision).
**Narrowing conversion** may discard range or a fractional part and requires
an explicit cast:

```java
double measurement = 2.534;
int whole = (int) measurement; // 2; the fractional part is discarded
```

Useful conversions and array operations:

- Text to integer: `Integer.parseInt("123")`.
- A value to text: `String.valueOf(value)`.
- String to one character: `text.charAt(index)`.
- String to character array: `text.toCharArray()`.
- Character array to String: `new String(chars)`.
- Digit character to number: `digit - '0'`, after checking it is `'0'` to `'9'`.
- Primitive array display: `Arrays.toString(array)` after importing
  `java.util.Arrays`.
- Split text using a delimiter or regular expression; combine with
  `String.join`.
- Arrays have fixed length; use `ArrayList` when a resizable list is needed.

See [`TypeConversionExample.java`](./data-types/conversion/TypeConversionExample.java)
and [`CastingExample.java`](./data-types/conversion/CastingExample.java).

### Regular expressions and `split`

`String.split` treats its argument as a regular expression. A dot (`.`) means
“any character” and a pipe (`|`) means “or”; escape them for literal matching:
`text.split("\\.")`, `text.split("\\|")`. `\\s+` means one or more whitespace
characters. Print a `String[]` with `Arrays.toString`, not by concatenating the
array object.

See [`RegexSplitExample.java`](./data-types/conversion/RegexSplitExample.java).

## Strings and numeric precision

**String** is an immutable sequence of characters. Methods such as
`toUpperCase`, `replace`, and `concat` return a result; they do not change the
original string.

- Use `equals` to compare string contents; `==` compares object identity.
- String indexes start at zero. `charAt` needs an index from `0` through
  `length() - 1`.
- `substring(begin, end)` includes `begin` but excludes `end`.
- `trim` removes leading/trailing characters at or below U+0020;
  `strip` uses Unicode whitespace rules (Java 11+).
- `String.split` uses regex; see the section above.

`float` and `double` store binary floating-point approximations. Most decimal
fractions, including `0.1`, have no exact finite binary representation, so
`0.1 + 0.2` may not print as exactly `0.3`. Use `BigDecimal` initialized from
decimal strings for exact decimal arithmetic such as money; define a rounding
policy when needed.

See [`StringOperationsExample.java`](./data-types/strings/StringOperationsExample.java)
and [`FloatingPointExample.java`](./data-types/strings/FloatingPointExample.java).

## Classes, objects, methods, and constructors

- A **class** defines fields (state) and methods (behavior).
- An **object** is a runtime instance of a class, usually created with `new`.
- A **method** is behavior declared in a class. Java does not allow declaring
  a named method inside another method.
- A **constructor** initializes a new object. It has the class name and no
  return type. If no constructor is declared, Java provides a no-argument
  constructor; declaring any constructor removes that automatic one.
- **`this`** refers to the current object. `this.name = name` distinguishes a
  field from a same-named parameter.
- **Static member:** belongs to a class; prefer `ClassName.member`.
- **Instance member:** belongs to an object and is used through that object.

A static method has no current object, so it cannot directly access instance
members. The four programs in [`methods/`](./methods/) demonstrate static and
instance method calls within and across classes. The shared-field example is
in [`classes/access-control/shared-static-field/`](./classes/access-control/shared-static-field/).
An inner class declared without `static` is associated with an outer instance;
see [`InnerClassExample.java`](./oop/inner-classes/InnerClassExample.java).

## Object-oriented programming

**Object-oriented programming (OOP)** organizes a program around objects that
combine state and behavior. The four commonly taught principles are
encapsulation, inheritance, polymorphism, and abstraction.

### Encapsulation

**Encapsulation** keeps state and the operations on it together while
restricting direct access to internal details. A `private` field with
controlled methods is a common approach. Methods can validate input rather
than allowing arbitrary state changes.

Examples: [`EncapsulationExample.java`](./oop/encapsulation/EncapsulationExample.java)
and [`BankAccountExample.java`](./oop/encapsulation/BankAccountExample.java).
The bank example rejects a negative opening balance and non-positive deposits
with `IllegalArgumentException`.

### Inheritance

**Inheritance** lets a subclass extend a superclass with `extends`. A
subclass can reuse accessible behavior and override it. Private members are
not directly accessible to a subclass; constructors are not inherited. Java
classes have single class inheritance but can implement multiple interfaces.

The variable's **declared type** determines which members can be called at
compile time. With `Base reference = new Child()`, `reference` can call members
declared by `Base`; it cannot call a child-only method unless the reference is
appropriately narrowed. The actual object type controls which overridden
instance method runs at runtime.

See [`AnimalInheritanceExample.java`](./oop/inheritance/AnimalInheritanceExample.java)
and [`ReferenceTypeExample.java`](./oop/inheritance/ReferenceTypeExample.java).

### Polymorphism

**Polymorphism** allows a superclass or interface reference to refer to
different concrete objects.

- **Overloading:** same method name with different parameter lists; selected
  by the compiler.
- **Overriding:** subclass provides a matching instance method; the runtime
  object's implementation is selected.
- Write `@Override` exactly; the compiler checks the method really overrides.
- Static methods are hidden rather than overridden; fields are not
  polymorphic.

See [`RuntimePolymorphismExample.java`](./oop/polymorphism/RuntimePolymorphismExample.java).

### Abstraction: abstract classes and interfaces

**Abstraction** exposes what a type can do while hiding unnecessary
implementation detail.

- An **abstract class** cannot be instantiated directly. It can hold state,
  constructors, concrete methods, and abstract methods. A concrete subclass
  must implement all inherited abstract methods.
- An **interface** defines a contract or capability. A class can implement
  multiple interfaces. Modern Java interfaces may have abstract, default,
  static, and private methods.
- Prefer an abstract class for related types sharing state/implementation;
  prefer an interface for a capability that can apply to unrelated types.

See [`AbstractClassExample.java`](./oop/abstraction/AbstractClassExample.java),
[`InterfaceExample.java`](./oop/abstraction/InterfaceExample.java), and
[`abstract-class-vs-interface.txt`](./oop/abstraction/abstract-class-vs-interface.txt).

### Access modifiers

| Modifier | Same class | Same package | Subclass in another package | Unrelated other package |
|---|---:|---:|---:|---:|
| `private` | Yes | No | No | No |
| no modifier (package-private) | Yes | Yes | No | No |
| `protected` | Yes | Yes | Yes, with subclass access rules | No |
| `public` | Yes | Yes | Yes | Yes |

`protected` is not unrestricted public access across packages. A top-level
class can be `public` or package-private, not `private` or `protected`. See
[`access-modifiers.txt`](./oop/access-modifiers.txt) and
[`One.java`](./classes/access-control/public-and-package-private/One.java).
The access examples use the unnamed package; folder names alone are not
package declarations.

## Input, collections, and math

### Standard input

`Scanner` reads typed values from an input source. `nextInt` reads an integer,
`next` reads one token, and `nextLine` reads the rest of a line. Mixing
`nextInt` and `nextLine` needs care because `nextInt` leaves the line ending
behind. Invalid input for `nextInt` can raise `InputMismatchException`.

See [`ScannerInputExample.java`](./input/ScannerInputExample.java).

### `ArrayList`

`ArrayList<E>` is a resizable, ordered collection of values of type `E`.
`add`, `get`, `set`, and `remove` are common operations. For
`ArrayList<Integer>`, `remove(2)` removes index 2, while
`remove(Integer.valueOf(2))` removes the value 2.

Invalid indexes cause `IndexOutOfBoundsException`; see
[`ArrayListExample.java`](./collections/ArrayListExample.java).

### `Math`

`java.lang.Math` provides methods/constants such as `min`, `max`, `abs`,
`sqrt`, `pow`, `round`, `floor`, `ceil`, and `PI`. `Math.random()` returns a
`double` in `[0, 1)`. For an inclusive integer range:

```java
int value = (int) (Math.random() * (max - min + 1)) + min;
```

See [`MathExample.java`](./math/MathExample.java).

## Common exceptions and errors

An **exception** is a condition that interrupts normal execution and can be
handled or reported. A compile-time error prevents a program from compiling.
An **Error**, such as `StackOverflowError`, is distinct from an exception and
usually signals a serious runtime/resource problem.

| Problem | Typical cause | Prevention / example |
|---|---|---|
| `NumberFormatException` | Parsing text that is not a valid number | Validate input or handle parsing failure before using `parseInt`. |
| `StringIndexOutOfBoundsException` | Invalid index for `charAt` or `substring` | Check string length and index bounds. |
| `ArrayIndexOutOfBoundsException` | Reading/writing outside an array | Valid indexes are `0` through `length - 1`. |
| `IndexOutOfBoundsException` | Invalid `ArrayList` index | Check `size()` before index-based operations. |
| `NullPointerException` | Calling a method or reading a member through `null` | Initialize references and check optional values. |
| `InputMismatchException` | `Scanner` token does not match the requested type | Check input with `hasNextInt`, etc. |
| `IllegalArgumentException` | A method receives an invalid value | Validate arguments; the encapsulation/input examples show this pattern. |
| `StackOverflowError` | Recursion does not reach its base case or is too deep | Ensure every recursive path progresses toward a halting condition. |

Other frequent **compile-time** errors:

- A public top-level class name does not match the `.java` filename (including
  case).
- Calling an instance method as though it were static, or vice versa.
- Calling a child-only method through a parent-typed reference.
- A misspelled `@Override` or a method signature that does not override.
- Using an unresolved class without importing it (for example, `Arrays`
  requires `java.util.Arrays`).
- Declaring the same local variable twice in one scope.

The source examples have been organized with matching public class/file names
and corrected to compile together. The invalid child-only call is left as a
comment in `ReferenceTypeExample.java` to demonstrate the compile-time rule.
