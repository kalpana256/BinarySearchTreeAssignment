package implementation;

public class Node<E extends Comparable<E>> implements myinterface.Node<E> {
    //complete node class
    private E data;
    private myinterface.Node left;
    private myinterface.Node right;

    public Node(E data){
        this.data=data;
        left=null;
        right=null;
    }

    @Override
    public E getData() {
        return null;
    }

    @Override
    public void setData(E data) {

    }

    @Override
    public myinterface.Node getLeft() {
        return null;
    }

    @Override
    public myinterface.Node getRight() {
        return null;
    }

    @Override
    public void setLeft(myinterface.Node left) {

    }

    @Override
    public void setRight(myinterface.Node right) {

    }


}

