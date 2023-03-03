package InClassPractice;

public class UserClass {
    String name;
    long phoneNumber;

    UserClass(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

}

class UserInfo extends UserClass {
    String userAddress;

    UserInfo(String name, long phoneNumber, String userAddress) {
        super(name, phoneNumber);
        this.userAddress = userAddress;
    }

    void userDetail() {
        System.out.println("Name :" + name);
        System.out.println("Phone number :" + phoneNumber);
        System.out.println("Address :" + userAddress);
    }
}

class UserTester {
    public static void main(String[] args) {
        UserInfo user1 = new UserInfo("Randy", 19874567656L, "123 sw 23rd street Oakland Park/CA 33333");
        user1.userDetail();
    }
}