void main() {
  //declaring set
  var gfg = <String>{'geeks', "geeks1", 'leet', 'hacker'};
  var geeksforgeeks = gfg.map((value) {
    return 'mapped $value';
  });

  print("value in map :");
  print(geeksforgeeks);
}
