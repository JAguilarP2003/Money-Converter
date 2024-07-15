
---
# Money-Converter

Money-Converter is a simple Java console application that allows users to convert currencies using the ExchangeRate-API service.

## Features

- Supports conversion between USD, COP (Colombian Peso), and BRL (Brazilian Real).
- Uses an external API (ExchangeRate-API) to fetch live exchange rates.
- Provides a menu-driven interface for users to select conversion options.
- Handles exceptions gracefully for API errors and user input validation.

## Requirements

- Java 8 or higher
- API Key from [ExchangeRate-API](https://www.exchangerate-api.com/)
- Internet connection for API calls

## Setup

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your/repository.git
   cd Money-Converter
   ```

2. **Set your API Key:**

   You need to set your ExchangeRate-API key as an environment variable named `API_KEY`.

   ```bash
   export API_KEY="your_api_key_here"
   ```

3. **Download and add Gson library:**

    - Download Gson from [Maven Central Repository](https://search.maven.org/artifact/com.google.code.gson/gson).
    - Add the Gson JAR file to your project's classpath or use a build tool like Maven or Gradle to manage dependencies.


4. **Compile and run the application:**

   ```bash
   javac -cp ".:gson.jar" Main.java
   java -cp ".:gson.jar" Main
   ```

   Replace `gson.jar` with the actual Gson library filename.


5. **Usage:**

   - Follow the on-screen menu to select the currency conversion you want. 
   - Enter the amount you want to convert. 
   - The application will display the converted amount based on the latest exchange rates fetched from the API.


6. **Exit:**

   Enter `7` to exit the application.

## Notes

- Make sure your API key (`API_KEY`) is valid and has access to the ExchangeRate-API service.
- Handle exceptions that may occur due to network issues or invalid API responses.
- Ensure Gson library (`gson.jar`) is correctly referenced in your project's classpath.
---
