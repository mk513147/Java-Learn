## Patterns for solving problems

1. If the question has `sorted array` try **<u>Binary Search</u>**.
2. If the question has `from numbers 1-n, 0-n` and `solve in O(n) time complexity`try **<u>Count Sort</u>**.

## Maths/ Bitwise Operators

1. **<u>AND(&&)</u>** any binary number with 1 gives the number it self.
   - a & 1 = a
2. **<u>XOR(^)</u>** any binary number with 1 gives the complement(opposite) of that number.
   - a ^ 1 = $a'$
3. **<u>XOR(^)</u>** any binary number with 0 gives the number itself.
   - a ^ 0 = a
4. **<u>XOR(^)</u>** any binary number with itself gives 0.
   - a ^ a = 0
5. **<u>Left Shift(<<)</u>** it shifts the bit to the left and adds 0 to the right side of the binary number.
   - 10 << 1 = (1010)<sub>2</sub> << 1
   - = (10100)<sub>2</sub> = 20
   - So, **a << 1 = _2a_**
   - **a << b = a \* $2^b$**
6. **<u>Right Shift(>>)</u>** it shifts the bit to the right and adds 0 to the left side of the binary number. The number that is the right most after shifting gets removed.
   - (0011001)<sub>2</sub> >> 1
   - = (1100)<sub>2</sub>
   - **a >> b = a / $2^b$**

## Number System

1. **Decimal**
   - It has a base of 10. **_(Number)<sub>10</sub>_**
   - It goes from 0-9, 10-19 and so on.. .
2. **Binary**
   - It has a base of 2. **_(Number)<sub>2</sub>_**
   - It has only two digits 0 and 1.
3. **Octal**
   - It has a base of 8. **_(Number)<sub>8</sub>_**
   - It goes from 0-7, 10-17 and so on.. .
4. **Hexadecimal**
   - It has a base of 16. **_(Number)<sub>16</sub>_**
   - It goes from 0-9 and then A,B,C,D,E,F .
