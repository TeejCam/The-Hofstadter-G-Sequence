package org.example;

public class Hofstadter {
  // Your implementation of the sequence goes here.
  // Recall that you can calculate the nth term, G(n), using:
  // G(n) = n - G(G(n-1))
  // G(0) = 0
  public Integer gSequence(Integer index) {
    if (index == 0){
      return 0;
    } else {
      return index - gSequence(gSequence(index - 1));
    }
  }

  public static void main(String[] args)
  {
    
  }
}
