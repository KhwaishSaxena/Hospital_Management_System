# Hospital Management System

This is a simple command-line based **Hospital Management System** built in Java. The system allows patients to input their details and select a doctor for consultation based on the type of disease they have. The program provides options to choose doctors from different specializations and books appointments accordingly.

## Features

- Input patient details (name, age, and gender).
- Display hospital information (name, location, and contact number).
- Select a disease category and book an appointment with a specialized doctor.
- List of available disease categories:
  1. ENT (Ear, Nose, Throat)
  2. Dermatologists (Skin, Hair, Nails)
  3. Ophthalmologists (Eye and Vision Care)
  4. Cardiologists (Heart and Blood Vessels)
  5. Neurologists (Brain, Nerves, Spine)

## How it Works

1. The program starts by prompting the patient to enter their personal details.
2. It displays a list of disease categories from which the patient can select their condition.
3. Based on the disease category, the system provides a list of specialized doctors.
4. The patient selects a doctor, and the system confirms the appointment.
5. After the appointment, the program allows the user to continue with new input or exit.

## Classes and Methods

### `Patient`
This class holds the patient information and methods to set and display patient details.

- **Attributes**:
  - `name`: Name of the patient.
  - `age`: Age of the patient.
  - `gen`: Gender of the patient (M/F/O).

- **Methods**:
  - `setValue()`: To input the patient's details.
  - `display()`: To display the patient's information.
  - `start()`: Displays a decorative separator for the output.
  - `detail()`: Displays hospital details (name, address, phone).

### `hospital`
The main class containing the logic for disease selection and doctor appointment booking.

- **Methods**:
  - Uses switch statements to handle disease selection and doctor appointment confirmation based on user input.

## Example Workflow

1. The patient enters their details.
2. The program presents the following diseases:
    - ENT
    - Dermatologists
    - Ophthalmologists
    - Cardiologists
    - Neurologists
3. The patient selects a disease category (e.g., ENT).
4. The program lists doctors available for that specialization.
5. The patient selects a doctor, and the appointment is confirmed.

## Requirements

- Java Development Kit (JDK) 8 or later.
- A terminal or command prompt to run the program.

## How to Run

1. Clone the repository or download the source code.
2. Compile the Java program:

   ```bash
   javac hospital.java
