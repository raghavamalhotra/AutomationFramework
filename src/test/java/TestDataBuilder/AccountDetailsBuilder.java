package TestDataBuilder;

import TestData.AccountDetails;
import com.github.javafaker.Faker;

public class AccountDetailsBuilder {

    AccountDetails accountDetails = new AccountDetails();
    Faker faker = new Faker();

    public AccountDetails WithAccountDetails()
    {
        String fName = faker.name().firstName();
        String lName = faker.name().lastName();
        this.accountDetails.Firstname = fName;
        this.accountDetails.Lastname = lName;
        this.accountDetails.Email = fName + lName + faker.number().digits(3) + "@gmail.com";
        this.accountDetails.Password = "Password99!";
        return this.accountDetails;
    }
}
