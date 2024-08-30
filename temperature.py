def celsius_to_fahrenheit(celsius):
    """Converts Celsius to Fahrenheit."""
    fahrenheit = (celsius * 9/5) + 32
    return fahrenheit

def fahrenheit_to_celsius(fahrenheit):
    """Converts Fahrenheit to Celsius."""
    celsius = (fahrenheit - 32) * 5/9
    return celsius

def celsius_to_kelvin(celsius):
    """Converts Celsius to Kelvin."""
    kelvin = celsius + 273.15
    return kelvin

def kelvin_to_celsius(kelvin):
    """Converts Kelvin to Celsius."""
    celsius = kelvin - 273.15
    return celsius

def fahrenheit_to_kelvin(fahrenheit):
    """Converts Fahrenheit to Kelvin."""
    celsius = fahrenheit_to_celsius(fahrenheit)
    kelvin = celsius_to_kelvin(celsius)
    return kelvin

def kelvin_to_fahrenheit(kelvin):
    """Converts Kelvin to Fahrenheit."""
    celsius = kelvin_to_celsius(kelvin)
    fahrenheit = celsius_to_fahrenheit(celsius)
    return fahrenheit

def temperature_converter():
    """Main function to convert temperatures."""
    print("Welcome to the Temperature Converter!")
    print("Choose an option:")
    print("1. Celsius to Fahrenheit")
    print("2. Fahrenheit to Celsius")
    print("3. Celsius to Kelvin")
    print("4. Kelvin to Celsius")
    print("5. Fahrenheit to Kelvin")
    print("6. Kelvin to Fahrenheit")
    choice = int(input("Enter your choice (1-6): "))

    if choice == 1:
        celsius = float(input("Enter temperature in Celsius: "))
        fahrenheit = celsius_to_fahrenheit(celsius)
        print(f"{celsius} Celsius = {fahrenheit} Fahrenheit")
    elif choice == 2:
        fahrenheit = float(input("Enter temperature in Fahrenheit: "))
        celsius = fahrenheit_to_celsius(fahrenheit)
        print(f"{fahrenheit} Fahrenheit = {celsius} Celsius")
    elif choice == 3:
        celsius = float(input("Enter temperature in Celsius: "))
        kelvin = celsius_to_kelvin(celsius)
        print(f"{celsius} Celsius = {kelvin} Kelvin")
    elif choice == 4:
        kelvin = float(input("Enter temperature in Kelvin: "))
        celsius = kelvin_to_celsius(kelvin)
        print(f"{kelvin} Kelvin = {celsius} Celsius")
    elif choice == 5:
        fahrenheit = float(input("Enter temperature in Fahrenheit: "))
        kelvin = fahrenheit_to_kelvin(fahrenheit)
        print(f"{fahrenheit} Fahrenheit = {kelvin} Kelvin")
    elif choice == 6:
        kelvin = float(input("Enter temperature in Kelvin: "))
        fahrenheit = kelvin_to_fahrenheit(kelvin)
        print(f"{kelvin} Kelvin = {fahrenheit} Fahrenheit")
    else:
        print("Invalid choice. Please enter a number between 1 and 6.")

if __name__ == "__main__":
    temperature_converter()
