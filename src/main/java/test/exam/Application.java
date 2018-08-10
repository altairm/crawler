package test.exam;

import java.util.List;
import java.util.ArrayList;

public class Application {
    private static List<Double> numbers = new ArrayList<>();
    private static Double sum = 0d;
  
      public static void main(String[] args) {
        
        Node tree = new Node(5);
        tree.setLeft(new Node(3));
        tree.getLeft().setLeft(new Node(7));
        tree.getLeft().setRight(new Node(8));
        tree.setRight(new Node(4));
        tree.getRight().setLeft(new Node(6));
        tree.getRight().setRight(new Node(2));
        System.out.println(tree);
        
        traverse(tree, 0d, 0);
        System.out.println(numbers);
        System.out.println(sum);
      }
  
  
  
  public static void traverse(Node node, Double prev, int depth) {
    prev = prev * 10 + node.getValue();
    if (node.getLeft() != null) {
      traverse(node.getLeft(), prev, depth+1);
    } 
    if (node.getRight() != null) {
      traverse(node.getRight(), prev, depth+1);
    }
    if (node.getLeft() == null && node.getRight() == null) {
      numbers.add(prev);
      sum += prev;
    }
  }
}
