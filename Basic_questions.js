'use strict';

// 1) WAP to print fibonaaci series with user input for number of terms
const num=7;

let a=0;
let b=1;

for (let i=0; i<num; i++) {
  console.log(a);
  let temp=a;
  a=b;
  b+=temp;
}

console.log("*******************");
// 2) WAP to print series of square of first n natural numbers
const num1=5;

for (let i=1; i<=num; i++) {
  console.log(i*i+" ");
}

console.log("*******************");


// 3) WAP to tell whether the enter number is prime or not
const n1=2;
let flag=false;

for (let i=2; i<n1; i++) {
  if (n1%i==0&&n1!==2) {
    flag=false;
    break;
  } else {
    flag=true;
  }
}

if (flag||n1===2) {
  console.log("prime");
} else {
  console.log("not prime");
}


console.log("*******************");
