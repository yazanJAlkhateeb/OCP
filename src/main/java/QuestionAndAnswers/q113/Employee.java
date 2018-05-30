package QuestionAndAnswers.q113;

import java.util.Optional;

//Given the code fragments:
class Employee {
    Optional<Address> address;

    Employee(Optional<Address> address) {
        this.address = address;
    }

    public Optional<Address> getAddress() {
        return address;
    }
    class Address {
        String city = "New York";

        public String getCity() {
            return city;
        }

        public String toString() {
            return city;
        }
    }

    //and
    public static void main(String[] args) {
        Address address = null;
        Optional<Address> addrs1 = Optional.ofNullable(address);
        Employee e1 = new Employee(addrs1);
        String eAddress = (addrs1.isPresent()) ? addrs1.get().getCity() : "City Not available";
/*What is the result?
A. New York
B. City Not available ///answer
C. null
D. A NoSuchElementException is thrown at run time*/
    }
}

