package co.incubyte;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PrimeFactorsShould {
    @Test
    void return_empty_list_for_number_1()
    {
        Assertions.assertThat(PrimeFactors.ofNumber(1)).isEqualTo(List.of());
    }

    @Test
    void return_prime_factors_for_number_2()
    {
        Assertions.assertThat(PrimeFactors.ofNumber(2)).isEqualTo(List.of(2));
    }

    @Test
    void return_prime_factors_for_number_3()
    {
        Assertions.assertThat(PrimeFactors.ofNumber(3)).isEqualTo(List.of(3));
    }

    @Test
    void return_prime_factors_for_number_4()
    {
        Assertions.assertThat(PrimeFactors.ofNumber(4)).isEqualTo(List.of(2,2));
    }

    @Test
    void return_prime_factors_for_number_10()
    {
        Assertions.assertThat(PrimeFactors.ofNumber(10)).isEqualTo(List.of(2,5));
    }

    @Test
    void return_prime_factors_for_number_40()
    {
        Assertions.assertThat(PrimeFactors.ofNumber(40)).isEqualTo(List.of(2,2,2,5));
    }

    @Test
    void return_prime_factors_for_number_100()
    {
        Assertions.assertThat(PrimeFactors.ofNumber(100)).isEqualTo(List.of(2,2,5,5));
    }

    @Test
    void return_prime_factors_for_number_131()
    {
        Assertions.assertThat(PrimeFactors.ofNumber(131)).isEqualTo(List.of(131));
    }

    @Test
    void return_prime_factors_for_number_178()
    {
        Assertions.assertThat(PrimeFactors.ofNumber(178)).isEqualTo(List.of(2,89));
    }

    @Test
    void return_prime_factors_for_number_576()
    {
        Assertions.assertThat(PrimeFactors.ofNumber(576)).isEqualTo(List.of(2,2,2,2,2,2,3,3));
    }

}
