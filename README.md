# rockPaperScissors

Learned more about enhanced switch expression:

String results = switch (playerChoice + "-" + computerChoice) {
        case "rock-rock", "paper-paper", "scissors-scissors" -> "It's a tie!";
        case "rock-scissors", "paper-rock", "scissors-paper" -> "You win!";
        case "rock-paper", "paper-scissors", "scissors-rock" -> "Computer wins!";
        default -> "Unexpected result.";
};

how it can have multiplef labels like "rock-scissors" and used operates in the results "-".
