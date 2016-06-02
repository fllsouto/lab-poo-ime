package class9.GenericDataStructure;

import java.util.*;

/**
 * Created by fsouto on 19/05/16.
 */
public class DataStructureBox {
    private Random rand;
    private ArrayList<MagicBox> arrayBox;
    private Stack<MagicBox> stackBox;
    private LinkedList<MagicBox> linkedListBox;

    public DataStructureBox(){
        this.rand = new Random(System.currentTimeMillis());
        this.arrayBox = new ArrayList<>();
        this.stackBox = new Stack<>();
        this.linkedListBox = new LinkedList<>();
    }

    public static void main(String[] args) {

        DataStructureBox box = new DataStructureBox();

        box.fillMagicBoxes(10, box.linkedListBox);
        box.fillMagicBoxes(10, box.arrayBox);
        box.fillMagicBoxes(10, box.stackBox);
//        fillMagicBoxes(10, (AbstractList) box4);

        box.showMagicBoxes(box.arrayBox, "ArrayList");
        box.showMagicBoxes(box.stackBox, "Stack");
        box.showMagicBoxes(box.linkedListBox, "LinkedList");
//        showMagicBoxes((AbstractList) box4, "Set");

        box.vectorProduct(box.arrayBox, box.stackBox);
        box.vectorSum(box.arrayBox, box.stackBox);
    }

    public void fillMagicBoxes(int maxSize, AbstractList list) {
        int i = 0;
        for(; i < maxSize; i++) {
            list.add(this.rand.nextInt() % 100);
        }
    }

    public void showMagicBoxes(AbstractList list, String type) {
        System.out.println("\n" + type);
        System.out.println("Size : " + list.size());
        System.out.println(list + "\n");
    }

    public void copyMagicBoxed(AbstractList source, AbstractList destiny) {
        int i = 0;
        for(; i < source.size(); i++) {
            destiny.add(i, source.get(i));
        }
    }

    public Boolean equalMagicBoxes(AbstractList list1, AbstractList list2){
        int i = 0;
        if(list1.size() != list2.size())
            return false;

        for(; i < list1.size(); i++) {
            if(list1.get(i) != list2.get(i))
                return false;
        }
        return true;

    }

    public void vectorProduct(AbstractList list1, AbstractList list2) {
        System.out.println("\nVector Product");
        if(list1.size() != list2.size()) {
            System.out.println("Lists must have same dimension");
            System.exit(1);
        }
        int indx = 0;
        Double vProd = 0.0;
        Iterator it1 = list1.iterator();
        Iterator it2 = list2.iterator();
        while(it1.hasNext() && it2.hasNext()) {
            int i = (int) it1.next();
            int j = (int) it2.next();
            vProd += i * j;
        }

        System.out.println("List 1 : " + list1);
        System.out.println("List 2 : " + list2);
        System.out.println("Vectorial Product : " + vProd);
    }

    public void vectorSum(AbstractList list1, AbstractList list2) {
        System.out.println("\nVector Sum");
        if(list1.size() != list2.size()) {
            System.out.println("Lists must have same dimension");
            System.exit(1);
        }
        System.out.println("List 1 Before : " + list1);
        int indx = 0;
        Double vProd = 0.0;
        Iterator it1 = list1.iterator();
        Iterator it2 = list2.iterator();
        while(it1.hasNext() && it2.hasNext()) {
            int i = (int) it1.next();
            int j = (int) it2.next();
            list1.set(indx++, i + j);
        }

        System.out.println("List 1 After : " + list1);
    }

    public ArrayList<MagicBox> getArrayBox() { return this.arrayBox;}

    public Stack<MagicBox> getStackBox() { return this.stackBox;}

    public LinkedList<MagicBox> getLinkedListBox() { return this.linkedListBox;}
}

class MagicBox {

    private int magicNumber;

    public MagicBox(int magicNumber) {
        this.magicNumber = magicNumber;
    }

    public int swapBoxContent(int newMagicNumber){
        int content = getMagicBoxContent();
        this.magicNumber = newMagicNumber;
        return content;
    }

    public int getMagicBoxContent() {
        return this.magicNumber;
    }
}
