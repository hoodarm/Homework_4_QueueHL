import ibadts.*;

public class Main {
    public static void main(String[] args) {
        Queue<String> queueBusiness = new Queue<>();
        String [] names1 = {"Sir_A", "Madam_B", "Rick_C", "Rick_J", "Batman", "Ironman"};
        queueBusiness.add(names1);

        Queue<String> queueEconomy = new Queue<>();
        String [] names2 = {"Sarah_A", "John_B", "Wendy_C", "Superman"};
        queueEconomy.add(names2);

        StringBuilder result = new StringBuilder();

        int counter = 0;
        while (!queueBusiness.isEmpty() && !queueEconomy.isEmpty()) {
            if (counter%3==2) {
                result.append(queueEconomy.dequeue());
                result.append(" ");
            }
            else
            {
                result.append(queueBusiness.dequeue());
                result.append(" ");
            }
            counter++;
        }

        if (queueEconomy.isEmpty())
        {
            while (!queueBusiness.isEmpty()){
                result.append(queueBusiness.dequeue());
                result.append(" ");
            }
        }

        if (queueBusiness.isEmpty())
        {
            while (!queueEconomy.isEmpty()) {
                result.append(queueEconomy.dequeue());
                result.append(" ");
            }
        }

        System.out.println(result);

    }
}