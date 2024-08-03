
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class testFlux {

    @Test
    public void testFlux() {

        //Create a Flux
        Flux<Integer> fluxToTest = Flux.just(1, 2, 3, 4, 5);
        StepVerifier.create(fluxToTest)
                .expectNext(1)
                .expectNext(2)
                .expectNext(3)
                .expectNext(4)
                .expectNext(5)
                .expectComplete().verify();
    }
}
