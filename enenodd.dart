bool evenodd(n) {
  if (n % 2 == 0) {
    return true;
  } else {
    return false;
  }
}

int main() {
  int n = 4;
  print(evenodd(n));
  return 0;
}
