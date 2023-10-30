function sortDescending(arr) {
  for (let i = 0; i < arr.length; i++) {
    for (let j = i + 1; j < arr.length; j++) {
      if (arr[i] < arr[j]) {
        // Swap elements if they are in the wrong order (descending order)
        const temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
  }
  return arr;
}

const input = prompt("Enter numbers separated by commas:");
let inputArray = [];
let currentNumber = "";
for (let i = 0; i < input.length; i++) {
  const char = input.charAt(i);
  if (char === ",") {
    // Found a comma, add the currentNumber to inputArray
    inputArray[inputArray.length] = Number(currentNumber);
    currentNumber = ""; // Reset currentNumber
  } else {
    currentNumber += char;
  }
}

// Add the last number (in case the input doesn't end with a comma)
if (currentNumber !== "") {
  inputArray[inputArray.length] = Number(currentNumber);
}

const sortedArray = sortDescending(inputArray);
console.log("Sorted array in descending order:", sortedArray);
