import 'dart:collection';

void main() {
  //creating list as string
  List<String> geek_list = ['geeks', 'for', 'geeks'];

  //assign list to queue
  Queue<String> geek_queue = new Queue<String>.from(geek_list);
  //print queue
  print(geek_queue);
}
