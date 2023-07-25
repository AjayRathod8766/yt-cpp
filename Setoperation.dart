void main() {
  //union
  //intersection
  //difference

  //declaring set 1
  var first = <String>{"GeeksForGeeks","Geek1","Geek2","Geek3"};
  print("printing values in set 1 are :");
  print(first);
  print(" ");

  //declaring set 2
  var second = <String>{"GeeksForGeeks","Geek3","Geek4","Geek5"};
  print(" values in set 2 are :");
  print(second);

  //performing operations on set

  //finding union
  print("union operation on set :${first.union(second)}\n");

  // finding intersection
  print("intersection operation on set :${first.intersection(second)}\n");

  // finding Difference
  print("difference operation on set${second.difference(first)}\n");
}
