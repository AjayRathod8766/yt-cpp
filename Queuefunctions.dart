import 'dart:collection';

void main() {
  //creating a queuq
  Queue<String> geek = new Queue<String>();
  //adding elements to the queue
  geek.add("geeks");
  print(geek);

  //adding multiple element
  List<String> geek_data = ['geeks1', 'For'];
  geek.addAll(geek_data);
  print(geek);
  //deleting alll data
  geek.clear();
  print(geek);

  //adding last element
  geek.addLast("geeks");
  geek.addLast("for");
  print(geek);

  //check length of the queue
  print(geek.length);

  //remove lasst eleement from queue
  geek.removeLast();
  print(geek);
  //display all the element of the queue
  geek.forEach(print);
}
