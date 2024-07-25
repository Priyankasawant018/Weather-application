import requests

def get_weather(api_key, city):
    url = f"http://api.openweathermap.org/data/2.5/weather?q={city}&units=metric&appid={api_key}"
    response = requests.get(url)
    data = response.json()
    return data

def display_weather(data):
    if "name" not in data:
        print("City not found. Please check the city name.")
    else:
        city = data["name"]
        country = data["sys"]["country"]
        weather = data["weather"][0]["description"]
        temp = data["main"]["temp"]
        humidity = data["main"]["humidity"]
        print(f"Weather in {city}, {country}: {weather}")
        print(f"Temperature: {temp}°C")
        print(f"Humidity: {humidity}%")


def main():
    api_key = "95f3dcb70894de275c844ff0a8a10fb0"  # Replace with your actual API key
    city = input("Enter city name: ")
    weather_data = get_weather(api_key, city)
    display_weather(weather_data)

if __name__ == "__main__":
    main()


