package org.knit.solutions.lab5.task14;

public class TotalSumVisitor extends Visitor {
    private int totalSize = 0;

    public void addSize(int size) {
        totalSize += size;
    }

    public int getTotalSize() {
        return totalSize;
    }

    @Override
    public void visit(File element) {
        addSize(element.getSize());
    }
}
