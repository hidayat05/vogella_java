package annotations;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 * http://www.vogella.com/tutorials/JavaAnnotations/article.html
 */
public class AnnotationRunner {
    public void methode1() {
        System.out.println("methode1");
    }

    @CanRun
    public void methode2() {
        System.out.println("methode2");
    }

    public void methode3() {
        System.out.println("methode3");
    }

    @CanRun
    public void methode4() {
        System.out.println("methode4");
    }
}
