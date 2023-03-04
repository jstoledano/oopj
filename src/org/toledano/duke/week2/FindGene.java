package org.toledano.duke.week2;

public class FindGene {
    private String findGene(String dna) {
        // Find first occurrence of "ATG" call its "startIndex"
        int startIndex = dna.indexOf("ATG");
        // Find the "TAA" substring form (startIndex+3), call it "currIndex"
        int currIndex = dna.indexOf("TAA", startIndex + 3);
        // As long as currIndex is not equal to -1
        while (currIndex != -1) {
            // Check if (currIndex - startIndex) is multiple of 3
            if ((currIndex - startIndex) % 3 == 0) {
                // If so, the text between startIndex and currIndex is your answer
                return dna.substring(startIndex, currIndex + 3);
            } else {
                // If not, update currIndex to the index
                // of the next "TAA" substring starting from (currIndex + 1)
                currIndex = dna.indexOf("TAA", currIndex + 1);
            }
        }
        // Your answer is the empty string
        return "";
    }

    public void testSimpleGene() {
        String dna = "AATGCGTAATTAATCG";
        String result = findGene(dna);
        System.out.println("The gene is "+result);

        dna = "CGATGGTTGATAAGCCTAAGCTATAA";
        result = findGene(dna);
        System.out.println("The gene is "+result);

        dna = "ACGATGCTAGCTAGCTAGCTAGCTAGCTAGCAGCTAGCTAGCTAGCTAGCTAGATGCTAGCTAGCTAGCTAGCTATAA";
        result = findGene(dna);
        System.out.println("The gene is "+result);
    }

}
