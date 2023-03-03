package HomeWork14;

class Teacher {
    String name;
    int age;

    void teach() {
        System.out.println(name + " is teaching.");
    }

    void assess() {
        System.out.println(name + " is assessing students' performance.");
    }

    void advise() {
        System.out.println(name + " is giving advice to students.");
    }

    void grade() {
        System.out.println(name + " is grading students' assignments.");
    }
}

class MathTeacher extends Teacher {
    void teachMath() {
        System.out.println(name + " is teaching Math.");
    }
}

class ChemistryTeacher extends Teacher {
    void teachChemistry() {
        System.out.println(name + " is teaching Chemistry.");
    }
}

class PianoTeacher extends Teacher {
    void teachPiano() {
        System.out.println(name + " is teaching Piano.");
    }
}

class TeacherTester {
    public static void main(String[] args) {
        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.name = "Mr. Smith";
        mathTeacher.age = 35;
        System.out.println("Math Teacher: ");
        mathTeacher.teach();
        mathTeacher.teachMath();
        mathTeacher.assess();
        mathTeacher.advise();
        mathTeacher.grade();

        ChemistryTeacher chemistryTeacher = new ChemistryTeacher();
        chemistryTeacher.name = "Ms. Johnson";
        chemistryTeacher.age = 40;
        System.out.println("\nChemistry Teacher: ");
        chemistryTeacher.teach();
        chemistryTeacher.teachChemistry();
        chemistryTeacher.assess();
        chemistryTeacher.advise();
        chemistryTeacher.grade();

        PianoTeacher pianoTeacher = new PianoTeacher();
        pianoTeacher.name = "Ms. Davis";
        pianoTeacher.age = 30;
        System.out.println("\nPiano Teacher: ");
        pianoTeacher.teach();
        pianoTeacher.teachPiano();
        pianoTeacher.assess();
        pianoTeacher.advise();
        pianoTeacher.grade();
    }
}

