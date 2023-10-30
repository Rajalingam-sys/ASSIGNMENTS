function reverseWordsInSentence(sentence) {
  const words = sentence.split(" ");
  const reversedWords = words.map((word) => {
    return word.split("").reverse().join("");
  });
  return reversedWords.join(" ");
}

const inputSentence = prompt("Enter a sentence:"); // Use the prompt function to get user input
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence);
