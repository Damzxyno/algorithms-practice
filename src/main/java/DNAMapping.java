import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DNAMapping {
    public static void main(String[] args) {
        System.out.println(dnaComplement("ATCG"));
    }

    public static String dnaComplement(String dna) {
        if (dna.isBlank()) return "";
        return Stream.of(dna.split("")).map(i -> i.equals("T") ? "A" :
                                                        i.equals("A") ? "T" :
                                                        i.equals("G") ? "C" : "G")
                .collect(Collectors.joining());



//        return Arrays.stream(dna.split("")).map(i -> i.equals("A") ? "T" :
//                        i.equals("T") ? "A" :
//                i.equals("C") ? "G" : "C").collect(Collectors.joining());
    }
}
