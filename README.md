# Hangman

***

Hangman is a simple guess the word game.
The Player then has to guess the letters that could appear in a word.
If a letter occurs in the word, the program enters the letter in all positions.
If the letter is not part of the word, the guesser gets a penalty point.
The penalty points are indicated by drawing a hangman. \
If you have reached 12 penalty points the round is over and the next word will appear.
When all the words in the list have had their turn, you will get a summary of lost and won rounds.

## Installation

***

### _Requirements_

- Java SDK 17
- IDE of yor choice

### _Installation_

1. Download the Project from GitHub
2. Start your IDE of your choice
3. Create a new Project
4. Replace the empty src folder with the [src](./src) folder from this Project

## Usage

***

### _Edit Word List_

- Click [here](./src/in.txt) to open the in.txt file to edit the word list.
- There can only be one word per line
- Words can only consist of the letters [A-Z] & [a-z].
- Numbers are not allowed.
- Spaces between words are ignored

### _Change look of Hangman_

***

1. Open the [OutputHangmen.java](./src/OutputHangmen.java) file.
2. Edit the String Arrays e.g.

  ```
hangmen[10] = "  ____\n" +
                " |/   |\n" +
                " |    O\n" +
                " |   /|\\\n" +
                " |   / \\\n" +
                "===\n";
```

3. Save file

## Contributing

***

If you have a suggestion for improvement, please feel free to contact me. \
You can also make revisions yourself by editing the [Hangmen.java](./src/Hangmen.java) file.

## Contact

***

**Harald Mandl** - [harald.mandl@outlook.com](mailto:harald.mandl@outlook.com) \
**GitHub** - https://github.com/MandlH \
**exercise1.md** - [click here](exercise1.md)  
**exercise2.md** - [click here](exercise2.md)   
**exercise3.md** - [click here](exercise3.md)  
**exercise4.md** - [click here](exercise4.md)    
**exercise5.md** - [click here](exercise5.md)    
**FH-Joanneum** - [https://www.fh-joanneum.at/](https://www.fh-joanneum.at/)

Log4j Configuration Tempalte - [resources/xml/log4j2.xml.template](resources/xml/log4j2.xml.template)
