/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function (s) {
  return abc(s, 0);
};

function abc(str, total) {
  const basicCases = {
    I: 1,
    V: 5,
    X: 10,
    L: 50,
    C: 100,
    D: 500,
    M: 1000,
  };

  const edgeCases = {
    IV: 4,
    IX: 9,
    XL: 40,
    XC: 90,
    CD: 400,
    CM: 900,
  };

  if (str.length === 0) return total;

  const firstTwoLetter = str[0] + str[1];
  const edgeCaseValue = edgeCases[firstTwoLetter];

  if (edgeCaseValue) {
    total += edgeCaseValue;
    str = str.replace(firstTwoLetter, "");
  } else {
    total += basicCases[str[0]];
    str = str.replace(str[0], "");
  }

  return abc(str, total);
}
