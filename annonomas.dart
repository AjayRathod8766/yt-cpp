void main() {
  //anonymous functio in dart
  var list = ['shubham', 'nick', 'nova', 'jelly'];
  print("geeksforgeeks - anonymous function in dart");
  list.forEach((item) {
    print('${list.indexOf(item)} : $item');
  });
}
