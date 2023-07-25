//this keyword program
void main() {
  Student s1 = new Student("S001");
}

class Student {
  //definning local st_id variable
  var st_id;
  Student(st_id) {
    this.st_id = st_id;
    print("this is an example");
    print("the student id :${st_id}");
  }
}
