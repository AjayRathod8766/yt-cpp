void main() {  //whare() collection method

  var teas = ['greeen', 'black', 'blue', 'orange', 'pink'];

  bool caffinated(String teaname) => teaname == 'black';

  print(teas.any(caffinated));
  print(!teas.every(caffinated));
}
