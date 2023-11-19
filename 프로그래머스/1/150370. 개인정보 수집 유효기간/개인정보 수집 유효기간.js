// 실패한 풀이
// function solution(today, terms, privacies) {
//   let answer = [];
//   // 오늘 날짜 할당
//   let today_year = Number(today.split('.')[0]);
//   let today_month = Number(today.split('.')[1]);
//   let today_day = Number(today.split('.')[2]);
  
//   // 약관 종류와 유효기간을 객체로 묶어줌 ex) {"A": 6}
//   let terms_obj = {};
//   for(let i = 0; i < terms.length; i++) {
//     terms_obj[terms[i].split(" ")[0]] = terms[i].split(" ")[1];
//   };
  
//   for(let i = 0; i < privacies.length; i++) {
//     // 개인정보 수집일 계산
//     let collection_time = privacies[i].slice(0,-2).split('.');
//     let collection_year = Number(collection_time[0]);
//     let collection_month = Number(collection_time[1]);
//     let collection_day = Number(collection_time[2]);
    
//     // 개인정보 유효기간 계산
//     let expiration_year = collection_year;
//     let expiration_month = Number(terms_obj[privacies[i].charAt(privacies[i].length - 1)]) + collection_month;
//     let expiration_day = collection_day 
    
//     // 유효기간의 month가 12를 넘어가면 계산해서 재할당
//     if(expiration_month > 12) {
//       expiration_month = expiration_month % 12 === 0 
//                             ? 12
//                             : expiration_month % 12
//       expiration_year = expiration_year + 1;
//     };
//     // 유효기간의 day가 0보다 작거나 같으면 지난달로 계산해서 재할당
//     if(expiration_day <= 0) {
//       expiration_month = expiration_month - 1
//       expiration_day = 28 + expiration_day;
//     }
    

//     // 오늘 날짜와 유효기간 비교
//     if (today_year > expiration_year){
//       answer.push(i + 1)
//     } else if (today_year === expiration_year) {
//         if(today_month > expiration_month) {
//           answer.push(i + 1)
//         } else if (today_month === expiration_month) {
//             if (today_day >= expiration_day){
//               answer.push(i + 1)
//             }
//         }
//     }
//   }
//   return answer
// }

function solution(today, terms, privacies) {
  const answer = [];

  // 들어온 today를 Date형식으로 바꿔줍니다.
  // YYYY.MM.DD 포멧도 지원해서 그냥 넣기만 하면 변환됩니다.
  const expire = new Date(today);

  // terms를 쉽게 찾기위해 객체화해줍니다.
  const termType = {};
  terms.forEach((item) => {
    // split() 메서드로 분리한 타입과 기간을
    // 구조 분해 할당으로 변수화 한다.
    const [type, term] = item.split(" ");

    // 타입에 기간이 얼만지 객체로 생성한다.
    // ex) 'A': 6
    termType[type] = Number(term);
  });

  // 개인정보 수집일자를 확인한다.
  privacies.forEach((item, idx) => {
    // 위와 마찬가지로 구조 분해 할당을 한다.
    const [date, type] = item.split(" ");

    // 구한 date는 new Date() 메서드를 통해 Date 형식으로 변환한다.
    const chDate = new Date(date);

    // 그리고 Date의 매서드인 setMonth를 이용해
    // chDate의 현재 달 + 타입의 기간을 더한 값을 구한다.
    chDate.setMonth(chDate.getMonth() + termType[type]);

    // 마지막으로 오늘 날짜와 구한 유효기간을 비교해
    // 유효기간이 오늘 보다 작거나 같으면 answer에 번호를 푸쉬해준다.
    if (chDate <= expire) answer.push(idx + 1);
  });

  return answer;
}