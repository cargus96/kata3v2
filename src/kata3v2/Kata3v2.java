
package kata3v2;

public class Kata3v2 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("google.es");
        histogram.increment("google.es");
        histogram.increment("google.es");
        histogram.increment("hotmail.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
        
        
    }
}
