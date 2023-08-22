const fs = require('fs');

// Read the log file and parse messages
const logFile = fs.readFileSync('logfile.txt', 'utf-8');
//split the each line and store it in array
const logContents = logFile.split('\n');
const wordCounts = {}; //declare empty object to store the al user name and their word count
logContents.forEach(logContent => {
    const extractedNameAndMsg = logContent.match(/<(\w+)> (.+)/); //extract userName and msg using regular expression
    if (extractedNameAndMsg) {
        const userName = extractedNameAndMsg[1];
        const msgText = extractedNameAndMsg[2];
        const wordCount = msgText.split(' ').length;//get the word count of the msgText

        if (!wordCounts[userName]) { // if key already not exist, insert the key with 0 as value
            wordCounts[userName] = 0; 
        }
        wordCounts[userName] += wordCount; //append the word count as value for corresponding key
    }

    });
const sortedUserName = Object.keys(wordCounts).sort((a,b)=>wordCounts[b]-wordCounts[a]);

console.log(sortedUserName);
