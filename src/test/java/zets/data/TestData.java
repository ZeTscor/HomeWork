package zets.data;


import com.github.javafaker.Faker;


public class TestData {

    Faker faker = new Faker();
    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String email = faker.internet().emailAddress();
    public String phone = faker.number().digits(10);
    public String address = faker.address().streetAddress();
    public String gender = "Male";
    public String subject = "Comp";
    public String hobbyOne = "Reading";
    public String hobbyTwo = "Music";
    public String state = "harya";
    public String cities = "Karnal";
    public String picPath = "src/test/resources/1.png";

}

