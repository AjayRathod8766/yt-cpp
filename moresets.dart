void main() {
  //first set
  var first = <String>{'Ajay', 'A1', 'A2', 'A3'};
  print("values set first : $first");

  //second set
  var second = <String>{'Ajay', 'A3', 'A4', 'A5', 'A6'};
  print("Values set second : $second");

  //third set
  var third = <String>{'Ajay', 'A6', 'A7', 'A8', 'A9'};
  print("Values set third : $third");

  //multiple union operation
  print("union operation :${first.union(second).union(third)}");

  //multiple intersection section
  print(
      "intersection operation: ${first.intersection(second).intersection(third)}");

  //multiple difference section
  print("difference operation : ${second.difference(first).difference(third)}");
}
