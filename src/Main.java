import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner scanner = new Scanner(System.in);

    static List<Person> studants = new ArrayList<Person>();

    public static void main(String[] args) {


        boolean exit = true;
        while (exit) {
            Person studant = new Person();

            System.out.println("Selecione a opção");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Buscar");
            System.out.println("3 - Remover");
            System.out.println("4 - Editar");
            System.out.println("5 - Exit");

            int option = scanner.nextInt();
            scanner.close();
            switch (option) {
                case 1:
                    addStudant(studants);
                    break;
                case 2:
                    System.out.println("Qual o nome que deseja buscar?");
                    scanner = new Scanner(System.in);
                    String nametofind = scanner.nextLine();
                    findStudant(studants, nametofind);
                    break;
                case 3:
                    removeStudant();
                    break;
                case 4:
                    editStudant();
                    break;
                case 5:
                    exit = false;
                    break;
            }
            System.out.println("Digite o nome completo do estudante");
            studant.name = scanner.nextLine();
            studants.add(studant);
            System.out.println("Obrigado por digitar o nome completo do " + studant.name);

            System.out.println("Deseja cadastrar mais um? 1/SIM E 2/NÃO");
            option = scanner.nextInt();
            if (option == 0) {
                exit = false;
            }
        }
    }


    private static void addStudant(List<Person> studants) {
        Person studant = new Person();
        Scanner scanner = new Scanner(System.in);

    }

    private static void buscarStudant(List<Person> studants) {
        System.out.println("Qual o nome que deseja buscar");
        String name = scanner.next();
        Integer position = findStudant(studants, name);
        if (position != null) {
        }
    }

    private static void removeStudant() {
        System.out.println("Qual o nome que deseja remover");
        String name = scanner.next();
        Integer position = findStudant(studants, name);
        if (position != null) {
            studants.remove(position.intValue());
        }
    }

    private static void editStudant() {
        System.out.println("Qual o nome que deseja editar?");
        String name = scanner.next();
        Integer position = findStudant(studants, name);
        if (position != null) {
            Person p1 = studants.get(position.intValue());
            System.out.println("Qual é o novo nome?");
            name = scanner.next();
            //studants.get(position.intValue()).name = name;
            p1.name = name;
        }
    }

    private static Integer findStudant(List<Person> studants, String studantName) {
        Integer position = null;
        for (int count = 0; count < studants.size(); count++) {
            Person student = studants.get(count);
            if (student.name.equals(studantName)) {
                position = count;
                System.out.println("Encontrei o " + studantName);
            }
        }
        return position;
    }
}
