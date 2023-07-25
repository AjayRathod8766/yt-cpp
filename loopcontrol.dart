void main() {
  var count = 1;
  while (count <= 10) {
    print("you are in loop control body :$count");
    count++;

    if (count == 4) {
      // break;
      continue;
    }
  }
  //using do while loop
  do {
    print("Geek, you are inside loop $count");
    count++;

    if (count == 5) {
      // break;
      continue;
    }
  } while (count <= 10);
  print("Geek, you are out of do..while loop");
}
