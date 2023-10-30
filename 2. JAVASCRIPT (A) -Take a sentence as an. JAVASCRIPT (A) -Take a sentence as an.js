function reverseWordsInSentence(sentence) {
  const words = [];
  let currentWord = "";
  for (let i = 0; i < sentence.length; i++) {
    if (sentence[i] === " " || i === sentence.length - 1) {
      // If a space is encountered or we reach the end of the sentence, reverse the current word.
      if (i === sentence.length - 1) {
        currentWord += sentence[i];
      }
      words.push(reverseWord(currentWord));
      currentWord = "";
    } else {
      currentWord += sentence[i];
    }
  }
  return words.join(" ");
}

function reverseWord(word) {
  let reversed = "";
  for (let i = word.length - 1; i >= 0; i--) {
    reversed += word[i];
  }
  return reversed;
}

const inputSentence = prompt("Enter a sentence:"); // Use the prompt function to get user input
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence);
