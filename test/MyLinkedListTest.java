package test;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class MyLinkedListTest {
	 public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
	        MyNode<Integer> myFirstNode = new MyNode<>(70);
	        MyNode<Integer> mySecondNode = new MyNode<>(30);
	        MyNode<Integer> myThirdNode = new MyNode<>(56);

	        MyLinkedListTest myLinkedList = new MyLinkedListTest();

	        myLinkedList.add(myFirstNode);
	        myLinkedList.add(mySecondNode);
	        myLinkedList.add(myThirdNode);

	        myLinkedList.printMyNodes();

	        boolean result=myLinkedList.head.equals(myThirdNode) &&
	                       myLinkedList.head.getNext().equals(mySecondNode) &&
	                       myLinkedList.tail.equals(myFirstNode);

	        Assert.assertTrue(result);
	    }

}


public void given3NumbersWhenAppendShouldBeAddedToLast() {
    MyNode<Integer> myFirstNode = new MyNode<>(70);
    MyNode<Integer> mySecondNode = new MyNode<>(30);
    MyNode<Integer> myThirdNode = new MyNode<>(56);

    MyLinkedListTest myLinkedList = new MyLinkedListTest();

    myLinkedList.add(myFirstNode);
    myLinkedList.append(mySecondNode);
    myLinkedList.append(myThirdNode);

    boolean result=myLinkedList.head.equals(myThirdNode) &&
            myLinkedList.head.getNext().equals(mySecondNode) &&
            myLinkedList.tail.equals(myFirstNode);

    Assert.assertTrue(result);
}
public void given3NumbersInsertSecondInBetweenShouldPassLinkedListTest() {
    MyNode<Integer> myFirstNode = new MyNode<>(70);
    MyNode<Integer> mySecondNode = new MyNode<>(30);
    MyNode<Integer> myThirdNode = new MyNode<>(56);

    MyLinkedListTest myLinkedList = new MyLinkedListTest();

    myLinkedList.add(myFirstNode);
    myLinkedList.insert(myFirstNode,mySecondNode);
    myLinkedList.append(myThirdNode);

    boolean result=myLinkedList.head.equals(myThirdNode) &&
            myLinkedList.head.getNext().equals(mySecondNode) &&
            myLinkedList.tail.equals(myFirstNode);

    Assert.assertTrue(result);
}
public void given3NumbersWhenDeletedShouldPassLinkedTest() {
    MyNode<Integer> myFirstNode = new MyNode<>(70);
    MyNode<Integer> mySecondNode = new MyNode<>(30);
    MyNode<Integer> myThirdNode = new MyNode<>(56);

    MyLinkedListTest myLinkedList = new MyLinkedListTest();

    myLinkedList.add(myFirstNode);
    myLinkedList.insert(myFirstNode,mySecondNode);
    myLinkedList.pop(myThirdNode);

    boolean result=myLinkedList.head.equals(myThirdNode) &&
            myLinkedList.head.getNext().equals(mySecondNode) &&
            myLinkedList.tail.equals(myFirstNode);

    Assert.assertTrue(result);
}
public void given3NumbersWhenDeletedLastShouldPassLinkedTest() {
    MyNode<Integer> myFirstNode = new MyNode<>(70);
    MyNode<Integer> mySecondNode = new MyNode<>(30);
    MyNode<Integer> myThirdNode = new MyNode<>(56);

    MyLinkedListTest myLinkedList = new MyLinkedListTest();

    myLinkedList.add(myFirstNode);
    myLinkedList.insert(myFirstNode,mySecondNode);
    myLinkedList.popLast(myThirdNode);

    boolean result=myLinkedList.head.equals(myThirdNode) &&
            myLinkedList.head.getNext().equals(mySecondNode) &&
            myLinkedList.tail.equals(myFirstNode);

    Assert.assertTrue(result);
}
void givenElementWhenSearchingShouldPassLinkedListResult() {
    MyNode<Integer> myFirstNode = new MyNode<>(56);
    MyNode<Integer> mySecondNode = new MyNode<>(30);
    MyNode<Integer> myThirdNode = new MyNode<>(70);
    MyLinkedListTest myLinkedList = new MyLinkedListTest();
    myLinkedList.append(myFirstNode);
    myLinkedList.append(mySecondNode);
    myLinkedList.append(myThirdNode);
    myLinkedList.printMyNodes();
    myLinkedList.searchMyNode();
    boolean result = myLinkedList.head.equals(myFirstNode) &&
            myLinkedList.head.getNext().equals(mySecondNode) &&
            myLinkedList.tail.equals(myThirdNode);
    System.out.println(result);
    Assert.assertTrue(result);
}
void given4NumbersWhenInsertingThirdNumberShouldPassLinkedListResult() {
    MyNode<Integer> myFirstNode = new MyNode<>(56);
    MyNode<Integer> mySecondNode = new MyNode<>(30);
    MyNode<Integer> myThirdNode = new MyNode<>(70);
    MyLinkedListTest myLinkedList = new MyLinkedListTest();
    myLinkedList.append(myFirstNode);
    myLinkedList.append(mySecondNode);
    myLinkedList.append(myThirdNode);
    myLinkedList.printMyNodes();
    myLinkedList.searchMyNode();
    myLinkedList.insert(40, 2);
    myLinkedList.printMyNodes();
    boolean result = myLinkedList.head.equals(myFirstNode) &&
            myLinkedList.head.getNext().equals(mySecondNode) &&
            myLinkedList.tail.equals(myThirdNode);
    System.out.println(result);
    Assert.assertTrue(result);
}
void given3NumbersWhenInsertingAndDeletingFourthNumberShouldPassLinkedListResult() {
    MyNode<Integer> myFirstNode = new MyNode<>(56);
    MyNode<Integer> mySecondNode = new MyNode<>(30);
    MyNode<Integer> myThirdNode = new MyNode<>(70);
    MyLinkedList myLinkedList = new MyLinkedList();
    myLinkedList.append(myFirstNode);
    myLinkedList.append(mySecondNode);
    myLinkedList.append(myThirdNode);
    myLinkedList.printMyNodes();
    myLinkedList.searchMyNode();
    myLinkedList.insert(40, 2);
    myLinkedList.printMyNodes();
    myLinkedList.remove(2);
    myLinkedList.printMyNodes();
    boolean result = myLinkedList.head.equals(myFirstNode) &&
            myLinkedList.head.getNext().equals(mySecondNode) &&
            myLinkedList.tail.equals(myThirdNode);
    System.out.println(result);
    Assert.assertTrue(result);
}
}