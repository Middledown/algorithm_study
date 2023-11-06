function solution(topping) {

    const length = topping.length;
    if (length === 1) return 0;

    const bigDict = {};
    const smallDict = {};
    let bigTopping = 0;
    let smallTopping = 0;
    let answer = 0;

    if (length === 1) return 0;

    for (let i = 0; i < length; i++) {
        if (!bigDict[topping[i]]) {
            bigDict[topping[i]] = 1;
            bigTopping++;
        } else bigDict[topping[i]]++;
    }

    for (let i = length - 1; i >= 0; i--) {
        if (!smallDict[topping[i]]) {
            smallDict[topping[i]] = 1;
            bigDict[topping[i]]--;
            smallTopping++;
            if (bigDict[topping[i]] === 0) {
                bigTopping--;
            }
        } else {
            smallDict[topping[i]]++;
            bigDict[topping[i]]--;
            if (bigDict[topping[i]] === 0) {
                bigTopping--;
            }
        }
        if (bigTopping === smallTopping) {
          answer++;
        }
    }
    return answer;
}