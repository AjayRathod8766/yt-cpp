enum gfg { welcome, to, geeksforgeeks }

void main() {
  var geek = gfg.geeksforgeeks;

  switch (geek) {
    case gfg.welcome:
      print("this is not correct case");
      break;
    case gfg.to:
      print("this is not correct case");
      break;
    case gfg.geeksforgeeks:
      print("this is a correct case ");
      break;
  }
}
