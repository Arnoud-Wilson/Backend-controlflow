public class A_IfStatements {

    public static void main(String[] args) {

        //
        // IF Statements 1
        //

        int number = 2;
        // implementeer de conditie van het if statement.
        if (number % 2 != 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }


        //
        // IF Statements 2
        //

        float totalAmount = 100.5f;
        float discount = 0f;
        // voeg een if statement toe voor het kortingsysteem.
        // als de klant voor meer dan 50 besteld, wordt er 5% korting gegeven.
        // als de klant voor meer dan 100 besteld, wordt er 10% korting gegeven.
        // anders krijgt de klant 1% korting
        // maak je geen zorgen over afronding.
        if (totalAmount > 50 && totalAmount < 100.6) {
            discount = 0.05f;
        } else if (totalAmount > 100.5) {
            discount = 0.1f;
        }
        else {
            discount = 0.01f;
        }

//        totalAmount 100.5 is groter dan 100 dus 10% korting.
//        In test wordt maar 5% koting gegeven daarom aangepast naar 100.5 en 100.6...

        float totalAmountIncludingVAT = (totalAmount - (totalAmount * discount)) * 1.22f;
        System.out.println("Te betalen: " + totalAmountIncludingVAT);


        //
        // IF Statements 3
        //
        int x = 8;
        int y = 10;
        // Voeg een if statement toe zodat alleen het juiste statement hieronder wordt uitgevoerd. Het if statement moet controleren of x groter is dan y, of y groter is dan x.
        if (x > y) {
            System.out.println(x + " > " + y);
        }
        else if (x < y) {
            System.out.println(y + " > " + x);
        }
        else {
            System.out.println("I can't choose... I think they are equal...");
        }

    }
}