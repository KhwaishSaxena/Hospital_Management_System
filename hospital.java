
import java.util.Scanner;

class Patient {

    private String name;
    private int age;
    private char gen;

    Patient(String n, int a, char g) {
        name = n;
        age = a;
        gen = g;
    }

    void setValue() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Patient's Name = ");
        name = input.nextLine();
        System.out.print("Enter Patient's age = ");
        age = input.nextInt();
        System.out.print("gender M/F/O = ");
        gen = input.next().charAt(0);
    }

    void display() {
        System.out.println("Patient's Name = " + name);
        System.out.println("Patient's age = " + age);
        System.out.println("Gender = " + gen);
    }

    void start() {
        for (int i = 1; i <= 60; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 1; i <= 60; i++) {
            System.out.print("-");
        }
        System.out.println("");
        for (int i = 1; i <= 60; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    void detail() {
        System.out.println("            DAYANAND MEDICAL COLLEGE & HOSPITAL");
        System.out.println("            Tagore Nagar, Ludhiana (Punjab)");
        System.out.println("            Phone number: 0161 469 7700");

    }
}

class hospital {

    public static void main(String arg[]) {
        char d = 'y', r;
        while (d == 'y' || d == 'Y') {
            Patient p = new Patient("rajni", 23, 'f');
            int num, choice;
            System.out.println("                Hospital management");
            p.setValue();
            System.out.println("");
            System.out.println("Which of the following disease do you have?");
            System.out.println("1. ENT(ear, nose and throat)");
            System.out.println("2. Dermatologists(skin, nails and hair)");
            System.out.println("3. Ophthalmologists(eye and vision care)");
            System.out.println("4. Cardiologists(heart and blood vessels)");
            System.out.println("5. Neurologists(nerves, spine and brain)");
            System.out.println("");
            System.out.print("Enter the number of your disease: ");
            Scanner input1 = new Scanner(System.in);
            num = input1.nextInt();
            switch (num) {
                case 1:
                    System.out.println("You have selected option 1 --Patient have disease regarding ear, nose or throat ");
                    System.out.println("");
                    System.out.println("Following doctor's for ENT: ");
                    System.out.println("1. Dr. Ajay Gupta");
                    System.out.println("2. Dr. Jyoti Sha");
                    System.out.println("3. Dr. Charu Jain");
                    System.out.println("");
                    System.out.print("Enter the number of doctor to whom you want to consult: ");
                    choice = input1.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Option one is selected");
                            System.out.println("");
                            p.start();
                            System.out.println("");
                            p.detail();
                            System.out.println("");
                            p.display();
                            System.out.println("");
                            System.out.println("Appointment is made with Dr. Ajay Gupta");
                            System.out.println("Specialisation: ENT");
                            System.out.println("");
                            p.start();
                            System.out.println("Want to continue? y/n");
                            r = input1.next().charAt(0);
                            if (r == 'y' || r == 'Y') {
                                d = r;
                            } else {
                                d = 'n';
                            }
                            break;

                        case 2:
                            System.out.println("Option two is selected");
                            System.out.println("");
                            p.start();
                            System.out.println("");
                            p.detail();
                            System.out.println("");
                            p.display();
                            System.out.println("");
                            System.out.println("Appointment is made with Dr. Ajay Gupta");
                            System.out.println("Specialisation: ENT");
                            System.out.println("");
                            p.start();
                            System.out.println("Want to continue? y/n");
                            r = input1.next().charAt(0);
                            if (r == 'y' || r == 'Y') {
                                d = r;
                            } else {
                                d = 'n';
                            }
                            break;

                        case 3:
                            System.out.println("Option three is selected");
                            System.out.println("");
                            p.start();
                            System.out.println("");
                            p.detail();
                            System.out.println("");
                            p.display();
                            System.out.println("");
                            System.out.println("Appointment is made with Dr. Ajay Gupta");
                            System.out.println("Specialisation: ENT");
                            System.out.println("");
                            p.start();
                            System.out.println("Want to continue? y/n");
                            r = input1.next().charAt(0);
                            if (r == 'y' || r == 'Y') {
                                d = r;
                            } else {
                                d = 'n';
                            }
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Following doctor's for Dermatologists: ");
                    System.out.println("1. Dr. Abhay thammn");
                    System.out.println("2. Dr. Jiwa Shan");
                    System.out.println("3. Dr. Chiya Malhotra");
                    System.out.println("");
                    System.out.print("Enter the number of doctor to whom you want to consult: ");
                    choice = input1.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Option one is selected");
                            System.out.println("");
                            p.start();
                            System.out.println("");
                            p.detail();
                            System.out.println("");
                            p.display();
                            System.out.println("");
                            System.out.println("Appointment is made with Dr. Abhay thammn");
                            System.out.println("Specialisation: Dermatologists");
                            System.out.println("");
                            p.start();
                            System.out.println("Want to continue? y/n");
                            r = input1.next().charAt(0);
                            if (r == 'y' || r == 'Y') {
                                d = r;
                            } else {
                                d = 'n';
                            }
                            break;

                        case 2:
                            System.out.println("Option two is selected");
                            System.out.println("");
                            p.start();
                            System.out.println("");
                            p.detail();
                            System.out.println("");
                            p.display();
                            System.out.println("");
                            System.out.println("Appointment is made with Dr. Jiwa Shan");
                            System.out.println("Specialisation: Dermatologists");
                            System.out.println("");
                            p.start();
                            System.out.println("Want to continue? y/n");
                            r = input1.next().charAt(0);
                            if (r == 'y' || r == 'Y') {
                                d = r;
                            } else {
                                d = 'n';
                            }
                            break;

                        case 3:
                            System.out.println("Option three is selected");
                            System.out.println("");
                            p.start();
                            System.out.println("");
                            p.detail();
                            System.out.println("");
                            p.display();
                            System.out.println("");
                            System.out.println("Appointment is made with Dr. Chiya Malhotra");
                            System.out.println("Specialisation:Dermatologists");
                            System.out.println("");
                            p.start();
                            System.out.println("Want to continue? y/n");
                            r = input1.next().charAt(0);
                            if (r == 'y' || r == 'Y') {
                                d = r;
                            } else {
                                d = 'n';
                            }
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Following doctor's for Ophthalmologists: ");
                    System.out.println("1. Dr. Harsh Jha");
                    System.out.println("2. Dr. Saral Saxena");
                    System.out.println("3. Dr. R.V Sharma");
                    System.out.println("");
                    System.out.print("Enter the number of doctor to whom you want to consult: ");
                    choice = input1.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Option one is selected");
                            System.out.println("");
                            p.start();
                            System.out.println("");
                            p.detail();
                            System.out.println("");
                            p.display();
                            System.out.println("");
                            System.out.println("Appointment is made with Dr. Harsh Jha");
                            System.out.println("Specialisation: Ophthalmologists");
                            System.out.println("");
                            p.start();
                            System.out.println("Want to continue? y/n");
                            r = input1.next().charAt(0);
                            if (r == 'y' || r == 'Y') {
                                d = r;
                            } else {
                                d = 'n';
                            }
                            break;

                        case 2:
                            System.out.println("Option two is selected");
                            System.out.println("");
                            p.start();
                            System.out.println("");
                            p.detail();
                            System.out.println("");
                            p.display();
                            System.out.println("");
                            System.out.println("Appointment is made with Dr. Saral Saxena");
                            System.out.println("Specialisation: Ophthalmologists");
                            System.out.println("");
                            p.start();
                            System.out.println("Want to continue? y/n");
                            r = input1.next().charAt(0);
                            if (r == 'y' || r == 'Y') {
                                d = r;
                            } else {
                                d = 'n';
                            }
                            break;

                        case 3:
                            System.out.println("Option three is selected");
                            System.out.println("");
                            p.start();
                            System.out.println("");
                            p.detail();
                            System.out.println("");
                            p.display();
                            System.out.println("");
                            System.out.println("Appointment is made with Dr. R.V Sharma");
                            System.out.println("Specialisation: Ophthalmologists");
                            System.out.println("");
                            p.start();
                            System.out.println("Want to continue? y/n");
                            r = input1.next().charAt(0);
                            if (r == 'y' || r == 'Y') {
                                d = r;
                            } else {
                                d = 'n';
                            }
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Following doctor's for Cardiologists: ");
                    System.out.println("1. Dr. Baldeep Singh");
                    System.out.println("2. Dr. Pankaj Sihag");
                    System.out.println("3. Dr. Rahul Kohli");
                    System.out.println("");
                    System.out.print("Enter the number of doctor to whom you want to consult: ");
                    choice = input1.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Option one is selected");
                            System.out.println("");
                            p.start();
                            System.out.println("");
                            p.detail();
                            System.out.println("");
                            p.display();
                            System.out.println("");
                            System.out.println("Appointment is made with Dr. Baldeep Singh");
                            System.out.println("Specialisation: Cardiologists");
                            System.out.println("");
                            p.start();
                            System.out.println("Want to continue? y/n");
                            r = input1.next().charAt(0);
                            if (r == 'y' || r == 'Y') {
                                d = r;
                            } else {
                                d = 'n';
                            }
                            break;

                        case 2:
                            System.out.println("Option two is selected");
                            System.out.println("");
                            p.start();
                            System.out.println("");
                            p.detail();
                            System.out.println("");
                            p.display();
                            System.out.println("");
                            System.out.println("Appointment is made with Dr. Pankaj Sihag");
                            System.out.println("Specialisation: Cardiologists");
                            System.out.println("");
                            p.start();
                            System.out.println("Want to continue? y/n");
                            r = input1.next().charAt(0);
                            if (r == 'y' || r == 'Y') {
                                d = r;
                            } else {
                                d = 'n';
                            }
                            break;

                        case 3:
                            System.out.println("Option three is selected");
                            System.out.println("");
                            p.start();
                            System.out.println("");
                            p.detail();
                            System.out.println("");
                            p.display();
                            System.out.println("");
                            System.out.println("Appointment is made with Dr. Rahul Kohli");
                            System.out.println("Specialisation: Cardiologists");
                            System.out.println("");
                            p.start();
                            System.out.println("Want to continue? y/n");
                            r = input1.next().charAt(0);
                            if (r == 'y' || r == 'Y') {
                                d = r;
                            } else {
                                d = 'n';
                            }
                            break;
                    }
                    break;

                case 5:
                    System.out.println("Following doctor's for Neurologists: ");
                    System.out.println("1. Dr. Anand Sehgal");
                    System.out.println("2. Dr. Savita Jain");
                    System.out.println("3. Dr. Mohamad Yamin");
                    System.out.println("");
                    System.out.print("Enter the number of doctor to whom you want to consult: ");
                    choice = input1.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Option one is selected");
                            System.out.println("");
                            p.start();
                            System.out.println("");
                            p.detail();
                            System.out.println("");
                            p.display();
                            System.out.println("");
                            System.out.println("Appointment is made with Dr. Anand Sehgal");
                            System.out.println("Specialisation: Neurologists");
                            System.out.println("");
                            p.start();
                            System.out.println("Want to continue? y/n");
                            r = input1.next().charAt(0);
                            if (r == 'y' || r == 'Y') {
                                d = r;
                            } else {
                                d = 'n';
                            }
                            break;

                        case 2:
                            System.out.println("Option two is selected");
                            System.out.println("");
                            p.start();
                            System.out.println("");
                            p.detail();
                            System.out.println("");
                            p.display();
                            System.out.println("");
                            System.out.println("Appointment is made with Dr. Savita Jain");
                            System.out.println("Specialisation: Neurologists");
                            System.out.println("");
                            p.start();
                            System.out.println("Want to continue? y/n");
                            r = input1.next().charAt(0);
                            if (r == 'y' || r == 'Y') {
                                d = r;
                            } else {
                                d = 'n';
                            }
                            break;

                        case 3:
                            System.out.println("Option three is selected");
                            System.out.println("");
                            p.start();
                            System.out.println("");
                            p.detail();
                            System.out.println("");
                            p.display();
                            System.out.println("");
                            System.out.println("Appointment is made with Dr. Mohamad Yamin");
                            System.out.println("Specialisation: Neurologists");
                            System.out.println("");
                            p.start();
                            System.out.println("Want to continue? y/n");
                            r = input1.next().charAt(0);
                            if (r == 'y' || r == 'Y') {
                                d = r;
                            } else {
                                d = 'n';
                            }
                            break;
                    }
                    break;

                default:
                    System.out.println("Please enter b/w 1 to 5 ");
            }
        }
    }
}
