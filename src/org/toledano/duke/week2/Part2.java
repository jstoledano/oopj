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
        String dna1 = "ACGTACGTTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTA";
        String dna2 = "ACGTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTATGCTAGCTAGCTAGCTATAA";
        String dna3 = "ACGTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTATGTTAGCTAGCTAGCTAGCTAGCTATAA";
        String dna4 = "ACGTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTATGTTAGCTAGCTAGCTATAA";
        String dna5 = "ACGTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTATGCTAGCTAGCTAGCTAGCTA";
        String dna6 = "AcgTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTA";
        String dna7 = "ACGTACGTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTATGTTAATAA";
        String dna8 = "ACGTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTATGCTAGCTAGCTA";
        String dna9 = "ATGCCCTAA";
        String dna10 = "ATGTAA";

        System.out.println(" 1. The gene is " + findSimpleGene(dna1));
        System.out.println(" 2. The gene is " + findSimpleGene(dna2));
        System.out.println(" 3. The gene is " + findSimpleGene(dna3));
        System.out.println(" 4. The gene is " + findSimpleGene(dna4));
        System.out.println(" 5. The gene is " + findSimpleGene(dna5));
        System.out.println(" 6. The gene is " + findSimpleGene(dna6));
        System.out.println(" 7. The gene is " + findSimpleGene(dna7));
        System.out.println(" 8. The gene is " + findSimpleGene(dna8));
        System.out.println(" 9. The gene is " + findSimpleGene(dna9));
        System.out.println("10. The gene is " + findSimpleGene(dna10));

    }
}
