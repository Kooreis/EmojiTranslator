# Python Documentation

# Python Emoji Translator

This Python script provides a simple interface for translating text to emojis and vice versa. It uses the `emoji` library to perform the translations.

## Libraries Used

- `emoji`: This library provides functionalities to handle emojis. It can be used to emojize (convert aliases into emojis) and demojize (convert emojis into their respective aliases) text.

## How the Script Works

The script provides a simple loop interface where the user can choose to translate text to emoji, translate emoji to text, or exit the program.

1. **Translate text to emoji**: The user inputs a string of text, which may include emoji aliases (e.g., `:smile:`). The script then translates these aliases into their corresponding emojis and prints the result.

2. **Translate emoji to text**: The user inputs a string containing one or more emojis. The script translates these emojis into their corresponding aliases (e.g., `:smile:`) and prints the result.

3. **Exit**: The user can choose to exit the program.

## Functions

- `translate_to_emoji(text)`: This function takes a string of text as input and returns a string where all emoji aliases have been replaced with their corresponding emojis.

- `translate_from_emoji(text)`: This function takes a string containing one or more emojis as input and returns a string where all emojis have been replaced with their corresponding aliases.

- `main()`: This function provides the main loop interface for the script. It continuously prompts the user to choose an action (translate text to emoji, translate emoji to text, or exit) and performs the chosen action.

## Usage

To use this script, simply run it in a Python environment. You will be prompted to choose an action. Enter '1' to translate text to emoji, '2' to translate emoji to text, or '3' to exit the program.

---

# C# Documentation

# CSharp Emoji Translator

This is a simple console application written in CSharp that translates text-based emoticons into their corresponding emoji characters.

## Script Description

The script creates a dictionary of text-based emoticons and their corresponding emoji characters. It then enters a loop where it prompts the user to enter a text. The entered text is then scanned for any emoticons present in the dictionary and replaces them with their corresponding emoji characters. The translated text is then displayed to the user. This process continues indefinitely until the program is manually terminated.

## Libraries Used

The script uses two namespaces from the .NET Framework:

- `System`: This namespace contains fundamental classes and base classes that define commonly-used value and reference data types, events and event handlers, interfaces, attributes, and processing exceptions. In this script, it is used to handle standard input/output operations through the `Console` class.

- `System.Collections.Generic`: This namespace contains interfaces and classes that define generic collections, which allow users to create strongly typed collections that provide better type safety and performance than non-generic strongly typed collections. In this script, it is used to create a `Dictionary` that maps text-based emoticons to their corresponding emoji characters.

## Code Example

```CSharp
using System;
using System.Collections.Generic;

class Program
{
    static void Main(string[] args)
    {
        Dictionary<string, string> emojiDictionary = new Dictionary<string, string>
        {
            { ":)", "😊" },
            { ":(", "☹️" },
            // ... more mappings ...
        };

        while (true)
        {
            Console.Write("Enter a text: ");
            string input = Console.ReadLine();

            foreach (KeyValuePair<string, string> emoji in emojiDictionary)
            {
                input = input.Replace(emoji.Key, emoji.Value);
            }

            Console.WriteLine("Translated text: " + input);
        }
    }
}
```

This script is a fun and simple way to translate text-based emoticons into emoji characters. It can be extended to support more emoticons and emojis as needed.

---

# Java Documentation

# Emoji Translator in Java

This Java script is a simple text to emoji translator. It takes a string of text as input and replaces certain character combinations (like ":)", ":(", etc.) with their corresponding emoji.

## How it Works

The script uses a `HashMap` to store the character combinations and their corresponding emojis. When the user enters a string of text, the script splits the string into an array of words. It then iterates over each word in the array. If the word is a key in the `HashMap`, the script replaces the word with the corresponding emoji. If the word is not a key in the `HashMap`, the script leaves the word as it is. The script then joins the words back together into a single string and prints the translated text.

## Imported Libraries

- `java.util.HashMap`: This is a class from Java's standard library. A `HashMap` stores key-value pairs. In this script, the keys are character combinations and the values are emojis. The `HashMap` allows the script to quickly look up the emoji for a given character combination.

- `java.util.Map`: This is an interface from Java's standard library. It represents a mapping between a set of keys and a set of values. In this script, it is used to declare the type of the `emojiMap` variable.

- `java.util.Scanner`: This is a class from Java's standard library. A `Scanner` breaks up an input into tokens using a delimiter pattern. In this script, the `Scanner` is used to read the user's input from the console.

## Usage

To use the script, simply run it and enter a string of text when prompted. The script will print the translated text. For example, if you enter "Hello :)", the script will print "Hello 😃".

---
