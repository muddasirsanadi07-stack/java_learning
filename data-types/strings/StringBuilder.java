//string is immutable so
//StringBuilder is a Java class used to create and modify strings efficiently without creating a new String object for every modification.

StringBuilder sb = new StringBuilder("Hello");

sb.append(" World");     // Add at end
sb.insert(5, " Java");   // Insert at index
sb.delete(5, 10);        // Delete characters
sb.setCharAt(0, 'h');    // Change a character
sb.reverse();            // Reverse

String s = sb.toString();     //convert into string

string - immutable
StringBuilder mutable