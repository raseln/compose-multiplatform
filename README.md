# Compose Multiplatform

This is a sample project that demonstrates the usage of Compose Multiplatform UI framework with Kotlin Multiplatform Mobile (KMM) targetting Android and iOS. The app displays a grid of network images.


## Prerequisites

To run this project, you'll need the following:

- Android Studio (latest version)
- Xcode (for iOS development)
- Kotlin plugin for Android Studio


## Getting Started

1. Clone this repository to your local machine.
    ```text
    git clone https://github.com/raseln/compose-multiplatform.git
    ```

2. Open the project in Android Studio.

3. Set up your Android and iOS device/emulator/simulator.

4. Build and run the project.


## Project Structure

The project follows the standard Kotlin Multiplatform Mobile (KMM) structure, with the following notable files and directories:

- `shared`: Contains the shared code between Android and iOS platforms.
   - `src/commonMain`: Contains the common code, including the Compose-based UI implementation.
   - `src/androidMain`: Contains the Android-specific code.
   - `src/iosMain`: Contains the iOS-specific code.

- `android`: Contains the Android-specific configuration files.

- `ios`: Contains the iOS-specific configuration files.

- `build.gradle.kts`: The main Gradle build script for the project.


## Dependencies

This project utilizes the following dependencies:

- Kotlin Multiplatform Mobile (KMM)
- Compose Multiplatform UI
- <Add any other dependencies and their versions>

For more details about the dependencies and their versions, please refer to the `build.gradle.kts` file.


## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request. Please ensure that your contributions adhere to the project's coding style and guidelines.


## License

This project is licensed under the [MIT License](LICENSE).


## Acknowledgments

This project is based on the concepts and frameworks provided by Kotlin Multiplatform Mobile (KMM) and Jetpack Compose.

- [Kotlin Multiplatform Mobile](https://kotlinlang.org/lp/mobile/)
- [Jetpack Compose](https://developer.android.com/jetpack/compose)


## Resources

Here are some resources that might be helpful for learning more about Compose Multiplatform UI and KMM:

- [Kotlin Multiplatform Mobile Documentation](https://kotlinlang.org/docs/mobile/)
- [Jetpack Compose Documentation](https://developer.android.com/jetpack/compose/documentation)


