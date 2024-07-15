# Java Reservation System Project

Welcome to the Java Reservation System project repository. This project was developed as part of a course to create a reservation system that processes data from text files and generates HTML output to display the reservation information.

## Table of Contents

- [Introduction](#introduction)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [Acknowledgements](#acknowledgements)

## Introduction

The Java Reservation System (g_agenda) reads input from configuration and request files, processes the data, and generates HTML files to display the daily agenda of various spaces such as conference rooms and sports courts. Additionally, it generates a log file for any incidents that occur during the reservation assignment process.

## Project Structure

The project is organized into several Java classes and resources. Here’s a brief overview of the structure:

```
.
├── src
│   ├── Main.java
│   ├── Reservas
│   │   ├── RegistroGeneral.java
│   │   ├── LecturaPeticiones.java
│   │   ├── LecturaInternacional.java
│   │   ├── LecturaConfig.java
│   │   ├── Incidencias.java
│   │   ├── HtmlPublicar.java
│   │   ├── HtmlCrearCodigo.java
│   │   └── ControlPeticiones.java
├── subject_files
│   ├── config.txt
│   ├── peticions.txt
│   ├── internacional.CAT
│   ├── internacional.ENG
│   └── incidencies.log
├── README.md
└── LICENSE
```

- **src**: Contains the source code files.
  - **Main.java**: The main entry point for the program.
  - **Reservas**: Contains various classes responsible for different parts of the system:
    - **RegistroGeneral.java**: General registry and management class.
    - **LecturaPeticiones.java**: Handles reading of request files.
    - **LecturaInternacional.java**: Manages internationalization.
    - **LecturaConfig.java**: Reads configuration settings.
    - **Incidencias.java**: Handles incidents and logs them.
    - **HtmlPublicar.java**: Publishes the HTML files.
    - **HtmlCrearCodigo.java**: Creates HTML code for the reservations.
    - **ControlPeticiones.java**: Controls the requests and reservations logic.
- **subject_files**: Contains the example and configuration text files.
  - **config.txt**: Configuration settings file.
  - **peticions.txt**: Requests for reservations.
  - **internacional.CAT**: Internationalization file for Catalan.
  - **internacional.ENG**: Internationalization file for English.
  - **incidencies.log**: Log file for incidents.

## Technologies Used

This project utilizes the following technologies:

- **Java**: Primary programming language.
- **HTML**: For generating the output files to display reservations.
- **TXT**: Text files for configuration and input data.

## Installation

To get a local copy up and running, follow these simple steps:

1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/java-reservation-system.git
   ```
2. Navigate to the project directory:
   ```sh
   cd java-reservation-system
   ```

## Usage

To run the program and generate the reservation schedules:

1. Compile the Java files:
   ```sh
   javac src/*.java src/Reservas/*.java
   ```
2. Run the main class:
   ```sh
   java -cp src Main
   ```

Make sure the input files (`config.txt`, `peticions.txt`, and the `internacional` files) are placed correctly in the `subject_files` directory.

## Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have suggestions for improving the project, please follow these steps:

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## Acknowledgements

- Special thanks to the open-source community for their valuable resources and support.
