// Dart program to illustrate
// this keyword
// ignore_for_file: unused_local_variable

void main() {
  mob m1 = new mob();
  m1.Car('M010');
}

class mob {
  String mobile = "";
  Car(String mobile) {
    // use of this keyword
    this.mobile = mobile;
    print("The mobile is : ${mobile}");
  }
}
