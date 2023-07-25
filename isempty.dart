void main() {
  var coffee = [];
  var teas = ['green', 'black', 'grey', 'red', 'redbull'];
  print(coffee.isEmpty);
  print(teas.isNotEmpty);

  //for each ()

  var laudteas = teas.map((tea) => tea.toUpperCase());
  laudteas.forEach(print);

}
