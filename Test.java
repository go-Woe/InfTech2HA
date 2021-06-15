public class Test {
    public Test() {
    }
    private void vergleicheInt(int[] var1, int[] var2) {
        boolean var3 = true;

        for(int var4 = 0; var4 < var1.length; ++var4) {
            if (var1[var4] != var2[var4]) {
                    var3 = false;
            }
        }

        if (!var3) {
            System.out.println("-->Fehler");
        } else {
            System.out.println("-->korrekt");
        }

    }

    private void printIntArray(int[] var1) {
            for(int var2 = 0; var2 < var1.length; ++var2) {
                System.out.print(var1[var2] + " ");
            }

            System.out.println();
        }

        private static int randomInt() {
            int var0 = (int)(Math.random() * 26.0D + 1.0D);
            return var0;
        }

        private static int[] randomIntArray() {
            int[] var0 = new int[10];

            for(int var1 = 0; var1 < var0.length; ++var1) {
                while(var0[var1] == 0) {
                    int var2 = randomInt();
                    boolean var3 = false;

                    for(int var4 = 0; var4 < var1; ++var4) {
                        if (var0[var4] == var2) {
                            var3 = true;
                        }
                    }

                    if (!var3) {
                        var0[var1] = var2;
                    }
                }
            }

            return var0;
        }

        private int[] copyIntArray(int[] var1) {
            int[] var2 = new int[var1.length];

            for(int var3 = 0; var3 < var1.length; ++var3) {
                var2[var3] = var1[var3];
            }

            return var2;
        }

        public void testeAlles() {
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("\n                Kompletter Test");
            System.out.println("\n--------------------------------------------------\n");
            int[] var1 = new int[]{26, 25, 12, 15, 17, 23, 9, 13, 4, 2, 7};
            int[] var2 = new int[]{26, 25, 12, 15, 17, 23, 9, 13, 4, 2, 7};
            System.out.println("\n1.1 Ausgangsarray (int, fest): \n");
            this.printIntArray(var2);
            Test.Heap var3 = new Test.Heap(var2);
            HeapSort var4 = new HeapSort(var1);
            System.out.println("\n----------------------------------------\n");
            System.out.println("\n1.2 Test von buildHeap (int, fest): \n");
            var3.buildHeap();
            var4.buildHeap();
            System.out.println("erwartete Ausgabe \n");
            this.printIntArray(var2);
            this.printIntArray(var1);
            System.out.println("\nAusgabe der Studenten \n");
            this.vergleicheInt(var1, var2);
            System.out.println("\n----------------------------------------\n");
            System.out.println("\n1.3 Test von heapSort (int, fest): \n");
            var3.heapSort();
            var4.heapSort();
            System.out.println("erwartete Ausgabe \n");
            this.printIntArray(var2);
            this.printIntArray(var1);
            System.out.println("\nAusgabe der Studenten \n");
            this.vergleicheInt(var1, var2);
            var1 = randomIntArray();
            var2 = this.copyIntArray(var1);
            System.out.println("\n----------------------------------------\n");
            System.out.println("\n2.1 Ausgangsarray (int, zufaellig): \n");
            this.printIntArray(var2);
            var3 = new Test.Heap(var2);
            var4 = new HeapSort(var1);
            System.out.println("\n----------------------------------------\n");
            System.out.println("\n2.2 Test von buildHeap (int, zufaellig): \n");
            var3.buildHeap();
            var4.buildHeap();
            System.out.println("erwartete Ausgabe \n");
            this.printIntArray(var2);
            this.printIntArray(var1);
            System.out.println("\nAusgabe der Studenten \n");
            this.vergleicheInt(var1, var2);
            System.out.println("\n----------------------------------------\n");
            System.out.println("\n2.3 Test von heapSort (int, zufaellig): \n");
            var3.heapSort();
            var4.heapSort();
            System.out.println("erwartete Ausgabe \n");
            this.printIntArray(var2);
            this.printIntArray(var1);
            System.out.println("\nAusgabe der Studenten \n");
            this.vergleicheInt(var1, var2);
        }

        public void testeBuildHeap() {
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("\n                   buildHeap Test");
            System.out.println("\n--------------------------------------------------\n");
            int[] var1 = new int[]{26, 25, 12, 15, 17, 23, 9, 13, 4, 2, 7};
            int[] var2 = new int[]{26, 25, 12, 15, 17, 23, 9, 13, 4, 2, 7};
            System.out.println("\n1.1 Ausgangsarray (int, fest): \n");
            this.printIntArray(var2);
            Test.Heap var3 = new Test.Heap(var2);
            HeapSort var4 = new HeapSort(var1);
            System.out.println("\n----------------------------------------\n");
            System.out.println("\n1.2 Test von buildHeap (int, fest): \n");
            var3.buildHeap();
            var4.buildHeap();
            System.out.println("erwartete Ausgabe \n");
            this.printIntArray(var2);
            this.printIntArray(var1);
            System.out.println("\nAusgabe der Studenten \n");
            this.vergleicheInt(var1, var2);
            var1 = randomIntArray();
            var2 = this.copyIntArray(var1);
            System.out.println("\n----------------------------------------\n");
            System.out.println("\n2.1 Ausgangsarray (int, zufaellig): \n");
            this.printIntArray(var2);
            var3 = new Test.Heap(var2);
            var4 = new HeapSort(var1);
            System.out.println("\n----------------------------------------\n");
            System.out.println("\n2.2 Test von buildHeap (int, zufaellig): \n");
            var3.buildHeap();
            var4.buildHeap();
            System.out.println("erwartete Ausgabe \n");
            this.printIntArray(var2);
            this.printIntArray(var1);
            System.out.println("\nAusgabe der Studenten \n");
            this.vergleicheInt(var1, var2);
        }

        public void testeHeapSort() {
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("\n                   heapSort Test");
            System.out.println("\n--------------------------------------------------\n");
            int[] var1 = new int[]{26, 25, 12, 15, 17, 23, 9, 13, 4, 2, 7};
            int[] var2 = new int[]{26, 25, 12, 15, 17, 23, 9, 13, 4, 2, 7};
            System.out.println("\n1.1 Ausgangsheap(int, fest): \n");
            this.printIntArray(var2);
            Test.Heap var3 = new Test.Heap(var2);
            HeapSort var4 = new HeapSort(var1);
            System.out.println("\n----------------------------------------\n");
            System.out.println("\n1.2 Test von heapSort (int, fest): \n");
            var3.heapSort();
            var4.heapSort();
            System.out.println("erwartete Ausgabe \n");
            this.printIntArray(var2);
            this.printIntArray(var1);
            System.out.println("\nAusgabe der Studenten \n");
            this.vergleicheInt(var1, var2);
            var2 = randomIntArray();
            var3 = new Test.Heap(var2);
            var3.buildHeap();
            var1 = this.copyIntArray(var2);
            System.out.println("\n----------------------------------------\n");
            System.out.println("\n2.1 Ausgangsheap(int, zufaellig): \n");
            this.printIntArray(var2);
            var4 = new HeapSort(var1);
            System.out.println("\n----------------------------------------\n");
            System.out.println("\n2.2 Test von heapSort (int, zufaellig): \n");
            var3.heapSort();
            var4.heapSort();
            System.out.println("erwartete Ausgabe \n");
            this.printIntArray(var2);
            this.printIntArray(var1);
            System.out.println("\nAusgabe der Studenten \n");
            this.vergleicheInt(var1, var2);
        }

        private class Heap {
            private int[] nodes;

            public Heap(int[] var2) {
                this.nodes = var2;
            }

            private int getLeftChild(int var1) {
                return 2 * var1 + 1;
            }

            private int getRightChild(int var1) {
                return 2 * var1 + 2;
            }

            private void swap(int var1, int var2) {
                int var3 = this.nodes[var1];
                this.nodes[var1] = this.nodes[var2];
                this.nodes[var2] = var3;
            }

            private void buildHeap() {
                for(int var1 = this.nodes.length / 2 - 1; var1 >= 0; --var1) {
                    this.heapify(var1, this.nodes.length - 1);
                }

            }

            private void heapify(int var1, int var2) {
                int var3 = this.getLeftChild(var1);
                int var4 = this.getRightChild(var1);
                if (var3 <= var2) {
                    if (var4 > var2) {
                        if (this.nodes[var1] - this.nodes[var3] < 0) {
                            this.swap(var1, var3);
                        }
                    } else if (this.nodes[var3] - this.nodes[var4] < 0) {
                        if (this.nodes[var1] - this.nodes[var4] < 0) {
                            this.swap(var1, var4);
                            this.heapify(var4, var2);
                        }
                    } else if (this.nodes[var1] - this.nodes[var3] < 0) {
                        this.swap(var1, var3);
                        this.heapify(var3, var2);
                    }
                }

            }

            public void heapSort() {
                this.buildHeap();

                for(int var1 = 0; var1 < this.nodes.length; ++var1) {
                    this.swap(0, this.nodes.length - 1 - var1);
                    this.heapify(0, this.nodes.length - 2 - var1);
                }

            }
        }
}


