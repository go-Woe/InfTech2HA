public class HeapSort {
    private int[] nodes;

    public HeapSort(int[] nodes){
        this.nodes = nodes;
    }

    private int getLeftChild (int i){
        return 2*i+1;
    }
    private int getRightChild (int i){
        return 2*i+2;
    }

    private void tausch(int i, int j){
        int a = nodes[i];
        nodes[i] = nodes[j];
        nodes[j] = a;
    }

    public void buildHeap(){
        for (int i=((nodes.length/2)-1);i>=0;i--){
            heapify(i,nodes.length-1);
        }
    }

    private void heapify(int curIdx, int endIdx){
        int left = getLeftChild(curIdx);
        int right = getRightChild(curIdx);

        if (left <= endIdx){
            if (right > endIdx){
                if (nodes[curIdx]<nodes[left]) {
                    tausch(curIdx, left);
                }
            }else {
                if (nodes[left] < nodes[right]){
                    if (nodes[curIdx]< nodes[right]){
                        tausch(curIdx,right);
                        heapify(right,endIdx);
                    }
                }else {
                    if (nodes[curIdx]<nodes[left]){
                        tausch(curIdx,left);
                        heapify(left,endIdx);
                    }
                }
            }
        }
    }
    public void heapSort(){
        buildHeap();
        for (int i =0; i< nodes.length;i++){
            tausch(0,nodes.length-i-1);
            heapify(0,nodes.length-i-2);
        }
    }
}
