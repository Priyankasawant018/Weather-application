import random
import string

def generate_password(length=12):
    """Generate a random password."""
    # Define the character sets to use in the password
    lowercase_letters = string.ascii_lowercase
    uppercase_letters = string.ascii_uppercase
    digits = string.digits
    special_characters = string.punctuation  # Feel free to customize this string for your needs

    # Combine all character sets to form the full set of characters to use
    all_characters = lowercase_letters + uppercase_letters + digits + special_characters

    # Ensure the password length is at least 6 characters
    length = max(length, 6)

    # Generate the password
    password = ''.join(random.sample(all_characters, length))
    return password

# Example usage:
password = generate_password()
print("Generated Password:", password)
