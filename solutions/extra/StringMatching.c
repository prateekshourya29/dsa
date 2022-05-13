#include <stdio.h>

int hash_value(char value) {
  return (int) value - 96;
}

int hash_func(char arr[], int i, int j) {
  int ans = 0;
  while (i < j) {
    printf("%c", arr[i]);
    ans += hash_value(arr[i]);
    i++;
  }
  return ans;
}

int compare(char text[], int start, char pattern[], int pattern_size) {
  int j = 0;
  for (int i = start; i < start + pattern_size; i++) {
    if (text[i] == pattern[j]) {
      j++;
    } else return 0;
  }
  return 1;
}

int sliding_problem(char text[], char pattern[], int text_size, int pattern_size) {
  int match = 0;

  printf("\nPattern: ");
  int pattern_hash = hash_func(pattern, 0, pattern_size);
  printf("\nHash value of pattern is: %d\n", pattern_hash);

  for (int i = 0; i < text_size - pattern_size + 1; i++) {
    printf("\nCurrent Windows: ");
    int window_hash = hash_func(text, i, i + pattern_size);
    printf("\nHash value of current windows is: %d", window_hash);

    if (window_hash == pattern_hash) {
      printf("\nHash Value Mathced!");
      if (compare(text, i, pattern, pattern_size)) {
        match++;
        printf("\nPattern matched!");
      } else printf("\nPattern doesn't matched!");
    } else {
      printf("\nIt doesn't match!");
    }

    printf("\n");
  }

  return match;
}

int main() {
  int i;
  char temp;

  int text_size;
  printf("Enter size of the text: ");
  scanf("%d", &text_size);

  char text[text_size + 1];
  printf("Enter the text: ");
  scanf("%c", &temp);
  for (i = 0; i < text_size + 1; i++) {
    scanf("%c", &text[i]);
  }

  int pattern_size;
  printf("Enter size of the pattern: ");
  scanf("%d", &pattern_size);

  char pattern[pattern_size + 1];
  printf("Enter the pattern: ");
  scanf("%c", &temp);
  for (i = 0; i < pattern_size + 1; i++) {
    scanf("%c", &pattern[i]);
  }

  // // For testing
  // int text_size = 8;
  // char text[] = "aagbbcde\n";
  // int pattern_size = 3;
  // char pattern[] = "bcd\n";

  printf("\nText: ");
  for (int i = 0; i < text_size + 1; i++) {
    printf("%c", text[i]);
  }

  int total_match = sliding_problem(text, pattern, text_size, pattern_size);
  printf("\nTotal no of match: %d\n", total_match);

  return 0;
}