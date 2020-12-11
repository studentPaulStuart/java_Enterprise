package Session16_AssessLab;

import Session15_AssessLab.*;
import Session14_AssessLab.*;

public class Person {

       //Declare Global Constants
       public static final String DEFAULT_PERSON_NAME = "DEFAULT_PERSONFIRST";
       public static final String DEFAULT_PERSON_EMAIL = "DAEFAULT_EMAIL";
       public static final String DEFAULT_PERSON_PHONE = "000000000";

       String name;
       String email;
       String phone;

       // All Args Constructor
       public Person(String name, String email, String phone) {
              this.name = name;
              this.email = email;
              this.phone = phone;
       }

       // No Args Constructor
       public Person() {
              name = "null";
              email = "null";
              phone = "0000000";
       }

       //Person name only Constructor
       public Person(String name) {
              this(name = name, DEFAULT_PERSON_EMAIL, DEFAULT_PERSON_PHONE);
       }

       public String getName() {
              return name;
       }

       public void setName(String name) {
              this.name = name;
       }

       public String getEmail() {
              return email;
       }

       public void setEmail(String email) {
              this.email = email;
       }

       public String getPhone() {
              return phone;
       }

       public void setPhone(String phone) {
              this.phone = phone;
       }

       //To String Method
       @Override
       public String toString() {
              return super.toString()
                      + "["
                      + "\n Name = " + this.name
                      + "\n Email = " + this.email
                      + "\n Phone = " + this.phone
                      + "]";

       }

}
