# Incorrect Handling of Option in Scala
This example demonstrates a common error in Scala when dealing with `Option` values. The code attempts to extract the `id` from a `User` object obtained from a list using `find`.  If the user is not found, it defaults to a `User` with `id 0`, which may not always be the desired behavior. This is because the original `Option` is implicitly unwrapped only if a value is present, otherwise, a default value is given instead which might not be handled appropriately for the application.

## How to reproduce
1. Compile and run the `bug.scala` file.
2. Observe the output; it may not be what is expected.

## Solution
The solution demonstrates how to properly handle `Option` values using pattern matching to avoid unexpected results and exceptions when accessing values from an `Option` that is `None`.  
