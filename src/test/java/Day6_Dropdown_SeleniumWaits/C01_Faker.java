package Day6_Dropdown_SeleniumWaits;

import com.github.javafaker.Faker;
import org.junit.Test;
import utilities.BaseTest;

public class C01_Faker extends BaseTest {

    // Faker clasını kullanmak için
    // Faker classından bir obje uretilir

    @Test
    public void fakerExample() {

        Faker faker = new Faker();
        System.out.println(faker.name().firstName());
        System.out.println(faker.address().fullAddress());
    }

}
