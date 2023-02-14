import java.util.HashMap;

public class TNode {
  public HashMap<Character, TNode> children;
  public boolean isCompleteWord;

  public TNode() {
    this.children = new HashMap<Character, TNode>();
    this.isCompleteWord = false;
  }
}