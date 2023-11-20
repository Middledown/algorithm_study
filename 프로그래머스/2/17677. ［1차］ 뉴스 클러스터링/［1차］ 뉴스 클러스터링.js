function solution (str1, str2) {

  function explode(text) {
    const result = [];
    for (let i = 0; i < text.length - 1; i++) {
      const node = text.substr(i, 2);
      if (node.match(/[A-Za-z]{2}/)) {
        result.push(node.toLowerCase());
      }
    }
    return result;
  }

  const arr1 = explode(str1);
  const arr2 = explode(str2);
    
  const intersection = [];
  const union = [];
    
  for (let i = 0; i < arr2.length; i++) {
    if (arr1.indexOf(arr2[i]) >= 0) {
      intersection.push(arr1.splice(arr1.indexOf(arr2[i]), 1));
    }
    union.push(arr2[i]);
  }

  for (let i = 0; i < arr1.length; i++) {
    union.push(arr1[i]);
  }
  if (intersection.length === 0 && union.length === 0) {
    return 65536;
  }
  return parseInt(65536 * (intersection.length / union.length));
};