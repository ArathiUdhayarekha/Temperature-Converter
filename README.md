# Temperature Converter

## Overview
The Temperature Converter is a simple Java console application that allows users to convert temperatures between Celsius and Fahrenheit. The program prompts the user for a temperature value and the desired conversion direction, then displays the converted temperature.

## Features
- Converts temperatures from Celsius to Fahrenheit and vice versa.
- User-friendly console interface for input and output.
- Validates user input for conversion direction.

## Technologies Used
- Java (JDK 8 or higher)

## Getting Started
To run the Temperature Converter application locally, follow these steps:

1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd temperature-converter
   ```

2. **Compile the Java Program**:
   Open a terminal and navigate to the directory containing the `TemperatureConverter.java` file. Compile the program using:
   ```bash
   javac TemperatureConverter.java
   ```

3. **Run the Program**:
   After successful compilation, run the program using:
   ```bash
   java TemperatureConverter
   ```

4. **Follow the Prompts**:
   - Enter the temperature value when prompted.
   - Choose the conversion direction by entering `1` for Celsius to Fahrenheit or `2` for Fahrenheit to Celsius.

## Example Usage
```
Enter the temperature value: 25

Choose the conversion direction:
1. Celsius to Fahrenheit
2. Fahrenheit to Celsius
Enter your choice (1 or 2): 1

25.00°C is equal to 77.00°F.
```

## Code Explanation
- The program uses the `Scanner` class to read user input.
- It prompts the user to enter a temperature value and select a conversion direction.
- Based on the user's choice, it performs the appropriate conversion using the formulas:
  - Celsius to Fahrenheit: \( F = (C \times \frac{9}{5}) + 32 \)
  - Fahrenheit to Celsius: \( C = (F - 32) \times \frac{5}{9} \)
- The result is displayed with two decimal precision.

## Error Handling
- If the user enters an invalid choice (not 1 or 2), the program will display an error message and terminate gracefully.

## Contributing
Contributions are welcome! If you have suggestions for improvements or new features, please open an issue or submit a pull request.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments
- Inspired by the need for a simple tool to convert temperatures.
- Thanks to the Java community for resources and support.

---

