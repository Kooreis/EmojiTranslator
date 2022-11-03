```python
import emoji

def translate_to_emoji(text):
    return emoji.emojize(text, use_aliases=True)

def translate_from_emoji(text):
    return emoji.demojize(text)

def main():
    while True:
        print("\n1. Translate text to emoji")
        print("2. Translate emoji to text")
        print("3. Exit")
        choice = input("Enter your choice: ")

        if choice == '1':
            text = input("Enter text to translate: ")
            print("Translated text: ", translate_to_emoji(text))
        elif choice == '2':
            text = input("Enter emoji to translate: ")
            print("Translated emoji: ", translate_from_emoji(text))
        elif choice == '3':
            break
        else:
            print("Invalid choice. Please try again.")

if __name__ == "__main__":
    main()
```