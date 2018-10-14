public interface Component {

     void printDescription(String ReceiptType) ;
     void addChild(Component c);
     void removeChild(Component c);
     Component getChild(int i);
}
