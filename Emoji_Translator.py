def translate_to_emoji(text):
    return emoji.emojize(text, use_aliases=True)

def translate_from_emoji(text):
    return emoji.demojize(text)