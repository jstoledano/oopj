package org.toledano.duke.week2;

public class Part2 {
    private String startCodon;
    private String stopCodon;

    public Part2() {
        this.startCodon = "ATG";
        this.stopCodon  = "TAA";
    }

    public Part2(String start, String stop) {
        this.startCodon = start;
        this.stopCodon  = stop;
    }
    public String findSimpleGene(String dna) {
        dna = dna.toUpperCase();

        int startIndex = dna.indexOf(this.startCodon);
        if (startIndex == -1) { return ""; }

        int stopIndex = dna.indexOf(this.stopCodon, startIndex + 3);
        if (stopIndex == -1) { return ""; }

        String result = dna.substring(startIndex, stopIndex + 3);
        if (result.length() % 3 == 0) { return result; }
        return "";
    }

    public void testSimpleGene() {
        String dna1 = "AAATGCCCTAACTAGATTAAGAAACC";

        System.out.println(" 1. The gene is " + findSimpleGene(dna1));
    }
}
