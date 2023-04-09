import model.Client;
import model.ClientDirector;
import model.Film;
import model.FilmDirector;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    private static FilmDirector filmDirector = new FilmDirector();
    private static ClientDirector clientDirector = new ClientDirector();
    static Scanner scanner = new Scanner(System.in);


    public static void start() {
        while (true) {
            System.out.println("1. Film Ekle");
            System.out.println("2. Film Sil");
            System.out.println("3. Film Ara");
            System.out.println("4. Kullanıcı Hesabı Oluştur");
            System.out.println("5. Kullanıcı Hesabı Sil");
            System.out.println("6. Kullanıcı Ara");
            System.out.println("7. Filmleri Listele");
            System.out.println("8. Kullanıcıları Listele");
            System.out.println("9. Çıkış");
            System.out.print("Bir seçenek girin: ");
            int choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 1:
                    addFilm();
                    break;
                case 2:
                    System.out.print("Silmek istediğiniz film ID'sini girin: ");
                    String filmId = scanner.nextLine();
                    filmDirector.removeFilm(filmId);
                    System.out.println("Film başarıyla silindi.");
                    break;
                case 3:
                    System.out.print("Aramak istediğiniz film başlığını girin: ");
                    String filmName = scanner.nextLine();
                    filmDirector.searchFilm(filmName);
                    break;
                case 4:
                    createClient();
                    break;
                case 5:
                    System.out.print("Silmek istediğiniz kullanıcı ID'sini girin: ");
                    int clientId = scanner.nextInt();
                    scanner.nextLine();
                    clientDirector.removeAccount(clientId);
                    break;
                case 6:
                    System.out.print("Aramak istediğiniz kullanıcı adını girin: ");
                    String clientName = scanner.nextLine();
                    clientDirector.searchAccount(clientName);
                    break;
                case 7:
                    String allFilms = filmDirector.toString();
                    System.out.println(allFilms);
                    break;
                case 8:
                    String allClients = clientDirector.toString();
                    System.out.println(allClients);
                    break;
                case 9:
                    System.out.println("Çıkılıyor...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Geçersiz bir seçenek girdiniz. Tekrar deneyin.");
                    break;
            }
        }
    }

    private static void createClient() {
        System.out.print("Id girin: ");
        int id = scanner.nextInt();

        System.out.print("Name girin: ");
        String name = scanner.next();
        scanner.nextLine();

        System.out.print("Password girin: ");
        String password = scanner.next();
        scanner.nextLine();

        System.out.print("Emailinizi girin: ");
        String email = scanner.nextLine();

        clientDirector.createAccount(new Client(id, name, password, email));
        System.out.println("Kullanıcı oluşturuldu!");
    }

    public static void addFilm() {
        System.out.print("Film Adı: ");
        String title = scanner.nextLine();

        System.out.print("Yönetmen: ");
        String director = scanner.nextLine();

        System.out.print("Oyuncular: ");
        ArrayList<String> actors = new ArrayList<>();
        actors.add(scanner.nextLine());

        System.out.print("Film Yıl: ");
        String releaseDate = scanner.next();

        System.out.print("Açıklama: ");
        String description = scanner.next();
        scanner.nextLine();

        System.out.print("Filmin Türü: ");
        String genre = scanner.nextLine();
        filmDirector.addFilm(new Film(title, director, actors, releaseDate, description, genre));
        System.out.println("Film başarıyla eklendi!");
    }
}
