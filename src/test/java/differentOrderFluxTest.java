import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class differentOrderFluxTest {

    public static void main(String[] args) {

        Flux flux = Flux.just(1, 2, 3);
        StepVerifier.create(flux)
                .expectNext(1)
                .expectNext(3)
                .expectNext(2)
                .expectComplete()
                .verify();
    }
}
