package ru.java_training.java_basics.array_and_primitives.array_processor;

public class ArrayProcessor {

    public static void main(String[] args) {
        ArrayProcessor arrayProcessor = new ArrayProcessor();
        int[] array = arrayProcessor.initialArray();

        arrayProcessor.exchangeNegativePositive(array);
        arrayProcessor.sumPositiveElements(array);
        arrayProcessor.replaceNegativeZero(array);
        arrayProcessor.getTriplingPositive(array);
        arrayProcessor.showDifference(array);
        arrayProcessor.getElements(array);
    }

    private int[] initialArray() {
        int[] array = new int[2]; // FIXME
        return array;
    }

    private void exchangeNegativePositive(int[] array) {
        // add code here
    }

    private void sumPositiveElements(int[] array) {
        // add code here
    }

    private void replaceNegativeZero(int[] array) {
        // add code here
    }

    private void getTriplingPositive(int[] array) {
        // add code here
    }

    private void showDifference(int[] array) {
        // add code here
    }

    private void getElements(int[] array) {
        // add code here
    }
}
