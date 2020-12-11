package Session14_AssessLab;


public class Address {

       int Number;
       String Street;
       String Suburb;
       int PostCode;
       String State;

       public Address(int Number, String Street, String Suburb, int PostCode, String State) {
              this.Number = Number;
              this.Street = Street;
              this.Suburb = Suburb;
              this.PostCode = PostCode;
              this.State = State;
       }

       public int getNumber() {
              return Number;
       }

       public void setNumber(int Number) {
              this.Number = Number;
       }

       public String getStreet() {
              return Street;
       }

       public void setStreet(String Street) {
              this.Street = Street;
       }

       public String getSuburb() {
              return Suburb;
       }

       public void setSuburb(String Suburb) {
              this.Suburb = Suburb;
       }

       public int getPostCode() {
              return PostCode;
       }

       public void setPostCode(int PostCode) {
              this.PostCode = PostCode;
       }

       public String getState() {
              return State;
       }

       public void setState(String State) {
              this.State = State;
       }

}
