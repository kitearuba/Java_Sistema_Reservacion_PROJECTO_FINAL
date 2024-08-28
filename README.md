---

# 🏢 **Java Reservation System Project**

![Java](https://img.shields.io/badge/Language-Java-blue?style=flat-square) ![HTML](https://img.shields.io/badge/Output-HTML-orange?style=flat-square) ![TXT](https://img.shields.io/badge/Input-TXT-green?style=flat-square)

Welcome to the **Java Reservation System** project repository! This project was developed to create a reservation system that processes data from text files and generates HTML output displaying the reservation information. Below, you’ll find an overview of the project, instructions on how to set it up, and more.

---

## 📑 **Table of Contents**

1. [📖 Introduction](#-introduction)
2. [🗂️ Project Structure](#%EF%B8%8F-project-structure)
3. [💻 Technologies Used](#-technologies-used)
4. [🛠️ Installation](#%EF%B8%8F-installation)
5. [🚀 Usage](#-usage)
6. [🤝 Contributing](#-contributing)
7. [🙌 Acknowledgements](#-acknowledgements)
8. [👨‍💻 Author](#-author)

---

## 📖 **Introduction**

The **Java Reservation System** (g_agenda) processes reservation requests from text files and generates HTML output displaying the daily agenda of various spaces such as **conference rooms** and **sports courts**. The system also logs any incidents during the reservation process to a file. The project demonstrates efficient file handling, internationalization support, and HTML generation using Java.

---

## 🗂️ **Project Structure**

The project is organized into Java classes and resources, with a focus on modular and clean architecture. Here’s a detailed breakdown of the directory structure:

```bash
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

### 📂 **Key Components:**

- **`src/`**: Contains the Java source code.
  - **`Main.java`**: The main entry point for running the program.
  - **`Reservas/`**: Includes classes responsible for:
    - **`RegistroGeneral.java`**: General reservation registry.
    - **`LecturaPeticiones.java`**: Handles reading reservation requests from files.
    - **`LecturaInternacional.java`**: Manages internationalization settings.
    - **`LecturaConfig.java`**: Reads configuration settings from `config.txt`.
    - **`Incidencias.java`**: Logs incidents encountered during the reservation process.
    - **`HtmlPublicar.java`**: Generates and publishes HTML files for viewing reservations.
    - **`HtmlCrearCodigo.java`**: Constructs HTML code for the reservation details.
    - **`ControlPeticiones.java`**: Handles the logic for processing requests.
- **`subject_files/`**: Contains example input files and configuration files for testing the program.
  - **`config.txt`**: Configuration file with settings for the reservation system.
  - **`peticions.txt`**: Contains the reservation requests.
  - **`internacional.CAT`** and **`internacional.ENG`**: Files for internationalization (Catalan and English).
  - **`incidencies.log`**: Log file for recording incidents.

---

## 💻 **Technologies Used**

The project leverages the following technologies:

- **Java**: The primary programming language used for implementing the system.
- **HTML**: Generated output for displaying reservation data in a browser.
- **TXT**: Input format for configuration and request data files.

---

## 🛠️ **Installation**

To set up the project locally, follow these steps:

1. **Clone the repository**:
   ```sh
   git clone https://github.com/yourusername/java-reservation-system.git
   ```

2. **Navigate to the project directory**:
   ```sh
   cd java-reservatioHere’s a revamped, polished, and more robust version of your **Java Reservation System** `README.md`. I’ve formatted it similarly to the 42 Piscine style while adding structure, content, and a few additional details for a professional and engaging look:

---

# 🏢 **Java Reservation System Project**

![Java](https://img.shields.io/badge/Language-Java-blue?style=flat-square) ![HTML](https://img.shields.io/badge/Output-HTML-orange?style=flat-square) ![TXT](https://img.shields.io/badge/Input-TXT-green?style=flat-square)

Welcome to the **Java Reservation System** project repository! This project was developed to create a reservation system that processes data from text files and generates HTML output displaying the reservation information. Below, you’ll find an overview of the project, instructions on how to set it up, and more.

---

## 📑 **Table of Contents**

1. [📖 Introduction](#-introduction)
2. [🗂️ Project Structure](#%EF%B8%8F-project-structure)
3. [💻 Technologies Used](#-technologies-used)
4. [🛠️ Installation](#%EF%B8%8F-installation)
5. [🚀 Usage](#-usage)
6. [🤝 Contributing](#-contributing)
7. [🙌 Acknowledgements](#-acknowledgements)
8. [👨‍💻 Author](#-author)

---

## 📖 **Introduction**

The **Java Reservation System** (g_agenda) processes reservation requests from text files and generates HTML output displaying the daily agenda of various spaces such as **conference rooms** and **sports courts**. The system also logs any incidents during the reservation process to a file. The project demonstrates efficient file handling, internationalization support, and HTML generation using Java.

---

## 🗂️ **Project Structure**

The project is organized into Java classes and resources, with a focus on modular and clean architecture. Here’s a detailed breakdown of the directory structure:

```bash
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

### 📂 **Key Components:**

- **`src/`**: Contains the Java source code.
  - **`Main.java`**: The main entry point for running the program.
  - **`Reservas/`**: Includes classes responsible for:
    - **`RegistroGeneral.java`**: General reservation registry.
    - **`LecturaPeticiones.java`**: Handles reading reservation requests from files.
    - **`LecturaInternacional.java`**: Manages internationalization settings.
    - **`LecturaConfig.java`**: Reads configuration settings from `config.txt`.
    - **`Incidencias.java`**: Logs incidents encountered during the reservation process.
    - **`HtmlPublicar.java`**: Generates and publishes HTML files for viewing reservations.
    - **`HtmlCrearCodigo.java`**: Constructs HTML code for the reservation details.
    - **`ControlPeticiones.java`**: Handles the logic for processing requests.
- **`subject_files/`**: Contains example input files and configuration files for testing the program.
  - **`config.txt`**: Configuration file with settings for the reservation system.
  - **`peticions.txt`**: Contains the reservation requests.
  - **`internacional.CAT`** and **`internacional.ENG`**: Files for internationalization (Catalan and English).
  - **`incidencies.log`**: Log file for recording incidents.

---

## 💻 **Technologies Used**

The project leverages the following technologies:

- **Java**: The primary programming language used for implementing the system.
- **HTML**: Generated output for displaying reservation data in a browser.
- **TXT**: Input format for configuration and request data files.

---

## 🛠️ **Installation**

To set up the project locally, follow these steps:

1. **Clone the repository**:
   ```sh
   git clone https://github.com/yourusername/java-reservation-system.git
   ```

2. **Navigate to the project directory**:
   ```sh
   cd java-reservation-system
   ```

---

## 🚀 **Usage**

To run the **Java Reservation System**, compile the Java source files and then execute the program as follows:

1. **Compile the Java files**:
   ```sh
   javac src/Main.java src/Reservas/*.java
   ```

2. **Run the main program**:
   ```sh
   java -cp src Main
   ```

Make sure the input files (e.g., `config.txt`, `peticions.txt`, and internationalization files) are correctly placed in the `subject_files` directory before running the program.

The program will process the reservations, generate HTML output files for the daily agenda, and log any incidents in the `incidencies.log` file.

---

## 🤝 **Contributing**

Contributions to this project are highly encouraged! Here’s how you can contribute:

1. **Fork the Project**: Create a personal copy of the repository by forking it.
2. **Create a New Branch**: Make your changes in a feature branch (`git checkout -b feature/AmazingFeature`).
3. **Commit Your Changes**: Keep your changes isolated to small, meaningful commits (`git commit -m 'Add new feature'`).
4. **Push to the Branch**: Push your feature branch to GitHub (`git push origin feature/AmazingFeature`).
5. **Open a Pull Request**: Submit your pull request for review.

Let’s collaborate and make this project better together!

---

## 🙌 **Acknowledgements**

Special thanks to the open-source community for their valuable resources and support during the development of this project. The contributions and shared knowledge from various developers have been instrumental in bringing this project to life.

---

## 👨‍💻 **Author**

**chrrodri**  
_42 Barcelona_  
[GitHub Profile](https://github.com/kitearuba)

---

### 🎉 **Final Notes**

The **Java Reservation System** showcases practical skills in file handling, HTML generation, and internationalization with Java. It's a flexible system that can be expanded and adapted for various reservation and scheduling needs. Feel free to explore the code, run the program, and contribute improvements. Happy coding! 🚀

---

This revamped `README.md` includes all the key elements of your project while ensuring a clear, professional, and visually engaging presentation. If you need further adjustments, feel free to ask!n-system
   ```

---

## 🚀 **Usage**

To run the **Java Reservation System**, compile the Java source files and then execute the program as follows:

1. **Compile the Java files**:
   ```sh
   javac src/Main.java src/Reservas/*.java
   ```

2. **Run the main program**:
   ```sh
   java -cp src Main
   ```

Make sure the input files (e.g., `config.txt`, `peticions.txt`, and internationalization files) are correctly placed in the `subject_files` directory before running the program.

The program will process the reservations, generate HTML output files for the daily agenda, and log any incidents in the `incidencies.log` file.

---

## 🤝 **Contributing**

Contributions to this project are highly encouraged! Here’s how you can contribute:

1. **Fork the Project**: Create a personal copy of the repository by forking it.
2. **Create a New Branch**: Make your changes in a feature branch (`git checkout -b feature/AmazingFeature`).
3. **Commit Your Changes**: Keep your changes isolated to small, meaningful commits (`git commit -m 'Add new feature'`).
4. **Push to the Branch**: Push your feature branch to GitHub (`git push origin feature/AmazingFeature`).
5. **Open a Pull Request**: Submit your pull request for review.

Let’s collaborate and make this project better together!

---

## 🙌 **Acknowledgements**

Special thanks to the open-source community for their valuable resources and support during the development of this project. The contributions and shared knowledge from various developers have been instrumental in bringing this project to life.

---

## 👨‍💻 **Author**

**chrrodri**  
_42 Barcelona_  
[GitHub Profile](https://github.com/kitearuba)

---

### 🎉 **Final Notes**

The **Java Reservation System** showcases practical skills in file handling, HTML generation, and internationalization with Java. It's a flexible system that can be expanded and adapted for various reservation and scheduling needs. Feel free to explore the code, run the program, and contribute improvements. Happy coding! 🚀

---
