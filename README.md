# Uncommon 'continue' statement behavior in Java loop
This repository demonstrates a subtle issue related to the `continue` statement within a `while` loop in Java. The program aims to print numbers 1 through 10, excluding 5.  The error is less about syntax and more about unexpected behavior under specific circumstances. This can be easily missed during testing. 

The `bug.java` file contains the code exhibiting the problem, while `bugSolution.java` offers a corrected version.

The core issue stems from the interaction of `continue` and loop conditions. While seemingly straightforward, this behavior can be confusing for developers.