public class main {

    public static void main (String[] arg){
        //Arrays.copyOfRange(Object[] src, int from, int to)
        double[] covidRates = {4.5, 8.8, 0.1, 3.9};
        /*double[] someCovidRates = Arrays.copyOfRange(covidRates, covidRates.length-3, covidRates.length);

        for (double rate:someCovidRates){
            System.out.println(rate);
        }*/
        reverseMyArray(covidRates);
        Student[] classlist = new Student[6];
        populateStudentsArray(classlist);

    }

    private static void populateStudentsArray(Student[] classlist) {
        for (int i = 0; i < classlist.length-1; i++){
            Student newStudent = new Student();
            newStudent.name = "Travis " + (i+1);
            classlist[i] = newStudent;
            System.out.println(classlist[i].name);
            System.out.println(classlist[i].height);
        }
    }

    private static void reverseMyArray(double[] covidRates) {
        double[] reverseArray = new double[4];
        int counter = 0;
        for (int i = covidRates.length-1; i > -1; i--){
            reverseArray[counter] = covidRates[i];
            System.out.println(reverseArray[counter]);
            counter++;
        }
    }
}

