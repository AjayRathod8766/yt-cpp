class Student {
  String name = "";
  int age = 0;

  String get stud_name {
    return name;
  }

  void set stud_name(String name) {
    this.name = name;
  }

  void set stud_age(int age) {
    if (age <= 0) {
      print("Age shouled be greater than 5");
    } else {
      this.age = age;
    }
  }

  int get stud_age {
    return age;
  }
}

void main() {
  Student s1 = new Student();
  s1.stud_name = "Ajay";
  s1.stud_age = 0;
  print(s1.stud_name);
  print(s1.stud_age);
}
