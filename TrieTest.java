public class TrieTest {
  public static void main(String[] args) {

    Trie trie = new Trie();

    trie.insertWord("car");
    trie.insertWord("card");
    trie.insertWord("chip");
    trie.insertWord("trie");
    trie.insertWord("try");
    trie.insertWord("soap");
    trie.insertWord("soda");

    System.out.println(trie.isPrefixValid("ch"));
    System.out.println(trie.isPrefixValid("ct"));
    System.out.println(trie.isPrefixValid("tr"));

    System.out.println(trie.isWordValid("chip"));
    System.out.println(trie.isWordValid("cause"));
    System.out.println(trie.isWordValid("trie"));
    System.out.println(trie.isWordValid("tri"));
    
    trie.printAllKeys();
  }
}