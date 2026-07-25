// Get the elements
const scoreCard = document.getElementById("scorecard");
const overCard = document.getElementById("overcard");
const runCard = document.getElementById("runcard");

// Sample data
let score = 120;
let wickets = 3;
let overs = 15.2;
let currentRun = 4;

// Display data
scoreCard.innerHTML = `
    <h2>🏏 Score</h2>
    <p>${score}/${wickets}</p>
`;

overCard.innerHTML = `
    <h2>⏱ Overs</h2>
    <p>${overs}</p>
`;

runCard.innerHTML = `
    <h2>🏃 Last Ball</h2>
    <p>${currentRun} Run${currentRun > 1 ? "s" : ""}</p>
`;